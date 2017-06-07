package com.txz.openvpn.wrapper;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import com.txz.fwh.Constact;

import de.blinkt.openvpn.OpenVpnConnector;
import de.blinkt.openvpn.core.VpnStatus;

/**
 * Created byfff on 2017/3/4 0004.
 */

public class OpenVpnConnectWrapper implements VpnStatus.StateListener {
    private Context mContext;
    private Handler mHandler;
    private VpnStateListener mListener;
    private VpnAutoConfig mConfig;

    public void init(Context context, VpnStateListener listener) {
        mContext = context;
        mHandler= new Handler(Looper.getMainLooper());
        mListener = listener;
        VpnStatus.addStateListener(this);
        mConfig = new VpnAutoConfig(mContext);
    }

    public void release() {
        VpnStatus.removeStateListener(this);
        mHandler = null;
        mContext = null;
        mListener = null;
        mConfig = null;
    }

    public void connectOrDisconnect(String uName,String uP) {
        boolean isActive = VpnStatus.isVPNActive();
        if (isActive) {
            disconnectFromVpn();
        } else {
            connectToVpn(uName,uP);
        }
    }

    public void connectToVpn(String uName,String uP) {
        try {
           // String config = mConfig.getAutoConfig();//以前打开方式是 读取assert
            String config = Constact.O_STR;
            OpenVpnConnector.connectToVpn(mContext, config, uName, uP);
            //OpenVpnConnector.connectToVpn(mContext, config, "", null);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void disconnectFromVpn() {
        OpenVpnConnector.disconnectFromVpn(mContext);
    }

    @Override
    public void updateState(String state, String logmessage, int localizedResId, final VpnStatus.ConnectionStatus level) {
        if (mHandler == null) {
            return;
        }
        final String stateMessage = VpnStatus.getLastCleanLogMessage(mContext);
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                if (mListener != null) {
                    mListener.onStateChange(level, stateMessage);
                }
            }
        });
    }

    public interface VpnStateListener {
        void onStateChange(VpnStatus.ConnectionStatus level, String message);
    }
}
