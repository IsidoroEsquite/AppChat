package org.isidoro.app.messenger.contactlist;

/**
 * Created by avalo.
 */
public interface ContactListRepository {
    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void destroyListener();
    void subscribeToContactListEvents();
    void unsubscribeToContactListEvents();
    void changeConnectionStatus(boolean online);
}
