package org.isidoro.app.messenger.contactlist;

/**
 * Created by avalo.
 */
public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}
