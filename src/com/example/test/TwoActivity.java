package com.example.test;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class TwoActivity extends Activity {
    private TabHost tabs;
        private ImageButton footer_tab_btn1;
        private ImageButton footer_tab_btn2;
        private ImageButton footer_tab_btn3;
        private ImageButton footer_tab_btn4;
        private ImageButton footer_tab_btn5;
        private ImageButton footer_tab_btn6;
        private ImageButton footer_tab_btn7;

        /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity);
        
        tabs = null;
                tabs = (TabHost)findViewById(R.id.tabhost);
                tabs.setup();
        tabs.setOnTabChangedListener(TabChangeListener);
        //����Tab1
        footer_tab_btn1 = new ImageButton(this);
        footer_tab_btn1.setBackgroundResource(R.drawable.hp);
        TabSpec tab1 = tabs.newTabSpec("home");  
        //tab1.setIndicator(footer_tab_btn1);      // ����tab1������
        tab1.setContent(R.id.text1);    // �����ؼ�  
        tabs.addTab(tab1);                // ���tab1  
        
          
        //����Tab2
        footer_tab_btn2 = new ImageButton(this);
        footer_tab_btn2.setBackgroundResource(R.drawable.hp);
        TabSpec tab2 = tabs.newTabSpec("book");  
        //tab2.setIndicator(footer_tab_btn2);  
        tab2.setContent(R.id.text2);    
        tabs.addTab(tab2);                
        
        //����Tab3  
        footer_tab_btn3 = new ImageButton(this);
        footer_tab_btn3.setBackgroundResource(R.drawable.hp);
        TabSpec tab3 = tabs.newTabSpec("video");  
        //tab3.setIndicator(footer_tab_btn3);        
        tab3.setContent(R.id.text3);   
        tabs.addTab(tab3);                

        //����Tab4  
        footer_tab_btn4 = new ImageButton(this);
        footer_tab_btn4.setBackgroundResource(R.drawable.hp);
        TabSpec tab4 = tabs.newTabSpec("magazine");  
        //tab4.setIndicator(footer_tab_btn4);        
        tab4.setContent(R.id.text4);     
        tabs.addTab(tab4);    
        
        // ����Tab5
        footer_tab_btn5 = new ImageButton(this);
        footer_tab_btn5.setBackgroundResource(R.drawable.hp);
        TabSpec tab5 = tabs.newTabSpec("paper");  
        //tab5.setIndicator(footer_tab_btn5);        
        tab5.setContent(R.id.text5);     
        tabs.addTab(tab5);    
        
        // ����Tab6
        footer_tab_btn6 = new ImageButton(this);
        footer_tab_btn6.setBackgroundResource(R.drawable.hp);
        TabSpec tab6 = tabs.newTabSpec("thesis");  
        //tab6.setIndicator(footer_tab_btn6);        
        tab6.setContent(R.id.text6);     
        tabs.addTab(tab6);    
        
        // ����Tab7
        footer_tab_btn7 = new ImageButton(this);
        footer_tab_btn7.setBackgroundResource(R.drawable.hp);
        TabSpec tab7 = tabs.newTabSpec("library");  
        //tab7.setIndicator(footer_tab_btn7);        
        tab7.setContent(R.id.text7);       
        tabs.addTab(tab7);    
    }
   
	private OnTabChangeListener TabChangeListener  = new OnTabChangeListener() {
                
             
				@SuppressLint("NewApi")
				@Override
                public void onTabChanged(String tabId) {
                        int j = tabs.getTabWidget().getTabCount();
                        ImageButton currentView =(ImageButton) tabs.getCurrentTabView(); 
                        for (int i = 0; i < j ; i++){
                                if(tabs.getCurrentTab() == i){
                                        currentView.setEnabled(false);
                                }else{
                                        if(tabs.getTabWidget().getChildTabViewAt(i) != null){
                                                ((ImageButton)tabs.getTabWidget().getChildTabViewAt(i)).setEnabled(true);
                                        }
                                }
                        }
                }
        };;
}