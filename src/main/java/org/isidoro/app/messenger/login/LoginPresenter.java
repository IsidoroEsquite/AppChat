package org.isidoro.app.messenger.login;

import org.isidoro.app.messenger.login.events.LoginEvent;

/**
 * Created by avalo.
 */
public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void onResume();
    void onPause();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
    void onEventMainThread(LoginEvent event);
}
