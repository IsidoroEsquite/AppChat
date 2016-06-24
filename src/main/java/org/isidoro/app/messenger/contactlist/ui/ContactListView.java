package org.isidoro.app.messenger.contactlist.ui;

import org.isidoro.app.messenger.entities.User;

/**
 * Created by avalo.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
