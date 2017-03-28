package com.apps.exercise;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.apps.dietplan.AboutActivity;
import com.apps.dietplan.CalorieLevel;
import com.apps.nutribot.R;

public class ExerciseVideo extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16;
    TextView txt_b,txt_ms,txt_l,txt_as,txt_d;
    ScrollView scView;
    Button btn1;
    ImageView img1, imageView_exercise_video;
    LinearLayout linearLayout;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_exercise_video);

        img1 = (ImageView)findViewById(R.id.imageView1);
        imageView_exercise_video = (ImageView)findViewById(R.id.imageView_exercise_video);
        txt1 = (TextView)findViewById(R.id.textView1);
        txt2 = (TextView)findViewById(R.id.textView2);
        txt3 = (TextView)findViewById(R.id.textView3);
        txt4 = (TextView)findViewById(R.id.textView4);
        txt5 = (TextView)findViewById(R.id.textView5);
        txt9 = (TextView)findViewById(R.id.textView9);
        txt10 = (TextView)findViewById(R.id.textView10);
        txt12 = (TextView)findViewById(R.id.textView12);

        scView = (ScrollView)findViewById(R.id.scrollView1);
        btn1 = (Button)findViewById(R.id.button1);


        Intent i = getIntent();
        a = i.getIntExtra("box1",0);
        b = i.getIntExtra("box2",0);


        if ((a == 1) && (b == 1)) {

            txt1.setText("Leg Raise" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.monday1));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=JB2oyawG9KI"); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        } else if ((a == 2) && (b == 1)) {

            txt1.setText("Military Press" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.tuesday1));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/B-aVuyhvLHU"); // missing 'http://' will cause crashed
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent1);
                }
            });

        }
        else if ((a == 3) && (b == 1)) {

            txt1.setText("Global Squat" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.wednesday1));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/AHE6kpogQ_s"); // missing 'http://' will cause crashed
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent1);
                }
            });

        }  else if ((a == 4) && (b == 1)) {

            txt1.setText("Rest Day" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.thursday));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/AHE6kpogQ_s"); // missing 'http://' will cause crashed
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent1);
                }
            });
        }else if ((a == 5) && (b == 1)) {

            txt1.setText("March in Place" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.friday1));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/ynbWNnrijkA"); // missing 'http://' will cause crashed
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent1);
                }
            });
        }else if ((a == 6) && (b == 1)) {

            txt1.setText("Toe Reach" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.saturday1));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/y6Bv_0Shhc8"); // missing 'http://' will cause crashed
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent1);
                }
            });
        }
        else if ((a == 7) && (b == 1)) {

            txt1.setText("Russian/Mason Twist" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.sunday1));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/wkD8rjkodUI"); // missing 'http://' will cause crashed
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent1);
                }
            });
        }
        else if ((a == 1) &&(b == 3)) {
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.monday2));
            txt1.setText("Plank" + b);

            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/MypRN5Q754o"); // missing 'http://' will cause crashed
                    Intent intent7 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent7);
                }
            });

        }   else if ((a == 2) && (b == 3)) {

            txt1.setText("Sumo Squat" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.tuesday2));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/yNKVK2axeNI"); // missing 'http://' will cause crashed
                    Intent intent8 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent8);

                }
            });

        }else if ((a == 3) && (b == 3)) {

            txt1.setText("Knee Touches in Place" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.wednesday2));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/PL49-xf_v90"); // missing 'http://' will cause crashed
                    Intent intent9 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent9);

                }
            });


        }else if ((a == 5) && (b == 3)) {

            txt1.setText("Traditional Crunch" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.friday2));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/Xyd_fa5zoEU"); // missing 'http://' will cause crashed
                    Intent intent90 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent90);

                }
            });

        }
        else if ((a == 6) && (b == 3)) {

            txt1.setText("Alternating Lunges" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.saturday2));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/tTej-ax9XiA"); // missing 'http://' will cause crashed
                    Intent intent10 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent10);

                }
            });

        }

        else if ((a == 7) && (b == 3)) {
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.sunday2));
            txt1.setText("Knee Push-Ups" + b);

            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub

                    Uri uri = Uri.parse("https://youtu.be/Q7cPaJZoOng"); // missing 'http://' will cause crashed
                    Intent intent11 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent11);

                }
            });

        }
        else if ((a == 1) &&(b == 5)) {

            txt1.setText("Hip Extensions" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.monday3));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/XzSKVCEPV68"); // missing 'http://' will cause crashed
                    Intent intent12 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent12);
                }
            });
        }

        else if ((a == 2) &&(b == 5)) {

            txt1.setText("Stiff Legged Deadlift with Dumbbells" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.tuesday3));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/w9_PudlkeLI"); // missing 'http://' will cause crashed
                    Intent intent13 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent13);
                }
            });
        }
        else if ((a == 3) &&(b == 5)) {

            txt1.setText("Triceps Kickbacks" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.wednesday3));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/ShCYaoHmWmk"); // missing 'http://' will cause crashed
                    Intent intent14 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent14);
                }
            });
        }
        else if ((a == 5) &&(b == 5)) {

            txt1.setText("Chair Squat" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.friday3));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/b4esFx8-jeY"); // missing 'http://' will cause crashed
                    Intent intent15 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent15);
                }
            });
        }
        else if ((a == 6) &&(b == 5)) {

            txt1.setText("Lying Oblique Twist" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.saturday3));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/SQMAuU7LvkI"); // missing 'http://' will cause crashed
                    Intent intent16 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent16);
                }
            });
        }
        else if ((a == 7) &&(b == 5)) {

            txt1.setText("Alternating Reverse Lunge" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.sunday3));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/HXmNPJkTC3g"); // missing 'http://' will cause crashed
                    Intent intent17 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent17);
                }
            });
        }
        else if ((a == 1) &&(b == 6)) {

            txt1.setText("Wall Push-Up" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.monday4));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/fh_viBHZZto"); // missing 'http://' will cause crashed
                    Intent intent18 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent18);
                }
            });

        } 	else if ((a == 2) &&(b == 6)) {

            txt1.setText("Body Weight Squat" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.tuesday4));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/p3g4wAsu0R4"); // missing 'http://' will cause crashed
                    Intent intent19 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent19);
                }
            });

        }
        else if ((a ==3) &&(b == 6)) {

            txt1.setText("Rear Leg Extension" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.wednesday4));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/J6zhtG3Z-3k"); // missing 'http://' will cause crashed
                    Intent intent20 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent20);
                }
            });

        }
        else if ((a ==5) &&(b == 6)) {

            txt1.setText("Wall Push-Up" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.friday4));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/fh_viBHZZto"); // missing 'http://' will cause crashed
                    Intent intent21 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent21);
                }
            });

        }
        else if ((a ==6) &&(b == 6)) {

            txt1.setText("Body Weight Squat" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.saturday4));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/p3g4wAsu0R4"); // missing 'http://' will cause crashed
                    Intent intent22 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent22);
                }
            });

        }
        else if ((a ==7) &&(b == 6)) {

            txt1.setText("Reverse Crunch" + b);
            imageView_exercise_video.setImageDrawable(getResources().getDrawable(R.drawable.sunday4));
            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/hyv14e2QDq0"); // missing 'http://' will cause crashed
                    Intent intent23 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent23);
                }
            });

        }
        else if ((a ==1) &&(b == 7)) {

            txt1.setText("Push-Up" + b);

            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=_UBOxUl0Sl4"); // missing 'http://' will cause crashed
                    Intent intent24 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent24);
                }
            });

        }

        else if ((a ==2) &&(b == 7)) {

            txt1.setText("High Knees in Place" + b);

            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/bZUfaLxJ36M"); // missing 'http://' will cause crashed
                    Intent intent25 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent25);
                }
            });

        }

        else if ((a ==3) &&(b == 7)) {

            txt1.setText("Push-Up" + b);

            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://www.youtube.com/watch?v=_UBOxUl0Sl4"); // missing 'http://' will cause crashed
                    Intent intent26 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent26);
                }
            });

        }

        else if ((a ==5) &&(b == 7)) {

            txt1.setText("Bodyweight Glute Bridge" + b);

            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/5kpY2SfTkYY"); // missing 'http://' will cause crashed
                    Intent intent24 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent24);
                }
            });

        }

        else if ((a ==6) &&(b == 7)) {

            txt1.setText("High Knees in Place" + b);

            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/bZUfaLxJ36M"); // missing 'http://' will cause crashed
                    Intent intent24 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent24);
                }
            });

        }

        else if ((a ==7) &&(b == 7)) {

            txt1.setText("Knee Touches in Place" + b);

            imageView_exercise_video.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Uri uri = Uri.parse("https://youtu.be/PL49-xf_v90"); // missing 'http://' will cause crashed
                    Intent intent24 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent24);
                }
            });

        }
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent i = new Intent(ExerciseVideo.this,DayListActivity.class);
                startActivity(i);


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
                Intent aboutIntent = new Intent(ExerciseVideo.this, AboutActivity.class);
                startActivity(aboutIntent);
                return true;

            case R.id.share:

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT," Menu: "+"\n"+txt1.getText().toString()+"\n"+
                        txt_b.getText().toString()+"\n"+
                        txt2.getText().toString()+"\n"+
                        txt7.getText().toString()+"\n"+
                        txt8.getText().toString()+"\n"+

                        txt_ms.getText().toString()+"\n"+
                        txt3.getText().toString()+"\n"+
                        txt9.getText().toString()+"\n"+
                        txt10.getText().toString()+"\n"+

                        txt_l.getText().toString()+"\n"+
                        txt4.getText().toString()+"\n"+
                        txt11.getText().toString()+"\n"+
                        txt12.getText().toString()+"\n"+

                        txt_as.getText().toString()+"\n"+
                        txt5.getText().toString()+"\n"+
                        txt13.getText().toString()+"\n"+
                        txt14.getText().toString()+"\n"+

                        txt_d.getText().toString()+"\n"+
                        txt6.getText().toString()+"\n"+
                        txt15.getText().toString()+"\n"+
                        txt16.getText().toString()+"\n"+
                        " Jigar Thakkar "+
                        "="+getPackageName());
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
