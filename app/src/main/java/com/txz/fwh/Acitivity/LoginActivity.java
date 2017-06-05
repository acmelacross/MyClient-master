package com.txz.fwh.Acitivity;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.txz.fwh.Utils.LogUtil;
import com.txz.openvpn.client.R;
import com.txz.openvpn.data.model.VpnConfigFile;
import com.txz.openvpn.logic.VpnUiLogic;

import java.util.List;

import de.blinkt.openvpn.core.VpnStatus;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity  implements VpnUiLogic.UiLogicListener {
    private VpnUiLogic mVpnUiLogic;
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private TextInputLayout emailTextInput, passwordTextInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        initVpn();

    }
    private void initView(){
        initToolbar("登录");
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        mPasswordView = (EditText) findViewById(R.id.password);
        emailTextInput = (TextInputLayout) findViewById(R.id.emailTextInput);
        passwordTextInput = (TextInputLayout) findViewById(R.id.passwordTextInput);
        mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == R.id.login || id == EditorInfo.IME_ACTION_DONE) {
                    attemptLogin();
                    return true;
                }
                return false;
            }
        });

        Button mEmailSignInButton = (Button) findViewById(R.id.email_sign_in_button);
        mEmailSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
            }
        });
    }


    private void initVpn() {
        mVpnUiLogic = new VpnUiLogic();
        mVpnUiLogic.init(this, this);
    }

    @Override
    public void onVpnStateChange(VpnStatus.ConnectionStatus level, String message) {
      //  updateVpnUIStatus(level,message);
        LogUtil.d(level.toString() + "-**************---"+message);
        //System.out.println(level.toString() + "-**************---"+message);
    }

    @Override
    public void onDataUpdate(List<VpnConfigFile> listData) {
        for (int i = 0;i<listData.size();i++){
            LogUtil.d("**************"+listData.get(i));
        }
    }

    @Override
    public void onDataLoadFailed(String errMessage) {
        System.out.print("***********onDataLoadFailed***"+errMessage);
    }



    private void attemptLogin() {
        LogUtil.d("com.txz.openvpn.client");
        // Reset errors.
        emailTextInput.setErrorEnabled(false);
        passwordTextInput.setErrorEnabled(false);

        String email = mEmailView.getText().toString();
        String password = mPasswordView.getText().toString();
        if (TextUtils.isEmpty(email)) {
            emailTextInput.setError("请输入账号");
            return;
        } else if (!isEmailValid(email)) {
            emailTextInput.setError("请输入有效的账号");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            passwordTextInput.setError("请输入密码");
            return;
        } else if (!isPasswordValid(password)) {
            passwordTextInput.setError("密码过短");
            return;
        }

        mVpnUiLogic.connectOrDisconnect();
      //  mActivity.startActivity(new Intent(mActivity, MainActivity.class));
       // finish();

    }

    private boolean isEmailValid(String email) {
        return !email.equals("");
    }

    private boolean isPasswordValid(String password) {
        return password.length() > 3;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();

        mVpnUiLogic.release();
    }
}

