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
	 
	 
		private SimpleAdapter adapter;// �������������� 
		private ListView listView; // �����б���ͼ���� 
		private List<Map<String, Object>> list;// �����б����� 
		public static LoginActivity ma; 
		@Override 
		public void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		ma = this; 
		// ʵ�����б����� 
		list = new ArrayList<Map<String, Object>>(); 
		listView = new ListView(this);// ʵ�����б���ͼ 
		// ʵ��һ���б��������� 
		Map<String, Object> map = new HashMap<String, Object>(); 
		// ���б�������������� 
		map.put("item1_imageivew", R.drawable.ic_launcher); 
		map.put("item1_bigtv", "BIGTV"); 
		map.put("item1_smalltv", "SMALLTV"); 
		// ���б�������ӵ��б������� 
		list.add(map); 
		// --ʹ��ϵͳ���������޷�ʵ����������� 
		// //ʵ�������� 
		adapter = new SimpleAdapter(this, list, R.layout.activity_login, new String[] { 
		"item1_imageivew", "item1_bigtv", "item1_smalltv" }, new int[] { 
		R.id.iv, R.id.bigtv, R.id.smalltv }); 
		listView.setAdapter(adapter); 
		// //��ʾ�б���ͼ 
		this.setContentView(listView); 
		} 
		 
}
