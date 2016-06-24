package org.isidoro.app.messenger.contactlist;

/**
 * Created by avalo.
 */
public interface ContactListInteractor {
    void subscribe();
    void unsubscribe();
    void destroyListener();
    void removeContact(String email);
}
