package com.example.test;



import java.io.Serializable;

import junit.framework.Test;

import com.example.test.R.drawable;

import android.app.Activity;
import android.content.Intent;
import android.database.CharArrayBuffer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ToggleButton;

public class LoginActivity extends Activity {

	String[] books = new String[] { "·è¿ñJava½²Òå", "·è¿ñAjax½²Òå", "·è¿ñXML½²Òå",
			"·è¿ñWorkflow½²Òå" };
	public int rate = 10;

	public void loadtwo(View view)
	{
		LinearLayout loadtwoLayout=(LinearLayout)findViewById(R.id.twoactivity);
		
		
		
		
		
		
		LayoutInflater inflater = LayoutInflater.from(this);
		View layout = inflater.inflate(R.layout.two_activity, null); 
		loadtwoLayout.addView(layout);
		 
	}
	public void btn_click(View view)
	{
		Intent intent=new Intent(LoginActivity.this,TwoActivity.class);
		  
		Bundle bundle=new Bundle();
		Myclass myclass=new Myclass();
		myclass.setNameString("haha");
		bundle.putSerializable("myclass", myclass);
	    intent.putExtras(bundle);
		startActivity(intent);
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.btn_toggle);
		final ImageView imageView = (ImageView) findViewById(R.id.imageview);
        final Spinner spinner=(Spinner)findViewById(R.id.spinner);
		AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autocomp);
		ArrayAdapter<String> bb = new ArrayAdapter<String>(
				getApplicationContext(),
				android.R.layout.simple_dropdown_item_1line, books);

		// ÉèÖÃAdapter
		actv.setAdapter(bb);
		 
		spinner.setAdapter(bb);
		 
		toggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
						R.drawable.hw);

				int width = bitmap.getWidth();
				int height = bitmap.getHeight();
				Matrix matrix = new Matrix();

				rate = rate + 10;
				matrix.setRotate(rate); // ÄæÊ±ÕëÐý×ª15¶È
				// create the new Bitmap object
				Bitmap resizedBitmap = Bitmap.createBitmap(bitmap, 0, 0, width,
						height, matrix, true);
				BitmapDrawable bmd = new BitmapDrawable(resizedBitmap);

				imageView.setImageDrawable(bmd);

				Toast.makeText(getApplicationContext(), toggleButton.getText(),
						Toast.LENGTH_LONG).show();

			}
		});

	}

}
