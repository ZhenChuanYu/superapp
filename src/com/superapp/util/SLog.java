package com.superapp.util;

import android.util.Log;

import com.superapp.market.Constant;

public class SLog {

	public static void i(String tag, String msg) {
		if (Constant.DEBUG_FLAG) {
			Log.i(tag, msg);
		}
	}

	public static void w(String tag, String msg) {
		if (Constant.DEBUG_FLAG) {
			Log.w(tag, msg);
		}
	}

	public static void e(String tag, String msg) {
		if (Constant.DEBUG_FLAG) {
			Log.e(tag, msg);
		}
	}
}
