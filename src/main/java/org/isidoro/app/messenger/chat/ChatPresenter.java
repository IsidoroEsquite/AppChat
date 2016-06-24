package org.isidoro.app.messenger.chat;

import org.isidoro.app.messenger.chat.events.ChatEvent;

/**
 * Created by avalo.
 */
public interface ChatPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void setChatRecipient(String recipient);
    void sendMessage(String msg);
    void onEventMainThread(ChatEvent event);
}
