package com.example.test;

 
 
import android.app.Activity;
import android.os.Bundle;
 
 
 
public class LoginActivity extends Activity {
	 
	public static final String EXTRA_EMAIL = "com.example.android.authenticatordemo.extra.EMAIL";

	/**
	 * Keep track of the login task to ensure we can cancel it if requested.
	 */
	 

	// Values for email and password at the time of the login attempt.
	 
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_login);

		// Set up the login form.
	 
	}
}
