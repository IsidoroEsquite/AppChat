package org.isidoro.app.messenger.login;

/**
 * Created by avalo.
 */
public interface LoginRepository {
    void signUp(String email, String password);
    void signIn(String email, String password);
    void checkSession();
}
