package org.isidoro.app.messenger.addcontact;

import org.greenrobot.eventbus.Subscribe;

import org.isidoro.app.messenger.addcontact.events.AddContactEvent;
import org.isidoro.app.messenger.addcontact.ui.AddContactView;
import org.isidoro.app.messenger.lib.EventBus;
import org.isidoro.app.messenger.lib.GreenRobotEventBus;

/**
 * Created by avalo.
 */
public class AddContactPresenterImpl implements AddContactPresenter {
    private EventBus eventBus;
    private AddContactView view;
    private AddContactInteractor interactor;

    public AddContactPresenterImpl(AddContactView view) {
        this.view = view;
        this.eventBus = GreenRobotEventBus.getInstance();
        this.interactor = new AddContactInteractorImpl();
    }

    @Override
    public void onShow() {
        eventBus.register(this);
    }

    @Override
    public void onDestroy() {
        view = null;
        eventBus.unregister(this);
    }

    @Override
    public void addContact(String email) {
        if(view != null){
            view.hideInput();
            view.showProgress();
        }
        interactor.execute(email);
    }

    @Override
    @Subscribe
    public void onEventMainThread(AddContactEvent event) {
        if(view != null){
            view.hideProgress();
            view.showInput();

            if(event.isError()){
                view.contactNotAdded();
            } else {
                view.contactAdded();
            }
        }
    }
}
