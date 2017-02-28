package com.apps.dietplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.apps.nutribot.R;

public class splaceActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.splace);
		
		Thread splaceThread = new Thread(){
		
		 @Override
			public void run() {
			 try {
				 int waited = 0;
				 while(waited<2000){
					 sleep(100);
					 waited += 100;
				 }
				 
			} catch (InterruptedException e) {
				// TODO: handle exception
			} finally{
				
				finish();
				Intent i = new Intent(splaceActivity.this,CalorieLevel.class);
				startActivity(i);
			}			  
				
			}
		};
		splaceThread.start();
	}
}
