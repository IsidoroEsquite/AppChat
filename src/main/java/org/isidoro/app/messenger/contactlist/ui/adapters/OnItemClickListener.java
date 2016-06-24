package org.isidoro.app.messenger.contactlist.ui.adapters;

import org.isidoro.app.messenger.entities.User;

/**
 * Created by avalo.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}
