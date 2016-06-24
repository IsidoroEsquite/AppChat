package org.isidoro.app.messenger.addcontact;

import org.isidoro.app.messenger.addcontact.events.AddContactEvent;

/**
 * Created by avalo.
 */
public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
