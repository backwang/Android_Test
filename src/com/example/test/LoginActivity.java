package com.example.test;

 
 
import java.util.ArrayList;
import java.util.HashMap;
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
 
import android.view.Gravity;
import android.view.View;
 
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
 
 
 
public class LoginActivity extends Activity {
	 
	 
		private SimpleAdapter adapter;// 声明适配器对象 
		private ListView listView; // 声明列表视图对象 
		private List<Map<String, Object>> list;// 声明列表容器 
		public static LoginActivity ma; 
		@Override 
		public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		ma = this; 
		// 实例化列表容器 
		list = new ArrayList<Map<String, Object>>(); 
		listView = new ListView(this);// 实例化列表视图 
		// 实例一个列表数据容器 
		Map<String, Object> map = new HashMap<String, Object>(); 
		// 往列表容器中添加数据 
		map.put("item1_imageivew", R.drawable.ic_launcher); 
		map.put("item1_bigtv", "BIGTV"); 
		map.put("item1_smalltv", "SMALLTV"); 
		// 将列表数据添加到列表容器中 
		list.add(map); 
		// --使用系统适配器，无法实现组件监听； 
		// //实例适配器 
		adapter = new SimpleAdapter(this, list, R.layout.activity_login, new String[] { 
		"item1_imageivew", "item1_bigtv", "item1_smalltv" }, new int[] { 
		R.id.iv, R.id.bigtv, R.id.smalltv }); 
		listView.setAdapter(adapter); 
		// //显示列表视图 
		this.setContentView(listView); 
		} 
		 
}
