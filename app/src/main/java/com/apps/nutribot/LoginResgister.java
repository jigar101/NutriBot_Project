package com.apps.nutribot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.apps.utils.DBHelper;

import java.io.IOException;

public class LoginResgister extends AppCompatActivity {

    DBHelper dbHelper;
    TextView textView_regis,textView_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_resgister);

        dbHelper = new DBHelper(this);
        try {
            dbHelper.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        textView_regis = (TextView)findViewById(R.id.textView_register);
        textView_login = (TextView)findViewById(R.id.textView_login);

        textView_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginResgister.this,Register.class);
                startActivity(intent);
            }
        });

        textView_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginResgister.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
