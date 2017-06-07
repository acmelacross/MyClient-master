package com.txz.openvpn.logic;

import android.content.Context;

import com.txz.openvpn.data.model.VpnConfigFile;
import com.txz.openvpn.data.VpnConfigListData;
import com.txz.openvpn.wrapper.OpenVpnConnectWrapper;

import java.util.List;

import de.blinkt.openvpn.core.VpnStatus;

/**
 * Created byfff on 2017/3/4 0004.
 */

public class VpnUiLogic implements OpenVpnConnectWrapper.VpnStateListener,
        VpnConfigListData.DataChangeListener {
    private OpenVpnConnectWrapper mVpnConnect;
    private VpnConfigListData mListData;
    private UiLogicListener mListener;

    public void init(Context context, UiLogicListener listener) {
        mListener = listener;
        mVpnConnect = new OpenVpnConnectWrapper();
        mVpnConnect.init(context, this);
        mListData = new VpnConfigListData(context);
        mListData.init(this);
    }

    public void release() {
        mVpnConnect.release();
        mVpnConnect = null;
        mListData.release();
        mListData = null;
        mListener = null;
    }

    public void connectOrDisconnect(String uName,String uP) {
        mVpnConnect.connectOrDisconnect( uName, uP);
    }

    @Override
    public void onStateChange(VpnStatus.ConnectionStatus level, String message) {
        if (mListener != null) {
            mListener.onVpnStateChange(level, message);
        }
    }

    @Override
    public void onDataChange(List<VpnConfigFile> listData) {
        if (mListener != null) {
            mListener.onDataUpdate(listData);
        }
    }

    @Override
    public void onNotifyUpdated() {

    }

    @Override
    public void onNotifyFailed(int errCode) {
        if (mListener != null) {
            String errMessage = getMessageFromErrorCode(errCode);
            mListener.onDataLoadFailed(errMessage);
        }
    }

    private String getMessageFromErrorCode(int errCode) {
        //// TODO: 2017/3/4 0004
        return "";
    }

    public interface UiLogicListener {
        void onVpnStateChange(VpnStatus.ConnectionStatus level, String message);
        void onDataUpdate(List<VpnConfigFile> listData);
        void onDataLoadFailed(String errMessage);
    }
}
