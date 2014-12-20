package com.superapp.market;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class PageUtil {

	public static boolean isFinish(Activity page) {
		return page == null || page.isFinishing();
	}
	
	public static void startMainPage(Context context) {
		Intent i = new Intent(context, PageMain.class);
		context.startActivity(i);
	}
}
