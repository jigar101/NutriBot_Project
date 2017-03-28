package com.apps.exercise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.apps.nutribot.R;

public class ExerciseList extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_exercise_list);

        btn1 = (Button)findViewById(R.id.button1);
        btn3 = (Button)findViewById(R.id.button3);
        btn5 = (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button7);


        Intent j = getIntent();
        a = j.getIntExtra("box1",0);

        if (a == 1) {

            btn1.setText("Leg Raise");
            btn3.setText("Plank	");
            btn5.setText("Hip Extension");
            btn6.setText("March in Place");
            btn7.setText("Push-Ups");

        } else if (a == 2) {

            btn1.setText("Military Press");
            btn3.setText("Sumo Squat");
            btn5.setText("Stiff legged deadlift with dumbbells");
            btn6.setText("Foot to Foot crunches");
            btn7.setText("High Knees in place");

        }else if (a == 3) {

            btn1.setText("Goblet Squat");
            btn3.setText("Knee touches in place");
            btn5.setText("Triceps Kickbacks");
            btn6.setText("Rear Leg Extension");
            btn7.setText("Push-Ups");
        }else if (a == 4) {

            btn1.setText("Rest Day");

        }else if (a == 5) {

            btn1.setText("March in place");
            btn3.setText("Traditional Crunch");
            btn5.setText("Chair Squat");
            btn6.setText("Wall Push-Up");
            btn7.setText("Bodyweight Glute Bridge ");

        }
        else if (a == 6) {

            btn1.setText("Toe reach");
            btn3.setText("Alternating Lunges");
            btn5.setText("Lying Oblique Twist");
            btn6.setText("Body Weight Squat");
            btn7.setText("High Knees in Place");

        }else if (a == 7) {

            btn1.setText("Russian Twist");
            btn3.setText("Knee Push-Up");
            btn5.setText("Alternating Reverse Lunges");
            btn6.setText("Reverse Crunchs");
            btn7.setText("Knee touches in place ");

        }

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(ExerciseList.this,ExerciseVideo.class);
                i.putExtra("box1",a);
                i.putExtra("box2",1);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(ExerciseList.this,ExerciseVideo.class);
                i.putExtra("box1",a);
                i.putExtra("box2",3);
                startActivity(i);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(ExerciseList.this,ExerciseVideo.class);
                i.putExtra("box1",a);
                i.putExtra("box2",5);
                startActivity(i);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(ExerciseList.this,ExerciseVideo.class);
                i.putExtra("box1",a);
                i.putExtra("box2",6);
                startActivity(i);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(ExerciseList.this,ExerciseVideo.class);
                i.putExtra("box1",a);
                i.putExtra("box2",7);
                startActivity(i);
            }
        });
    }
}
