package com.apps.dietplan;


import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;

import com.apps.nutribot.R;

public class DaysAcitvity extends Activity {
	
	 
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	int a;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		 
		setContentView(R.layout.days_main);		

		btn1 = (Button)findViewById(R.id.button1);
		btn2 = (Button)findViewById(R.id.button2);
		btn3 = (Button)findViewById(R.id.button3);
		btn4 = (Button)findViewById(R.id.button4);
		btn5 = (Button)findViewById(R.id.button5);
		btn6 = (Button)findViewById(R.id.button6);
		btn7 = (Button)findViewById(R.id.button7);		 		
		 
		
		Intent j = getIntent();
		a = j.getIntExtra("box1",0);
		
		if (a == 1) {
			
			btn1.setText("Lose 1200 Calorie In Week - Day1");
			btn2.setText("Lose 1200 Calorie In Week - Day2");
			btn3.setText("Lose 1200 Calorie In Week - Day3");
			btn4.setText("Lose 1200 Calorie In Week - Day4");
			btn5.setText("Lose 1200 Calorie In Week - Day5");
			btn6.setText("Lose 1200 Calorie In Week - Day6");
			btn7.setText("Lose 1200 Calorie In Week - Day7");
			
		} else if (a == 2) {
			
			btn1.setText("Lose 1400 Calorie In Week - Day1");
			btn2.setText("Lose 1400 Calorie In Week - Day2");
			btn3.setText("Lose 1400 Calorie In Week - Day3");
			btn4.setText("Lose 1400 Calorie In Week - Day4");
			btn5.setText("Lose 1400 Calorie In Week - Day5");
			btn6.setText("Lose 1400 Calorie In Week - Day6");
			btn7.setText("Lose 1400 Calorie In Week - Day7");
			
		}else if (a == 3) {
			
			btn1.setText("Lose 1600 Calorie In Week - Day1");
			btn2.setText("Lose 1600 Calorie In Week - Day2");
			btn3.setText("Lose 1600 Calorie In Week - Day3");
			btn4.setText("Lose 1600 Calorie In Week - Day4");
			btn5.setText("Lose 1600 Calorie In Week - Day5");
			btn6.setText("Lose 1600 Calorie In Week - Day6");
			btn7.setText("Lose 1600 Calorie In Week - Day7");
			
		}else if (a == 4) {
			
			btn1.setText("Lose 1800 Calorie In Week - Day1");
			btn2.setText("Lose 1800 Calorie In Week - Day2");
			btn3.setText("Lose 1800 Calorie In Week - Day3");
			btn4.setText("Lose 1800 Calorie In Week - Day4");
			btn5.setText("Lose 1800 Calorie In Week - Day5");
			btn6.setText("Lose 1800 Calorie In Week - Day6");
			btn7.setText("Lose 1800 Calorie In Week - Day7");
		
		}else if (a == 5) {
			
			btn1.setText("Lose 2000 Calorie In Week - Day1");
			btn2.setText("Lose 2000 Calorie In Week - Day2");
			btn3.setText("Lose 2000 Calorie In Week - Day3");
			btn4.setText("Lose 2000 Calorie In Week - Day4");
			btn5.setText("Lose 2000 Calorie In Week - Day5");
			btn6.setText("Lose 2000 Calorie In Week - Day6");
			btn7.setText("Lose 2000 Calorie In Week - Day7");
		
		} 
		
		
		 btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent i = new Intent(DaysAcitvity.this,MenuAcivity.class);
				 i.putExtra("box1",a);
				 i.putExtra("box2",1);
				 startActivity(i);
			}
		});
		 
		 btn2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(DaysAcitvity.this,MenuAcivity.class);
					 i.putExtra("box1",a);
					 i.putExtra("box2",2);
					 startActivity(i);
				}
			});
		 
		 btn3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(DaysAcitvity.this,MenuAcivity.class);
					 i.putExtra("box1",a);
					 i.putExtra("box2",3);
					 startActivity(i);
				}
			});
		 
		 btn4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(DaysAcitvity.this,MenuAcivity.class);
					 i.putExtra("box1",a);
					 i.putExtra("box2",4);
					 startActivity(i);
				}
			});
		 
		 btn5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(DaysAcitvity.this,MenuAcivity.class);
					 i.putExtra("box1",a);
					 i.putExtra("box2",5);
					 startActivity(i);
				}
			});
		 
		 btn6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(DaysAcitvity.this,MenuAcivity.class);
					 i.putExtra("box1",a);
					 i.putExtra("box2",6);
					 startActivity(i);
				}
			});
		 
		 btn7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 Intent i = new Intent(DaysAcitvity.this,MenuAcivity.class);
					 i.putExtra("box1",a);
					 i.putExtra("box2",7);
					 startActivity(i);
				}
			});
	}
}
