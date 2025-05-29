package com.hcondor.t2_condorlunahimerjerly.ui.mascota

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.hcondor.t2_condorlunahimerjerly.data.model.Mascota

class MascotaListViewModel : ViewModel() {

    private val _mascotas = MutableLiveData<List<Mascota>>()
    val mascotas: LiveData<List<Mascota>> = _mascotas

    fun obtenerMascotas() {
        FirebaseFirestore.getInstance().collection("mascotas")
            .get()
            .addOnSuccessListener { result ->
                val listaMascotas = result.map { document ->
                    Mascota(
                        id = document.id,
                        name = document.getString("name") ?: "",
                        description = document.getString("description") ?: "",
                        price = (document.getDouble("price") ?: 0.0).toInt(),
                        imageUrl = document.getString("imageUrl") ?: "",
                        ownerId = document.getString("ownerId") ?: ""
                    )
                }
                _mascotas.value = listaMascotas
            }
            .addOnFailureListener {
                _mascotas.value = emptyList() // Limpia la lista si hay error
            }
    }

    fun eliminarMascota(mascotaId: String) {
        FirebaseFirestore.getInstance().collection("mascotas")
            .document(mascotaId)
            .delete()
            .addOnSuccessListener {
                obtenerMascotas() // Refrescar la lista
            }
            .addOnFailureListener {
                // Manejo de errores opcional
            }
    }
}
