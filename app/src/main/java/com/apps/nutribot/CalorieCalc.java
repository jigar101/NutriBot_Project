package com.apps.nutribot;

import android.database.Cursor;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.apps.utils.DBHelper;

import java.util.ArrayList;

public class CalorieCalc extends AppCompatActivity {

    DBHelper dbHelper;
    Spinner spinner_food;
    EditText editText_gram, editText_piece;
    TextView textView_totalcalorie;
    Button button_calc;
    ItemCalorie itemCalorie;
    ArrayList<ItemCalorie> arrayList;
    ArrayList<String> arrayList_food;
    ArrayAdapter<String> dataAdapter;
    Boolean isGram = true;
    float calorie = 0;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_calc);

        dbHelper = new DBHelper(this);
        arrayList = new ArrayList<ItemCalorie>();
        arrayList_food = new ArrayList<String>();
        dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList_food);

        spinner_food = (Spinner)findViewById(R.id.spinner_food);
        editText_gram = (EditText)findViewById(R.id.editText_gram);
        editText_piece = (EditText)findViewById(R.id.editText_piece);
        textView_totalcalorie = (TextView)findViewById(R.id.textView_calorie_total);
        button_calc = (Button)findViewById(R.id.button_calcalc);

        getFoodfromDB();
        spinner_food.setAdapter(dataAdapter);

        button_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText_gram.getText().toString().trim().isEmpty() && editText_piece.getText().toString().trim().isEmpty()) {
                    Toast.makeText(CalorieCalc.this, "Please select amount of grams or pieces consumed", Toast.LENGTH_SHORT).show();
                } else {
                    calculateCalorie();
                }
            }
        });

        spinner_food.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                position = i;
                ((TextView) adapterView.getChildAt(0)).setTextColor(Color.GREEN);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        editText_gram.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                isGram = true;
            }
        });

        editText_piece.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                isGram = false;
            }
        });
    }

    private void getFoodfromDB() {
        Cursor cursor = dbHelper.getData("select * from calorie");
        cursor.moveToFirst();

        for(int i=0;i<cursor.getCount();i++) {
            String id = cursor.getString(cursor.getColumnIndex("id"));
            String food = cursor.getString(cursor.getColumnIndex("food"));
            String gram = cursor.getString(cursor.getColumnIndex("100gram"));
            String piece = cursor.getString(cursor.getColumnIndex("1piece"));

            itemCalorie = new ItemCalorie(id,food,gram,piece);
            arrayList.add(itemCalorie);
            arrayList_food.add(food);

            cursor.moveToNext();
        }
        cursor.close();
    }

    private void calculateCalorie() {
        if(isGram) {
            calorie = (Float.parseFloat(editText_gram.getText().toString())*Float.parseFloat(arrayList.get(position).getGram()))/100;
        } else {
            calorie = Float.parseFloat(editText_piece.getText().toString())*Float.parseFloat(arrayList.get(position).getPiece());
        }

        textView_totalcalorie.setText("Calories - "+calorie);
    }
}
