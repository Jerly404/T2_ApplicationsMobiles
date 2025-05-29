package com.hcondor.t2_condorlunahimerjerly.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.hcondor.t2_condorlunahimerjerly.data.model.Mascota
import kotlinx.coroutines.tasks.await

class MascotaRepository(private val firestore: FirebaseFirestore) {

    private val petsCollection = firestore.collection("pets")

    suspend fun addPet(pet: Mascota): Result<Unit> {
        return try {
            val newDoc = petsCollection.document()
            val petWithId = pet.copy(id = newDoc.id)
            newDoc.set(petWithId).await()
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

    suspend fun getPetsByOwner(ownerId: String): Result<List<Mascota>> {
        return try {
            val snapshot = petsCollection.whereEqualTo("ownerId", ownerId).get().await()
            val pets = snapshot.toObjects(Mascota::class.java)
            Result.success(pets)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
