package com.txz.fwh.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.txz.fwh.utils.LogUtil;
import com.txz.openvpn.client.R;

public class OneFragment extends Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_one_fragment,container,false);
        LogUtil.d("view   " +view);
        return view;
    }

    @Override
    public void onDestroyView() {
        ((ViewGroup)view.getParent()).removeView(view);
        super.onDestroyView();
    }
}
