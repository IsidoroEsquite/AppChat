package org.isidoro.app.messenger.chat.ui;

import org.isidoro.app.messenger.entities.ChatMessage;

/**
 * Created by avalo.
 */
public interface ChatView {
    void onMessageReceived(ChatMessage msg);
}
