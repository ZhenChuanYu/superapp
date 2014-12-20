package com.superapp.market;

import android.app.Activity;
import android.os.Bundle;

public class PageSplash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		boolean ignoreSplash = true;
		if (ignoreSplash) {
			PageUtil.startMainPage(this);
			finish();
			return;
		} else {
			setContentView(R.layout.page_layout_splash);
		}
	}
}
