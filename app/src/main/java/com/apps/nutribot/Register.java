package com.apps.nutribot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.apps.utils.DBHelper;
import com.apps.utils.ItemUser;

import java.io.IOException;

public class Register extends AppCompatActivity {

    DBHelper dbHelper;
    ItemUser itemUser;
    EditText editText_name, editText_username, editText_email, editText_pass, editText_contact;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        dbHelper = new DBHelper(this);

        editText_name = (EditText) findViewById(R.id.editText_name);
        editText_username = (EditText) findViewById(R.id.editText_username);
        editText_email = (EditText) findViewById(R.id.editText_email);
        editText_pass = (EditText) findViewById(R.id.editText_pass);
        editText_contact = (EditText) findViewById(R.id.editText_contact);

        button = (Button)findViewById(R.id.button_submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()) {
                    if(isUserNameAvail()) {
                        dbHelper.regisUser(itemUser);
                        Toast.makeText(Register.this, "You have been successfully registered", Toast.LENGTH_SHORT).show();
                        Register.this.finish();
                    } else {
                        Toast.makeText(Register.this, "Username not available, try another", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private Boolean validate() {
        if(editText_name.getText().toString().trim().isEmpty()) {
            Toast.makeText(Register.this, "Please Enter Name", Toast.LENGTH_SHORT).show();
            return false;
        } else if(editText_username.getText().toString().trim().isEmpty()) {
            Toast.makeText(Register.this, "Please Enter Username", Toast.LENGTH_SHORT).show();
            return false;
        } else if(editText_email.getText().toString().trim().isEmpty()) {
            Toast.makeText(Register.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
            return false;
        } else if(editText_pass.getText().toString().trim().isEmpty()) {
            Toast.makeText(Register.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
            return false;
        } else if(editText_contact.getText().toString().trim().isEmpty()) {
            Toast.makeText(Register.this, "Please Enter Contact Number", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            itemUser = new ItemUser("",editText_name.getText().toString(),editText_username.getText().toString(),editText_pass.getText().toString(),
                    editText_email.getText().toString(),editText_contact.getText().toString());
            return true;
        }
    }

    private Boolean isUserNameAvail() {
        return dbHelper.isUserNameAvail(editText_username.getText().toString());
    }
}
