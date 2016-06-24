package org.isidoro.app.messenger.contactlist;

import org.isidoro.app.messenger.contactlist.events.ContactListEvent;

/**
 * Created by avalo.
 */
public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    String getCurrentUserEmail();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);
}
