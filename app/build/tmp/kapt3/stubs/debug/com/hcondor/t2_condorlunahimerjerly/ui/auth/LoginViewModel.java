package com.hcondor.t2_condorlunahimerjerly.ui.auth;

/**
 * ViewModel para la pantalla de inicio de sesión (Login).
 * Maneja la lógica de negocio relacionada con la autenticación del usuario.
 * Interactúa con AuthRepository para realizar operaciones de inicio de sesión.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/hcondor/t2_condorlunahimerjerly/ui/auth/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/hcondor/t2_condorlunahimerjerly/data/repository/AuthRepository;", "(Lcom/hcondor/t2_condorlunahimerjerly/data/repository/AuthRepository;)V", "_isUserLoggedIn", "Landroidx/lifecycle/MutableLiveData;", "", "_loginResult", "Lkotlin/Result;", "isUserLoggedIn", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "loginResult", "getLoginResult", "checkUserLoggedIn", "", "login", "email", "", "password", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.hcondor.t2_condorlunahimerjerly.data.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Result<java.lang.Boolean>> _loginResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<kotlin.Result<java.lang.Boolean>> loginResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isUserLoggedIn = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isUserLoggedIn = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.hcondor.t2_condorlunahimerjerly.data.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Result<java.lang.Boolean>> getLoginResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isUserLoggedIn() {
        return null;
    }
    
    /**
     * Intenta iniciar sesión con el correo electrónico y la contraseña proporcionados.
     * Los resultados se publican en _loginResult.
     * @param email El correo electrónico del usuario.
     * @param password La contraseña del usuario.
     */
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    /**
     * Verifica si hay un usuario actualmente autenticado y actualiza el LiveData _isUserLoggedIn.
     */
    private final void checkUserLoggedIn() {
    }
}