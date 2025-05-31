package com.hcondor.t2_condorlunahimerjerly.ui.mascota;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000fR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/hcondor/t2_condorlunahimerjerly/ui/mascota/MascotaAddEditViewModel;", "Landroidx/lifecycle/ViewModel;", "mascotaRepository", "Lcom/hcondor/t2_condorlunahimerjerly/data/repository/MascotaRepository;", "authRepository", "Lcom/hcondor/t2_condorlunahimerjerly/data/repository/AuthRepository;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "(Lcom/hcondor/t2_condorlunahimerjerly/data/repository/MascotaRepository;Lcom/hcondor/t2_condorlunahimerjerly/data/repository/AuthRepository;Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/auth/FirebaseAuth;)V", "_guardarResultado", "Landroidx/lifecycle/MutableLiveData;", "", "_mascota", "Lcom/hcondor/t2_condorlunahimerjerly/data/model/Mascota;", "guardarResultado", "Landroidx/lifecycle/LiveData;", "getGuardarResultado", "()Landroidx/lifecycle/LiveData;", "mascota", "getMascota", "cargarMascotaPorId", "", "id", "", "savePet", "app_debug"})
public final class MascotaAddEditViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.hcondor.t2_condorlunahimerjerly.data.repository.MascotaRepository mascotaRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.hcondor.t2_condorlunahimerjerly.data.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _guardarResultado = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> guardarResultado = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> _mascota = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> mascota = null;
    
    public MascotaAddEditViewModel(@org.jetbrains.annotations.NotNull()
    com.hcondor.t2_condorlunahimerjerly.data.repository.MascotaRepository mascotaRepository, @org.jetbrains.annotations.NotNull()
    com.hcondor.t2_condorlunahimerjerly.data.repository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebaseAuth) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getGuardarResultado() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hcondor.t2_condorlunahimerjerly.data.model.Mascota> getMascota() {
        return null;
    }
    
    public final void savePet(@org.jetbrains.annotations.NotNull()
    com.hcondor.t2_condorlunahimerjerly.data.model.Mascota mascota) {
    }
    
    public final void cargarMascotaPorId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}