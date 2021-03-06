package com.txz.fwh.utils;

import android.content.Context;
import android.widget.Toast;

import com.txz.fwh.Config;

public class ToastUtil {

	public static void show(Context context, String info) {
        Toast.makeText(context, info, Toast.LENGTH_LONG ).show();
	}
	public static void showShort(Context context, String info) {
		Toast.makeText(context, info, Toast.LENGTH_SHORT).show();
	}
	public static void showShort(Context context, int info) {
		Toast.makeText(context, info, Toast.LENGTH_SHORT).show();
	}
	public static void show(Context context, int info) {
		Toast.makeText(context, info, Toast.LENGTH_LONG).show();
	}
	public static void show( String info) {
		Toast.makeText( Config.getInstance().application, info, Toast.LENGTH_LONG ).show();
	}
	public static void show( int info) {
		Toast.makeText( Config.getInstance().application, Config.getInstance().application.getResources().getString(info)+"", Toast.LENGTH_LONG ).show();
	}
}
