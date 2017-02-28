package com.apps.dietplan;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.apps.nutribot.R;

public class CalorieLevel extends Activity {



	ListView listView;
	String[] level = {"1200 Calorie","1400 Calorie","1600 Calorie","1800 Calorie","2000 Calorie"};
	int[] food = {R.drawable.rec_1,R.drawable.rec_4,R.drawable.rec_7,R.drawable.rec_10,R.drawable.rec_14};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		 
		setContentView(R.layout.calorielevel);

		listView = (ListView)findViewById(R.id.listView1);			



		ItemAdapterCalorie adapterCalorie = new ItemAdapterCalorie(CalorieLevel.this,  level, food);
		listView.setAdapter(adapterCalorie);

		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub

				if (position == 0) {

					Intent i = new Intent(CalorieLevel.this,DaysAcitvity.class);
					i.putExtra("box1",1);
					startActivity(i);

				} else if (position == 1) {

					Intent i = new Intent(CalorieLevel.this,DaysAcitvity.class);
					i.putExtra("box1",2);
					startActivity(i);

				}  else if (position == 2) {

					Intent i = new Intent(CalorieLevel.this,DaysAcitvity.class);
					i.putExtra("box1",3);
					startActivity(i);
				} else if (position == 3) {

					Intent i = new Intent(CalorieLevel.this,DaysAcitvity.class);
					i.putExtra("box1",4);
					startActivity(i);

				} else if (position == 4) {

					Intent i = new Intent(CalorieLevel.this,DaysAcitvity.class);
					i.putExtra("box1",5);
					startActivity(i);
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {


		case R.id.about:
			Intent aboutIntent = new Intent(CalorieLevel.this, AboutActivity.class);
			startActivity(aboutIntent);
			return true;

		case R.id.share:

			Intent sendIntent = new Intent();
			sendIntent.setAction(Intent.ACTION_SEND);
			sendIntent.putExtra(Intent.EXTRA_TEXT," I Would like to share this with you. Here You Can Download This Application from PlayStore "+"https://play.google.com/store/apps/details?id="+getPackageName());
			sendIntent.setType("text/plain");
			startActivity(sendIntent);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}

	}
 
//	@Override
//		public boolean onKeyDown(int keyCode, KeyEvent event) {
//		// TODO Auto-generated method stub
//
//		if (keyCode == KeyEvent.KEYCODE_BACK) {
//			// Toast.makeText(appContext, "BAck", Toast.LENGTH_LONG).show();
//			AlertDialog.Builder alert = new AlertDialog.Builder(
//					CalorieLevel.this);
//			alert.setTitle(getString(R.string.app_name));
//			alert.setIcon(R.drawable.icon);
//			alert.setMessage("Are You Sure You Want To Quit?");
//
//			alert.setPositiveButton("Yes",
//					new DialogInterface.OnClickListener() {
//						public void onClick(DialogInterface dialog,
//								int whichButton) {
//
//							finish();
//						}
//
//			});
//
//			alert.setNegativeButton("No",
//					new DialogInterface.OnClickListener() {
//
//						public void onClick(DialogInterface dialog, int which) {
//							// TODO Auto-generated method stub
//
//
//						}
//					});
//			alert.show();
//			return true;
//		}
//
//		return super.onKeyDown(keyCode, event);
//
//		}
}
