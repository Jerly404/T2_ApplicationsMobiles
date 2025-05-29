package com.hcondor.t2_condorlunahimerjerly.ui.mascota

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.hcondor.t2_condorlunahimerjerly.data.model.Mascota
import com.hcondor.t2_condorlunahimerjerly.data.repository.AuthRepository
import com.hcondor.t2_condorlunahimerjerly.data.repository.MascotaRepository
import kotlinx.coroutines.launch

class MascotaAddEditViewModel(
    private val mascotaRepository: MascotaRepository,
    private val authRepository: AuthRepository,
    private val firestore: FirebaseFirestore,
    private val firebaseAuth: FirebaseAuth
) : ViewModel() {

    private val _guardarResultado = MutableLiveData<Boolean>()
    val guardarResultado: LiveData<Boolean> = _guardarResultado

    fun savePet(mascota: Mascota) {
        val mascotaId = firestore.collection("mascotas").document().id
        firestore.collection("mascotas").document(mascotaId)
            .set(mascota.copy(id = mascotaId))
            .addOnSuccessListener {
                _guardarResultado.value = true
            }
            .addOnFailureListener {
                _guardarResultado.value = false
            }
    }

}
