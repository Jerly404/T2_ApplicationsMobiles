package com.hcondor.t2_condorlunahimerjerly.data.repository

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.hcondor.t2_condorlunahimerjerly.data.model.Mascota
import kotlinx.coroutines.tasks.await

class MascotaRepository(
    private val firestore: FirebaseFirestore,
    private val firebaseAuth: FirebaseAuth
) {

    private val petsCollection = firestore.collection("pets")

    suspend fun addPet(pet: Mascota): Result<Unit> {
        return try {
            val currentUserId = firebaseAuth.currentUser?.uid
                ?: return Result.failure(Exception("Usuario no autenticado"))

            val newDoc = petsCollection.document()
            val petWithIdAndOwner = pet.copy(id = newDoc.id, ownerId = currentUserId)
            newDoc.set(petWithIdAndOwner).await()
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun updatePet(pet: Mascota): Result<Unit> {
        return try {
            petsCollection.document(pet.id).set(pet).await()
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun deletePet(petId: String): Result<Unit> {
        return try {
            petsCollection.document(petId).delete().await()
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    // Esta función ya no necesita parámetro porque usa el usuario actual
    suspend fun getUserPets(): Result<List<Mascota>> {
        return try {
            val currentUserId = firebaseAuth.currentUser?.uid
                ?: return Result.failure(Exception("Usuario no autenticado"))

            val snapshot = petsCollection
                .whereEqualTo("ownerId", currentUserId)
                .get().await()

            val pets = snapshot.toObjects(Mascota::class.java)
            Result.success(pets)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
