package org.isidoro.app.messenger.contactlist;

/**
 * Created by avalo.
 */
public class ContactListInteractorImpl implements ContactListInteractor {
    org.isidoro.app.messenger.contactlist.ContactListRepository repository;

    public ContactListInteractorImpl() {
        repository = new org.isidoro.app.messenger.contactlist.ContactListRepositoryImpl();
    }

    @Override
    public void subscribe() {
        repository.subscribeToContactListEvents();
    }

    @Override
    public void unsubscribe() {
        repository.unsubscribeToContactListEvents();
    }

    @Override
    public void destroyListener() {
        repository.destroyListener();
    }

    @Override
    public void removeContact(String email) {
        repository.removeContact(email);
    }
}
