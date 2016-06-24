package org.isidoro.app.messenger.login;

/**
 * Created by avalo.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
