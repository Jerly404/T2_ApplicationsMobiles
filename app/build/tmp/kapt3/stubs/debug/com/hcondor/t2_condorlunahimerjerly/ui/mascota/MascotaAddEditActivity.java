package com.hcondor.t2_condorlunahimerjerly.ui.mascota;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019H\u0002J\u0012\u0010%\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u0019H\u0002J0\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/hcondor/t2_condorlunahimerjerly/ui/mascota/MascotaAddEditActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "descriptionEditText", "Landroid/widget/EditText;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "imageUri", "Landroid/net/Uri;", "imageUrlEditText", "imageView", "Landroid/widget/ImageView;", "mascotaAddEditViewModel", "Lcom/hcondor/t2_condorlunahimerjerly/ui/mascota/MascotaAddEditViewModel;", "getMascotaAddEditViewModel", "()Lcom/hcondor/t2_condorlunahimerjerly/ui/mascota/MascotaAddEditViewModel;", "mascotaAddEditViewModel$delegate", "Lkotlin/Lazy;", "mascotaExistente", "Lcom/hcondor/t2_condorlunahimerjerly/data/model/Mascota;", "nameEditText", "pickImageLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "priceEditText", "tipoSpinner", "Landroid/widget/Spinner;", "guardarMascota", "", "name", "description", "price", "", "imageUrl", "tipo", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showToast", "message", "uploadImageToFirebase", "uri", "app_debug"})
public final class MascotaAddEditActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth firebaseAuth = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri imageUri;
    @org.jetbrains.annotations.Nullable()
    private com.hcondor.t2_condorlunahimerjerly.data.model.Mascota mascotaExistente;
    private android.widget.Spinner tipoSpinner;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mascotaAddEditViewModel$delegate = null;
    private android.widget.ImageView imageView;
    private android.widget.EditText nameEditText;
    private android.widget.EditText descriptionEditText;
    private android.widget.EditText priceEditText;
    private android.widget.EditText imageUrlEditText;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> pickImageLauncher = null;
    
    public MascotaAddEditActivity() {
        super();
    }
    
    private final com.hcondor.t2_condorlunahimerjerly.ui.mascota.MascotaAddEditViewModel getMascotaAddEditViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void uploadImageToFirebase(android.net.Uri uri, java.lang.String name, java.lang.String description, int price, java.lang.String tipo) {
    }
    
    private final void guardarMascota(java.lang.String name, java.lang.String description, int price, java.lang.String imageUrl, java.lang.String tipo) {
    }
    
    private final void showToast(java.lang.String message) {
    }
}