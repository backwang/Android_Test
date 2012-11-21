package com.example.test;

 
 
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
 
 
 
public class LoginActivity extends Activity {
	 
	public static final String EXTRA_EMAIL = "com.example.android.authenticatordemo.extra.EMAIL";

	/**
	 * Keep track of the login task to ensure we can cancel it if requested.
	 */
	 

	// Values for email and password at the time of the login attempt.
	 
	public void sendmsg(View view)
	{
		Toast toast=new Toast(this);
		toast = Toast.makeText(getApplicationContext(), 
				"自定义位置Toast", Toast.LENGTH_LONG); 
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
