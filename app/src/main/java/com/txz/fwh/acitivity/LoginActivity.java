package com.txz.fwh.acitivity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
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


import com.txz.fwh.modle.TXZUsers;
import com.txz.fwh.utils.LogUtil;
import com.txz.fwh.utils.ToastUtil;
import com.txz.openvpn.client.R;
import com.txz.openvpn.data.model.VpnConfigFile;
import com.txz.openvpn.logic.VpnUiLogic;

import java.util.List;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import de.blinkt.openvpn.core.VpnStatus;


/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity  implements VpnUiLogic.UiLogicListener {
    private VpnUiLogic mVpnUiLogic;
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private TextInputLayout emailTextInput, passwordTextInput;
    String email;
    String password;


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
        if (level.toString().equals("LEVEL_CONNECTED")){
            uploadHandler.sendEmptyMessage(0);
            startActivity(new Intent().setClass(LoginActivity.this,MyMainActivity.class));
            finish();
        }else if (level.toString().equals("LEVEL_AUTH_FAILED"))
        {
            ToastUtil.show(R.string.error_login_errorpass_or_timeout);
        }
            //
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

        email= mEmailView.getText().toString();
        password= mPasswordView.getText().toString();
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
        //uploadHandler
        mVpnUiLogic.connectOrDisconnect(email,password);
      //  mActivity.startActivity(new Intent(mActivity, MainActivity.class));
       // finish();

    }

    private boolean isEmailValid(String email) {
        return !email.equals("");
    }

    private boolean isPasswordValid(String password) {
        return password.length() > 3;
    }

    Handler uploadHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    TXZUsers us = new TXZUsers();
                    us.setUsername(email);
                    us.setUserNumber(password);
                    us.setPassword(password);
                    //注意：不能用save方法进行注册
                    us.signUp(new SaveListener<TXZUsers>() {
                        @Override
                        public void done(TXZUsers s, BmobException e) {
                            if(e==null){
                                LogUtil.d("注册数据成功，返回objectId为：");
                            }else{
                                LogUtil.d("创建数据失败：" + e.getMessage()+e.getErrorCode());
                                if (e.getErrorCode() == 202) {
                                    //登陆
                                    TXZUsers bu2 = new TXZUsers();
                                    bu2.setUsername(email);
                                    bu2.setPassword(password);
                                    bu2.login(new SaveListener<TXZUsers>() {
                                        @Override
                                        public void done(TXZUsers txzUsers, BmobException e) {
                                            if(e==null){
                                                LogUtil.d("登陆数据成功，返回objectId为：");
                                            }else {
                                                LogUtil.d("登陆数据失败，："+e.getMessage()+e.getErrorCode());
                                            }
                                        }
                                    });
//                                    bu2.login( new SaveListener<TXZUsers>() {
//                                        @Override
//                                        public void onSuccess() {
//                                            LogUtil.d("登陆成功  ：");
//                                            // TODO Auto-generated method stub
//                                            //startActivity(new Intent().setClass(getApplicationContext(), IndexActivity.class));//直接跳转
//                                        }
//                                        @Override
//                                        public void onFailure(int code, String msg) {
//                                            // TODO Auto-generated method stub
//                                            System.out.println();
//                                            ToastUtil.show(getApplicationContext(), "登录失败:原因 "+msg+code);
//                                        }
//                                    });

                                }
                            }
                        }
                    });
                    break;
            }
        }
    };

    @Override
    public void onDestroy() {
        super.onDestroy();

        mVpnUiLogic.release();
    }// boolean isActive = VpnStatus.isVPNActive(); 判断连接状态
}

