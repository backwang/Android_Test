package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class TwoActivity extends Activity{
	@Override
	 
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		try {
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);  
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.id.titletext);
        setContentView(R.layout.two_activity); 
        
        	
		} catch (Exception e) {
			Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
		}
        
         

	}

}
