package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageView;
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
        
         
		BaseAdapter baseAdapter=new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 0;
			}
		};

	}

}
