package com.apps.exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

import com.apps.dietplan.AboutActivity;
import com.apps.dietplan.ItemAdapterCalorie;
import com.apps.nutribot.R;

import static com.apps.nutribot.R.id.listView1;

public class DayListActivity extends AppCompatActivity {

    ListView listView;
    String[] level = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int[] food = {R.drawable.monday_btn, R.drawable.tuesdatbtn, R.drawable.wednesdaybtn, R.drawable.thursdaybtn, R.drawable.friday_btn, R.drawable.saturdaybtn, R.drawable.sundaybtn};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_day_list);

        listView = (ListView) findViewById(listView1);

        AdapterDaysList adapterCalorie = new AdapterDaysList(DayListActivity.this, level, food);

        listView.setAdapter(adapterCalorie);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                if (position == 0) {

                    Intent i = new Intent(DayListActivity.this, ExerciseList.class);
                    i.putExtra("box1", 1);
                    startActivity(i);

                } else if (position == 1) {

                    Intent i = new Intent(DayListActivity.this, ExerciseList.class);
                    i.putExtra("box1", 2);
                    startActivity(i);

                } else if (position == 2) {

                    Intent i = new Intent(DayListActivity.this, ExerciseList.class);
                    i.putExtra("box1", 3);
                    startActivity(i);
                } else if (position == 3) {

                    Intent i = new Intent(DayListActivity.this, ExerciseList.class);
                    i.putExtra("box1", 4);
                    startActivity(i);

                } else if (position == 4) {

                    Intent i = new Intent(DayListActivity.this, ExerciseList.class);
                    i.putExtra("box1", 5);
                    startActivity(i);
                } else if (position == 5) {

                    Intent i = new Intent(DayListActivity.this, ExerciseList.class);
                    i.putExtra("box1", 6);
                    startActivity(i);
                } else if (position == 6) {

                    Intent i = new Intent(DayListActivity.this, ExerciseList.class);
                    i.putExtra("box1", 7);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        switch (item.getItemId()) {


            case R.id.about:
                Intent aboutIntent = new Intent(DayListActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                return true;

            case R.id.share:

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                startActivity(sendIntent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
