package com.example.t1;

import android.app.Application;

public class MyApplication extends Application {

	private static Application mApplication;

	public static Application getContext() {

		if (null == mApplication) {
			mApplication = new Application();
		}
		return mApplication;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		mApplication = this;
		// SDKInitializer.initialize(this);

	}
}
