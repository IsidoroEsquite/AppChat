package org.isidoro.app.messenger.login.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.galileo.android.messenger.R;
import org.isidoro.app.messenger.contactlist.ui.ContactListActivity;
import org.isidoro.app.messenger.login.LoginPresenter;
import org.isidoro.app.messenger.login.LoginPresenterImpl;
import org.isidoro.app.messenger.signup.ui.SignUpActivity;

public class LoginActivity extends AppCompatActivity implements LoginView {

    @Bind(R.id.editTxtEmail)
    EditText inputEmail;
    @Bind(R.id.editTxtPassword)
    EditText inputPassword;
    @Bind(R.id.btnSignIn)
    Button btnSignIn;
    @Bind(R.id.btnSignUp)
    Button btnSignUp;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;
    @Bind(R.id.layoutMainContainer)
    RelativeLayout container;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        loginPresenter = new LoginPresenterImpl(this);
    }

    @Override
    protected void onResume() {
        loginPresenter.onResume();
        loginPresenter.checkForAuthenticatedUser();
        super.onResume();
    }

    @Override
    protected void onPause() {
        loginPresenter.onPause();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        loginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void enableInputs() {
        setInputs(true);
        hideProgress();
    }

    @Override
    public void disableInputs() {
        setInputs(false);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @OnClick(R.id.btnSignUp)
    @Override
    public void handleSignUp() {
        startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
    }

    @OnClick(R.id.btnSignIn)
    @Override
    public void handleSignIn() {
        loginPresenter.validateLogin(inputEmail.getText().toString(), inputPassword.getText().toString());
    }

    @Override
    public void navigateToMainScreen() {
        startActivity(new Intent(this, ContactListActivity.class));
    }

    @Override
    public void loginError(String error) {
        inputPassword.setText("");
        String msgError = String.format(getString(R.string.login_error_message_sign_in), error);
        inputPassword.setError(msgError);
    }

    @Override
    public void newUserSuccess() {
        throw new UnsupportedOperationException("Operation is not valid in LoginActivity");
    }

    @Override
    public void newUserError(String error) {
        throw new UnsupportedOperationException("Operation is not valid in LoginActivity");
    }

    private void setInputs(boolean enabled){
        inputEmail.setEnabled(enabled);
        inputPassword.setEnabled(enabled);
        btnSignIn.setEnabled(enabled);
        btnSignUp.setEnabled(enabled);
    }
}
