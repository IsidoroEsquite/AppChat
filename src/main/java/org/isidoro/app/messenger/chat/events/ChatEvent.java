package org.isidoro.app.messenger.chat.events;

import org.isidoro.app.messenger.entities.ChatMessage;

/**
 * Created by avalo.
 */
public class ChatEvent {
    private ChatMessage message;

    public ChatMessage getMessage() {
        return message;
    }

    public void setMessage(ChatMessage message) {
        this.message = message;
    }
}
