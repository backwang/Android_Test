package com.example.test;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class TwoActivity extends Activity {
    
        /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity);
        
    Intent intent=getIntent();
    Bundle bundle=intent.getExtras();
    Myclass myclass=(Myclass)bundle.getSerializable("myclass");
    String nameString=myclass.getNameString();
    Toast.makeText(this, nameString, Toast.LENGTH_LONG).show();
    }
   
	 
}