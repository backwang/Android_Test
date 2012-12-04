package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

import android.R.integer;
import android.R.layout;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import android.os.Bundle;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.Toast;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import android.widget.ToggleButton;

public class LoginActivity extends Activity {

	String[] books = new String[] { "·è¿ñJava½²Òå", "·è¿ñAjax½²Òå", "·è¿ñXML½²Òå",
			"·è¿ñWorkflow½²Òå" };
	public int rate = 10;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.btn_toggle);
		final ImageView imageView = (ImageView) findViewById(R.id.imageview);

		AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autocomp);
		ArrayAdapter<String> bb = new ArrayAdapter<String>(
				getApplicationContext(),
				android.R.layout.simple_dropdown_item_1line, books);

		// ÉèÖÃAdapter
		actv.setAdapter(bb);

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
