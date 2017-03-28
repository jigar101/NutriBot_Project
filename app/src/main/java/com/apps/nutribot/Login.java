package com.apps.nutribot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.apps.utils.DBHelper;

public class Login extends AppCompatActivity {

    DBHelper dbHelper;
    Button button;
    EditText editText_username, editText_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        dbHelper = new DBHelper(this);

        editText_username = (EditText)findViewById(R.id.editText_login_username);
        editText_pass = (EditText)findViewById(R.id.editText_login_pass);
        button = (Button)findViewById(R.id.button_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()) {
                    if(dbHelper.isLogin(editText_username.getText().toString(),editText_pass.getText().toString())) {
                        Intent intent = new Intent(Login.this,MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Login.this, "Username and password not matched", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private Boolean validate() {
        if(editText_username.getText().toString().trim().isEmpty()) {
            Toast.makeText(Login.this, "Please enter username", Toast.LENGTH_SHORT).show();
            return false;
        } else if(editText_pass.getText().toString().trim().isEmpty()) {
            Toast.makeText(Login.this, "Please enter Password", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
}
