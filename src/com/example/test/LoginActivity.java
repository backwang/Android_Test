package com.example.test;

 
 
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import junit.framework.Test;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.telephony.gsm.SmsManager;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
 
 
 
public class LoginActivity extends Activity {
	 
	public static final String EXTRA_EMAIL = "com.example.android.authenticatordemo.extra.EMAIL";

	/**
	 * Keep track of the login task to ensure we can cancel it if requested.
	 */
	 

	//发送短消息
	public void sendsms(View view)
	{
		 
		 
<<<<<<< HEAD
 
	 IntentFilter intentFilter=new IntentFilter();
	 intentFilter.addAction("ACTION_TIME_CHANGED");
 
=======
	 IntentFilter intentFilter=new IntentFilter();
	 intentFilter.addAction("ACTION_TIME_CHANGED");
	 registerReceiver(null, intentFilter);
>>>>>>> branch 'master' of https://github.com/backwang/Android_Test.git
	}
	public void sendmsg(View view)
	{
		Toast toast=new Toast(this);
		toast = Toast.makeText(getApplicationContext(), 
				"我发了一条消息", Toast.LENGTH_LONG); 
				toast.setGravity(Gravity.CENTER, 0, 0); 
				toast.show(); 
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_login);

		// Set up the login form.
	 
	}
}
