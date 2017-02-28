package com.apps.dietplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.apps.nutribot.R;

public class MenuAcivity extends Activity{
	
	TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16;
	TextView txt_b,txt_ms,txt_l,txt_as,txt_d;
	ScrollView scView;
	Button btn1;
	ImageView img1;
	LinearLayout linearLayout;
	int a,b;
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		 
		setContentView(R.layout.menu_main);
		
		linearLayout = (LinearLayout)findViewById(R.id.vertical1);
		img1 = (ImageView)findViewById(R.id.imageView1);		 
		txt1 = (TextView)findViewById(R.id.textView1);
		txt2 = (TextView)findViewById(R.id.textView2);
		txt3 = (TextView)findViewById(R.id.textView3);
		txt4 = (TextView)findViewById(R.id.textView4);
		txt5 = (TextView)findViewById(R.id.textView5);
		txt6 = (TextView)findViewById(R.id.textView6);
		txt7 = (TextView)findViewById(R.id.textView7);
		txt8 = (TextView)findViewById(R.id.textView8);
		txt9 = (TextView)findViewById(R.id.textView9);
		txt10 = (TextView)findViewById(R.id.textView10);
		txt11 = (TextView)findViewById(R.id.textView11);
		txt12 = (TextView)findViewById(R.id.textView12);
		txt13 = (TextView)findViewById(R.id.textView13);
		txt14 = (TextView)findViewById(R.id.textView14);
		txt15 = (TextView)findViewById(R.id.textView15);
		txt16 = (TextView)findViewById(R.id.textView16);
		txt_b = (TextView)findViewById(R.id.text_bf);
		txt_ms = (TextView)findViewById(R.id.text_ms);
		txt_l = (TextView)findViewById(R.id.text_lunch);
		txt_as = (TextView)findViewById(R.id.text_snack);
		txt_d = (TextView)findViewById(R.id.text_diner);
		
		scView = (ScrollView)findViewById(R.id.scrollView1);
		btn1 = (Button)findViewById(R.id.button1);
		
				 		
		Intent i = getIntent();
		a = i.getIntExtra("box1",0);
		b = i.getIntExtra("box2",0); 
		 
		
		if ((a == 1) && (b == 1)) {
			
			txt1.setText("Lose 1200 Calorie Menu - Day" + b);
			
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\nOrange, medium\nCup Cheerios Cereal");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Cup Cantaloupe Melon");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Vietnamese-Style Beef & Noodle Broth ->Recipe Click Here");
			txt11.setText("Whole-Wheat Pita Bread, small\n1 Cup Skim Milk\nFudgsicle, no sugar added");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("2 Tablespoons Prepared Hummus\n3 Ounces Celery Sticks");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Green & Yellow Beans with Wild Mushrooms ->Recipe Click Here");
			txt15.setText("1/2 Banana, small\n1/2 Cup Cooked Brown Rice");
			txt16.setText("Roasted Cod with Warm Tomato-Olive-\nCaper Tapenade ->Recipe Click Here");
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",1);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",2);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",3);
					startActivity(j);
				}
			});
		} else if ((a == 2) && (b == 1)) {
			
			txt1.setText("Lose 1400 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1 Orange, medium\n1 1/4 Cups Cheerios Cereal");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Cup Cantaloupe Melon\n1/2 Cup Low Fat, Low Sodium Cottage Cheese");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Warm Salmon Salad with Crispy Potatoes ->Recipe Click Here");
			txt11.setText("1Whole-Wheat Pita Bread, small\n1Cup Skim Milk\n1Fudgsicle, no sugar added");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("2 Tablespoons Prepared Hummus\n4 Ounces Carrot Sticks");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Beef Tataki ->Recipe Click Here");
			txt15.setText("1Cup Steamed Spinach\n2/3 Cup Cooked Brown Rice");
			txt16.setText("�Cocoa-Nut� Bananas ->Recipe Click Here");
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",4);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",5);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",6);
					startActivity(j);
				}
			});
			
		}else if ((a == 3) && (b == 1)) {
			
			txt1.setText("Lose 1600 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1 Orange, medium\n1 1/4 Cups Cheerios Cereal\n1 Hard Boiled Egg");
			txt8.setVisibility(View.GONE);
			
			txt3.setText("Pineapple-Raspberry Parfaits ->Recipe Click Here");
			txt9.setVisibility(View.GONE);
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Lemony Lentil Salad with Salmon ->Recipe Click Here");
			txt11.setText("Whole-Wheat Pita Bread, small\n1 Fudgsicle, no sugar added");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("2 Tablespoons Prepared Hummus\n4 Ounces Carrot Sticks");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Grilled Steak with Pepper Relish ->Recipe Click Here");
			txt15.setText("3/4 Cup Cooked Brown Rice\n1 Cup Steamed Spinach\n1 1/2 Cups Cantaloupe Melon");
			txt16.setVisibility(View.GONE);
			
			txt3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",7);
					startActivity(j);
				}
			});
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",8);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",9);
					startActivity(j);
				}
			});
			
		}else if ((a == 4) && (b == 1)) {
			
			txt1.setText("Lose 1800 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup 1% Milk\n1 Orange, medium\n1 1/2 Cups Cheerios Cereal");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Ounce Almonds,salted");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Vietnamese Steak Sandwich ->Recipe Click Here");
			txt11.setText("1 Cup 1% Milk\n4 Ounces Fresh Pineapple"); 
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt11.setText("3 Tablespoons Prepared Hummus\n4 Ounces Carrot Sticks");
			txt12.setVisibility(View.GONE);
			
			txt6.setText("Grilled Whole Trout with Lemon-Tarragon Bean Salad ->Recipe Click Here");
			txt15.setText("2/3 Cup Cooked Brown Rice\n1 Cup Tossed Salad Mix\n4 Teaspoons Vinegar & Oil Salad Dressing");
			txt16.setText("Strawberry Sherbet ->Recipe Click Here");
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",10);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",11);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",12);
					startActivity(j);
				}
			});
			
		}else if ((a == 5) && (b == 1)) {
			
			txt1.setText("Lose 2000 Calorie Menu - Day" + b);
			
			txt2.setText("Cranberry Muesli ->Recipe Click Here");
			txt7.setText("1 Cup 1% Milk\n1 Orange, medium\n");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("3 Apricots");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Herbed Lamb Chops with Greek Couscous Salad ->Recipe Click Here");
			txt11.setText("1 Cup Cantaloupe Melon\n1 Cup 1% Milk\n1 Whole-Wheat Roll");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Ounce Dry Roasted Salted Peanuts");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Turkey with Blueberry Pan Sauce ->Recipe Click Here");
			txt15.setText("3/4 Cup Cooked Brown Rice\n3/4 Cup Steamed Green Beans\n1 Cup Tossed Salad Mix\n2 Tablespoons Vinegar & Oil Salad Dressing\n1 Piece Multi-Grain Bread\n3/4 Cup Nonfat Strawberry Frozen Yogurt");
			txt16.setVisibility(View.GONE);		 
			 
			
			txt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",13);
					startActivity(j);
				}
			});
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",14);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",15);
					startActivity(j);
				}
			});
		}
		else if ((a == 1) &&(b == 2)) {
			
			txt1.setText("Lose 1200 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1/2 Banana, small\n1 Cup Bran Flakes Cereal");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Fruit & Nut Granola Bar");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Spicy Thai Shrimp Salad ->Recipe Click Here");
			txt11.setText("2 Cups Romaine Lettuce, shredded\n1 Whole-Wheat Pita Bread, small");
			txt12.setText("Chocolate-Raspberry Frozen Yogurt Pops ->Recipe Click Here");
			
			txt5.setVisibility(View.GONE);
			txt13.setText("6 Ounces Nonfat Vanilla or Lemon Yogurt,\nSweetened with Low-Calorie Sweetener");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Almond-Crusted Chicken Fingers ->Recipe Click Here");
			txt15.setText("1 Cup Steamed Brussels Sprouts\n2/3 Cup Cooked Couscous\n1 Peach, medium");
			txt16.setVisibility(View.GONE);			 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",16);
					startActivity(j);
				}
			});
			
			txt12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",17);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",18);
					startActivity(j);
				}
			});
			
		}  else if ((a == 2) && (b == 2)) {
			
			txt1.setText("Lose 1400 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1 Banana, small\n1 1/4 Cups Bran Flakes Cereal");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Fruit & Nut Granola Bar");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("A Gilding of Shrimp & Saffron Rice ->Recipe Click Here");
			txt11.setText("1 Whole-Wheat Bread");
			txt12.setText("Watermelon-Blueberry Ice Pops ->Recipe Click Here");
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Cup Popcorn, air popped\n1 Cup Skim Milk");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Grilled Chicken Tenders with Cilantro Pesto ->Recipe Click Here");
			txt15.setText("1 Cup Tossed Salad Mix\n1 Tablespoon Low Calorie Caesar Salad Dressing\n1/2 Cup Cooked Couscous\n1/2 Cup Steamed Red Cabbage\n1 Peach, medium");
			txt16.setVisibility(View.GONE);	
			 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",19);
					startActivity(j);
				}
			});
			
			txt12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",20);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",21);
					startActivity(j);
				}
			});
		}else if ((a == 3) && (b == 2)) {
			
			txt1.setText("Lose 1600 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1 Banana, small\n1 1/2 Cups Bran Flakes Cereal");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Whole-Grain Rice Cake\n1 1/2 Ounces Low Fat Cheddar Cheese");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Chopped Greek Salad with Chicken ->Recipe Click Here");
			txt11.setText("1 Whole-Wheat Bread\n1 Cup Strawberries");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Ounce Almonds, salted");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Mixed Lettuce Salad with Cucumber Herb Vinaigrette ->Recipe Click Here");
			txt15.setText("1 Whole-Wheat Roll\n1/2 Cup Cooked Couscous\n1 Peach, medium");
			txt16.setText("Grilled Tuna with Olive Relish ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",22);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",23);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",24);
					startActivity(j);
				}
			});
			
		}else if ((a == 4) && (b == 2)) {
			
			txt1.setText("Lose 1800 Calorie Menu - Day" + b);
			
			txt2.setText("Maple-Nut Granola ->Recipe Click Here");
			txt7.setText("1 Cup 1% Milk\n1 Banana, small");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("2 Whole-Grain Rice Cake\n1 Peach, medium");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Tex-Mex Taco Salad ->Recipe Click Here");
			txt11.setText("1 Cup 1% Milk\n1 Corn Tortilla\n1/2 Cup Nonfat Strawberry Frozen Yogurt");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Ounce Pistachios, unsalted");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Tuscan Pork Loin ->Recipe Click Here");
			txt15.setText("3/4 Cup Cooked Couscous\n3/4 Cup Mashed Acorn Squash\n1 Cup Strawberries");
			txt16.setVisibility(View.GONE);
 
			
			txt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",25);
					startActivity(j);
				}
			});
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",26);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",27);
					startActivity(j);
				}
			});
		}else if ((a == 5) && (b == 2)) {
		
			txt1.setText("Lose 2000 Calorie Menu - Day" + b);
			
			txt2.setText("Blueberry-Maple Muffins ->Recipe Click Here");
			txt7.setText("1 Cup 1% Milk\n 1 Banana, small\n1 Teaspoon Creamy Peanut Butter");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Ounce Low Fat Cheddar Cheese\n2 Whole-Grain Rice Cake");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Quick Paella with Shrimp & Mussels ->Recipe Click Here");
			txt11.setText("1 Whole-Wheat Pita Bread, small\n1 Cup 1% Milk\n1 Pear, medium");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("2 Apricots\n1 Ounce Whole-Wheat Pretzel");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Green Goddess Salad ->Recipe Click Here");
			txt15.setText("3/4 Cup Cooked Couscous\n3/4 Cup Steamed Broccoli\n3 Ounces Lean London Broil Steak, broiled\n1 Cup Strawberries");
			txt16.setVisibility(View.GONE);
 
			
			txt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",28);
					startActivity(j);
				}
			});
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",29);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",30);
					startActivity(j);
				}
			});
		}else if ((a == 1) &&(b == 3)) {
			
			txt1.setText("Lose 1200 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Whole-Wheat English Muffin\n1 Cup Skim Milk\n1/2 Cup Blueberries\n1 Teaspoon Fat Free Cream Cheese");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Apple, small");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Dressing Spanish Tortilla ->Recipe Click Here");
			txt11.setText("1 Cup Tossed Salad Mix\n1 Tablespoon Fat Free Blue Cheese Salad\n1/2 Cup Fresh Pineapple\n1 Slice Reduced-Calorie Oatmeal Bran\nBread");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("6 Ounces Nonfat Vanilla or Lemon Yogurt, Sweetened with Low-Calorie Sweetener");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Simple Saut�ed Spinach ->Recipe Click Here");
			txt15.setText("1 Cup Skim Milk\n1/2 Cup Cooked Quinoa\n1 Nectarine, medium");
			txt16.setText("Shrimp with Mango & Basil ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",31);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",32);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",33);
					startActivity(j);
				}
			});
			
		}  else if ((a == 2) && (b == 3)) {
			
			txt1.setText("Lose 1400 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Whole-Wheat English Muffin\n1 Cup Skim Milk\n1/2 Cup Blueberries\n1 Tablespoon Creamy Peanut Butter, unsalted");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Apple, small");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Salmon Chowder ->Recipe Click Here");
			txt11.setText("2 Cups Tossed Salad Mix\n4 Teaspoons Vinegar & Oil Salad Dressing\n1/2 Cup Fresh Pineapple\n1 Slice Reduced-Calorie Oatmeal Bran Bread");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("6 Ounces Nonfat Vanilla or Lemon Yogurt, Sweetened with Low-Calorie Sweetener\n2 Tablespoons Low-Fat Granola Cereal with Fruit");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Lemon-Dill Green Beans ->Recipe Click Here");
			txt15.setText("1 Cup Skim Milk\n1/2 Cup Cooked Quinoa\n1 Nectarine, medium");
			txt16.setText("Chicken Breasts Stuffed with Pimiento Cheese ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",34);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",35);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",36);
					startActivity(j);
				}
			});
			
		}else if ((a == 3) && (b == 3)) {
			
			txt1.setText("Lose 1600 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Whole Grain Oat Bran Bagel\n1 Cup Skim Milk\n1/2 Cup Blueberries\n1 Tablespoon Creamy Peanut Butter, unsalted");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Apple, small");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Green Eggs & Ham Frittata ->Recipe Click Here");
			txt11.setText("1 Cup Tossed Salad Mix\n1 Tablespoon Vinegar & Oil Salad Dressing\n1/2 Cup Cooked Brown Rice\n1/2 Cup Fresh Pineapple");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("6 Ounces Nonfat Vanilla or Lemon Yogurt, Sweetened with Low-Calorie Sweetener");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Cornmeal-Crusted Chicken Nuggets with Blackberry Mustard ->Recipe Click Here");
			txt15.setText("3/4 Cup Steamed Carrots\n1 Cup Skim Milk\n1 Nectarine, medium");
			txt16.setText("Spiced Corn & Rice Pilaf ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",37);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",38);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",39);
					startActivity(j);
				}
			});
			
		}else if ((a == 4) && (b == 3)) {
			
			txt1.setText("Lose 1800 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("3/4 Cup Hot Oatmeal\n1 Cup 1% Milk\n1 Cup Blueberries");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Fruit & Nut Granola Bar");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Mediterranean Wrap ->Recipe Click Here");
			txt11.setText("1 Cup 1% Milk\n1 Nectarine, medium");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("6 Ounces Nonfat Plain Yogurt\n1/4 Cup Blueberries");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Steak & Purple-Potato Salad ->Recipe Click Here");
			txt15.setText("1 Whole-Wheat Roll\n1 Teaspoon Butter, salted");
			txt16.setText("Roasted Peach Sundaes ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",40);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",41);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",42);
					startActivity(j);
				}
			});
			
		}else if ((a == 5) && (b == 3)) {
			
			txt1.setText("Lose 2000 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("3/4 Cup Hot Oatmeal\n1 Cup 1% Milk\n1 Cup Blueberries\n1 Tablespoon Walnuts");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("6 Ounces Low Fat Vanilla Yogurt");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Shrimp Po' Boy ->Recipe Click Here");
			txt11.setText("2/3 Cup Prepared Coleslaw\n1 Cup 1% Milk\n1 Nectarine, medium");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1/4 Cup Prepared Salsa\n1 1/2 Ounces Baked Tortilla Chips");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("One-Dish Chicken & Rice (Asopao de Pollo) ->Recipe Click Here");
			txt15.setText("2 Tablespoons Low Calorie Caesar Salad Dressing\n1 Whole-Wheat Roll\n1 Cup Tossed Salad Mix");
			txt16.setText("Blueberry Tart with Walnut Crust ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",43);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",44);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",45);
					startActivity(j);
				}
			});
			
			
		}else if ((a == 1) &&(b == 4)) {
			
			txt1.setText("Lose 1200 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1/2 Cup Hot Oatmeal\n1 Ounce Dried Fruit\n1 Tablespoon Walnuts");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Kiwi");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Puerto Rican Fish Stew (Bacalao) ->Recipe Click Here");
			txt11.setText("1 Cup Tossed Salad Mix\n1 Tablespoon Low Calorie Caesar Salad\nDressing\n1 Slice Reduced-Calorie Oatmeal Bran\nBread\n1 Cup Honeydew Melon");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Cup Blackberries\n1 Cup Skim Milk");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Maple-Glazed Chicken Breasts ->Recipe Click Here");
			txt15.setText("1/2 Cup Cooked Brown Rice\n1/2 Cup Mango");
			txt16.setText("Roasted Squash & Fennel with Thyme ->Recipe Click Here");
			
			 
			
			 txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",46);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",47);
					startActivity(j);
				}
			});
			 
				txt16.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Intent j = new Intent(MenuAcivity.this,Recipe.class);
						j.putExtra("box3",48);
						startActivity(j);
					}
				});
				
			
		} else if ((a == 2) && (b == 4)) {
			txt1.setText("Lose 1400 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n2/3 Cup Hot Oatmeal\n1 Ounce Dried Fruit\n1 Tablespoon Walnuts");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Kiwi");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Lemon Chicken Stir-Fry ->Recipe Click Here");
			txt11.setText("1 Cup Tossed Salad Mix\n1 Tablespoon Vinegar & Oil Salad Dressing\n1/2 Cup Cooked Couscous\n1 Cup Honeydew Melon");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Cup Blackberries\nn1 Cup Skim Milk");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Pistachio-Crusted Tuna Steaks ->Recipe Click Here");
			txt15.setText("1/2 Cup Cooked Brown Rice\n1/2 Cup Mango");
			txt16.setText("Roasted Brussels Sprouts & Shallots ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",49);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",50);
					startActivity(j);
				}
			});
			 
				txt16.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Intent j = new Intent(MenuAcivity.this,Recipe.class);
						j.putExtra("box3",51);
						startActivity(j);
					}
				});
				
		}else if ((a == 3) && (b == 4)) {
			txt1.setText("Lose 1600 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1 Kiwi\n1 Cup Whole Grain Flakes Cereal");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1/2 Ounce Walnuts\n1 Ounce Dried Fruit");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Fragrant Fish Soup ->Recipe Click Here");
			txt11.setText("1 Cup Tossed Salad Mix\n1 Tablespoon Low Calorie Caesar Salad Dressing\n1 Whole-Wheat Roll\n1 Cup Honeydew Melon");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Cup Blackberries\n1 Cup Skim Milk");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Wok-Seared Chicken Tenders with Asparagus & Pistachios ->Recipe Click Here");
			txt15.setText("2/3 Cup Cooked Brown Rice\n1/2 Cup Mango");
			txt16.setText("Oven-Fried Zucchini Sticks ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",52);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",53);
					startActivity(j);
				}
			});
			
				txt16.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Intent j = new Intent(MenuAcivity.this,Recipe.class);
						j.putExtra("box3",54);
						startActivity(j);
					}
				});
				
		}else if ((a == 4) && (b == 4)) {
			txt1.setText("Lose 1800 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup 1% Milk\n1 Kiwi\n1 1/2 Cups Cheerios Cereal");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("6 Ounces Nonfat Plain Yogurt\n1 Tablespoon Granola Cereal");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Nouveau Ni�oise ->Recipe Click Here");
			txt11.setText("1 Serving Whole-Wheat Pita Bread, small\n1 Cup Grapes");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Cup Blackberries");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Boneless Pork Chops with Mushrooms & Thyme ->Recipe Click Here");
			txt15.setText("1 Whole-Wheat Roll\n3/4 Cup Cooked Pearled Barley\n1 Cup Steamed Green Beans");
			txt16.setText("Ginger Crinkle Cookies ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",55);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",56);
					startActivity(j);
				}
			});
			 
				txt16.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Intent j = new Intent(MenuAcivity.this,Recipe.class);
						j.putExtra("box3",57);
						startActivity(j);
					}
				});
				
		}else if ((a == 5) && (b == 4)) {
			txt1.setText("Lose 2000 Calorie Menu - Day" + b);
			
			txt2.setText("Banana-Cocoa Soy Smoothie ->Recipe Click Here");
			txt7.setVisibility(View.GONE);
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("6 Ounces Low Fat Vanilla Yogurt\n2 Tablespoons Granola Cereal");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Philly Cheese Steak Sandwich ->Recipe Click Here");
			txt11.setText("1 Cup 1% Milk\n1 Kiwi\n1 Ounce Sweet Potato Chips");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Cup Blackberries");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Fresh Pomodoro Pasta, White Beans & Olives ->Recipe Click Here");
			txt15.setText("1 Whole-Wheat Roll\n1 Cup Tossed Salad Mix\n1 Tablespoon Vinegar & Oil Salad Dressing\n1 Cup Honeydew Melon");
			txt16.setVisibility(View.GONE);
 
			
			txt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",58);
					startActivity(j);
				}
			});
			 
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",59);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",60);
					startActivity(j);
				}
			});
		} 
		else if ((a == 1) &&(b == 5)) {
			
			txt1.setText("Lose 1200 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Scrambled Eggs\n1 Slice Reduced-Calorie Oatmeal Bran\nBread\n1/2 Cup Grapefruit\n1 Cup Skim Milk");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("6 Ounces Nonfat Vanilla or Lemon Yogurt,n Sweetened with Low-Calorie Sweetener");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Chicken & White Bean Soup ->Recipe Click Here");
			txt11.setText("Cup Skim Milk\n1 Cup Tossed Salad Mix\n1 Tablespoon Fat Free French Salad\nDressing\n2 Slices Reduced-Calorie Oatmeal Bran\nBread");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1/2 Cup Unsweetened Applesauce");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Bistro Beef Tenderloin ->Recipe Click Here");
			txt15.setText("1/2 Cup Cooked Quinoa\n1 Cup Strawberries");
			txt16.setText("Roasted Baby Bok Choy ->Recipe Click Here");
			
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",61);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",62);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",63);
					startActivity(j);
				}
			});
			
		} else if ((a == 2) && (b == 5)) {
			txt1.setText("Lose 1400 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Scrambled Eggs\n1 Corn Tortilla\n2 Tablespoons Prepared Salsa\n3/4 Cup Grapefruit\n1 Cup Skim Milk");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("6 Ounces Nonfat Vanilla or Lemon Yogurt, Sweetened with Low-Calorie Sweetener");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Sweet Potato-Turkey Hash ->Recipe Click Here");
			txt11.setText("1 Cup Skim Milk\n1 Cup Tossed Salad Mix\n1 Tablespoon Low Calorie Caesar Salad Dressing\n1/2 Cup Unsweetened Applesauce");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Ounce Whole-Wheat Pretzel");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Cauliflower & Couscous Pilaf ->Recipe Click Here");
			txt15.setText("3/4 Cup Cooked Carrots, Sliced\n1 Cup Grapes");
			txt16.setText("Mustard-Maple Pork Tenderloin ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",64);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",65);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",66);
					startActivity(j);
				}
			});
			
		}else if ((a == 3) && (b == 5)) {
			txt1.setText("Lose 1600 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Scrambled Eggs\n2 Slices Oatmeal Bread\n1 Cup Grapefruit\n1 Cup Skim Milk");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("6 Ounces Nonfat Vanilla or Lemon Yogurt, Sweetened with Low-Calorie Sweetener\n1/4 Cup Alpen Cereal");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Sweet Potato-Turkey Hash ->Recipe Click Here");
			txt11.setText("1 Cup Skim Milk\n1 Cup Tossed Salad Mix\n1 Tablespoon Vinegar & Oil Salad Dressing");
			txt12.setText("Chocolate Bark with Pistachios & Dried Cherries ->Recipe Click Here");
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Ounce Whole-Wheat Pretzel");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Prosciutto-Wrapped Scallops with Spinach ->Recipe Click Here");
			txt15.setText("2/3 Cup Cooked Quinoa\n3/4 Cup Cooked Carrots, Sliced\n1 Cup Strawberries");
			txt16.setVisibility(View.GONE);
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",67);
					startActivity(j);
				}
			});
			
			txt12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",68);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",69);
					startActivity(j);
				}
			});
			
		}else if ((a == 4) && (b == 5)) {
			txt1.setText("Lose 1800 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("2 Scrambled Eggs\n2 Corn Tortillas\n2 Tablespoons Prepared Salsa\n1/2 Cup Grapefruit\n1 Cup 1% Milk");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Plum\n1 Fruit & Nut Granola Bar");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Wasabi Salmon Burgers ->Recipe Click Here");
			txt11.setText("1 Cup 1% Milk\n1 Whole-Wheat Roll\n1/2 Cup Prepared Coleslaw\n1 Clementine");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("6 Ounces Nonfat Plain Yogurt\n1 Tablespoon Granola Cereal\n1 Cup Strawberries");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Sirloin & Portobello Stew ->Recipe Click Here");
			txt15.setText("2 Tablespoons Low Calorie Caesar Salad Dressing\n1 Cup Tossed Salad Mix");
			txt16.setText("Peach & Blueberry Cobbler ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",70);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",71);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",72);
					startActivity(j);
				}
			});
			
		}else if ((a == 5) && (b == 5)) {
			txt1.setText("Lose 2000 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("2 Scrambled Eggs\n1 Corn Tortilla\n2 Tablespoons Prepared Salsa\n1 Cup Grapefruit\n1 Cup 1% Milk");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Plum\n1Fruit & Nut Granola Bar");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Mediterranean Tuna Antipasto Salad for Two ->Recipe Click Here");
			txt11.setText("1Whole-Wheat Pita Bread, small\n1 Cup Strawberries");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Ounce Dry Roasted Salted Pistachio Nuts");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Black Bean Croquettes with Fresh Salsa ->Recipe Click Here");
			txt15.setText("3/4 Cup Roasted Butternut Squash\n4 Teaspoons Vinegar & Oil Salad Dressing\n1 Cup Tossed Salad Mix");
			txt16.setText("Bev's Chocolate Chip Cookies ->Recipe Click Here");
 	
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",73);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",74);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",75);
					startActivity(j);
				}
			});
			
		}else if ((a == 1) &&(b == 6)) {
			
			txt1.setText("Lose 1200 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1 Whole-Wheat English Muffin\n1 Teaspoon Creamy Peanut Butter\n1Tablespoon Sugar-Free Jam");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Orange, medium");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("BLT Salad ->Recipe Click Here");
			txt11.setText("1 Cup Skim Milk\n1 Whole-Wheat Pita Bread, small\n1 Cup Watermelon");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("6 Ounces Nonfat Vanilla or Lemon Yogurt, Sweetened with Low-Calorie Sweetener");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Roasted Cod, Tomatoes, Orange & Onions ->Recipe Click Here");
			txt15.setText("2/3 Cup Cooked Brown Rice\n1 Cup Cantaloupe Melon");
			txt16.setText("Green Salad with Asparagus & Peas (Salat med Asparges og �rter) ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",76);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",77);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",78);
					startActivity(j);
				}
			});
			
		} else if ((a == 2) && (b == 6)) {
			txt1.setText("Lose 1400 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1 Whole-Wheat English Muffin\n1 Tablespoon Creamy Peanut Butter\n1 Tablespoon Sugar-Free Jam");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Orange, medium");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Fragrant Shredded Beef Stew ->Recipe Click Here");
			txt11.setText("1 Cup Skim Milk\n1 Whole-Wheat Pita Bread, small\n1 Cup Watermelon");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("8 Ounces Nonfat Vanilla or Lemon Yogurt, Sweetened with Low-Calorie Sweetener");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Seared Scallops with Brandied Leeks & Mushrooms ->Recipe Click Here");
			txt15.setText("1/2 Cup Cooked Brown Rice\n1 Cup Steamed Cauliflower\n1 Cup Grapes");
			txt16.setVisibility(View.GONE);
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",79);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",80);
					startActivity(j);
				}
			});
			
		}else if ((a == 3) && (b == 6)) {
			txt1.setText("Lose 1600 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup Skim Milk\n1 Whole-Wheat English Muffin\n2 Teaspoons Creamy Peanut Butter\n1Tablespoon Sugar-Free Jam");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Orange, medium\n1 Fruit & Nut Granola Bar");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Southwestern Rice & Pinto Bean Salad ->Recipe Click Here");
			txt11.setText("1 Cup Skim Milk\n1Whole-Wheat Pita Bread, small\n1 Cup Watermelon");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("8 Ounces Nonfat Vanilla or Lemon Yogurt, Sweetened with Low-Calorie Sweetener");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Grilled Salmon with Mustard & Herbs ->Recipe Click Here");
			txt15.setText("2/3 Cup Cooked Brown Rice\n1 Cup Blueberries");
			txt16.setText("Warm Red Cabbage Salad ->Recipe Click Here");
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",81);
					startActivity(j);
				}
			});
			
			txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",82);
					startActivity(j);
				}
			});
			
			txt16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",83);
					startActivity(j);
				}
			});
			
		}else if ((a == 4) && (b == 6)) {
			txt1.setText("Lose 1800 Calorie Menu - Day" + b);
			
			txt2.setText("EatingWell Waffles ->Recipe Click Here");
			txt7.setText("1 Cup 1% Milk\n1/3 Cup Strawberries");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Orange, medium");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Bacony Barley Salad with Marinated Shrimp ->Recipe Click Here");
			txt11.setText("1Cup 1% Milk\n2Cups Romaine Lettuce, shredded\n2 Pieces Wasa rye crispbread crackers\n1Pear, medium");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("2 Cups Popcorn, air popped\n1 Tablespoon Grated Parmesan Cheese");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Oven-Fried Chicken ->Recipe Click Here");
			txt15.setText("1 Cup Steamed Cauliflower\n3/4 Cup Cooked Quinoa\n1 Cup Grapes");
			txt16.setVisibility(View.GONE);
 
			
			txt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",84);
					startActivity(j);
				}
			});
			 
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",85);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",86);
					startActivity(j);
				}
			});
			 
		}else if ((a == 5) && (b == 6)) {
			txt1.setText("Lose 2000 Calorie Menu - Day" + b);
			
			txt2.setText("Blueberry-Ricotta Pancakes ->Recipe Click Here");
			txt7.setText("1 Cup 1% Milk\n1/4 Cup Strawberries");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Orange, medium\n1/2 Cup Nonfat Vanilla Yogurt");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Crispy Fish Sandwich with Pineapple Slaw ->Recipe Click Here");
			txt11.setText("1Cup 1% Milk\n1 Cup Tossed Salad Mix\n4 Teaspoons Vinegar & Oil Salad Dressing\n1Pear, medium");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Ounce Almonds");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Thai Chicken Satay with Spicy Peanut Sauce ->Recipe Click Here");
			txt15.setText("1 Cup Steamed Cauliflower\n3/4 Cup Cooked Quinoa\n1 Cup Watermelon");
			txt16.setVisibility(View.GONE);
 
			
			txt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",87);
					startActivity(j);
				}
			});
			 
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",88);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",89);
					startActivity(j);
				}
			});
			 
		}else if ((a == 1) &&(b == 7)) {
			
			txt1.setText("Lose 1200 Calorie Menu - Day" + b);
			
			txt2.setText("Quick Breakfast Taco ->Recipe Click Here");
			txt7.setText("1 Cup Skim Milk\n1 Plum");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Apple, small");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Bok Choy-Apple Slaw ->Recipe Click Here");
			txt11.setText("1 Veggie Burger\n1 Whole-Wheat Roll\n1 Apricot");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("3 Ounces Carrot Sticks\n1/4 Cup Salsa");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Grilled Pork Tenderloin Marinated in Spicy Soy Sauce ->Recipe Click Here");
			txt15.setText("1 Cup Skim Milk\n1 Cup Tossed Salad Mix\n1 Tablespoon Low Calorie Caesar Salad Dressing\n1/2 Cup Cooked Brown Rice\n1 Peach, medium");
			txt16.setVisibility(View.GONE);
 
			
			txt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",90);
					startActivity(j);
				}
			});
			 
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",91);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",92);
					startActivity(j);
				}
			});
			 
		} else if ((a == 2) && (b == 7)) {
			txt1.setText("Lose 1400 Calorie Menu - Day" + b);
			
			txt2.setText("Egg & Salmon Sandwich ->Recipe Click Here");
			txt7.setText("1 Cup Skim Milk\n1 Plum");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("1 Serving Apple, small");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Cucumber & Black-Eyed Pea Salad ->Recipe Click Here");
			txt11.setText("1 Veggie Burger\n1 Whole-Wheat Roll\n1 Apricot");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("6 Ounces Carrot Sticks\n1/4 Cup Salsa");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Barbecue Pulled Chicken ->Recipe Click Here");
			txt15.setText("1 Cup Skim Milk\n3/4 Cup Steamed Green Beans\n1/2 Cup Cooked Brown Rice\n1 Peach, medium");
			txt16.setVisibility(View.GONE);
 
			
			txt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",93);
					startActivity(j);
				}
			});
			 
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",94);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",95);
					startActivity(j);
				}
			});
			 
		}else if ((a == 3) && (b == 7)) {
			txt1.setText("Lose 1600 Calorie Menu - Day" + b);
			
			txt2.setText("Quick Breakfast Taco ->Recipe Click Here");
			txt7.setText("1 Cup Skim Milk\n1 Plum");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("3 Apricots");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Grilled Smoky Eggplant Salad ->Recipe Click Here");
			txt11.setText("1 Veggie Burger\n1 Whole-Wheat Roll\n1/2 Cup Unsweetened Applesauce");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("4 Ounces Carrot Sticks\n2 Tablespoons Prepared Hummus");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Jumbo Prawns & Balsamic-Orange Onions ->Recipe Click Here");
			txt15.setText("1 Cup Skim Milk\n1 Cup Tossed Salad Mix\n1 Tablespoon Vinegar & Oil Salad Dressing\n2/3 Cup Cooked Brown Rice\n1 Cup Papaya");
			txt16.setVisibility(View.GONE);
 
			
			txt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",96);
					startActivity(j);
				}
			});
			 
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",97);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",98);
					startActivity(j);
				}
			});
			 
		}else if ((a == 4) && (b == 7)) {
			txt1.setText("Lose 1800 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup 1% Milk\n1 1/2 Cups Multigrain Cheerios Cereal\n1 Banana, small");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("6 Ounces Nonfat Plain Yogurt\n1/4 Cup Strawberries\n2 Tablespoons Walnuts");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Papaya-Avocado Salad ->Recipe Click Here");
			txt11.setText("3 Ounces Chicken Breast, Cooked Without Skin\n1 Whole-Wheat Roll\n3 Ounces Carrot Sticks\n1 Cup 1% Milk");
			txt12.setVisibility(View.GONE);
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Ounce Dry Roasted Salted Peanuts");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Gnocchi with Tomatoes, Pancetta & Wilted Watercress ->Recipe Click Here");
			txt15.setText("1 Cup Blueberries\n2 Ounces Romaine Lettuce, shredded\n2 Tablespoons Low Calorie Caesar Salad Dressing\n1 Whole-Wheat Roll");
			txt16.setVisibility(View.GONE);
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",99);
					startActivity(j);
				}
			});
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",100);
					startActivity(j);
				}
			});
			 
		}else if ((a == 5) && (b == 7)) {
			txt1.setText("Lose 2000 Calorie Menu - Day" + b);
			
			txt2.setVisibility(View.GONE);
			txt7.setText("1 Cup 1% Milk\n3/4 Cup Alpen Cereal\n1 Banana, small");
			txt8.setVisibility(View.GONE);
			
			txt3.setVisibility(View.GONE);
			txt9.setText("6 Ounces Low Fat Vanilla Yogurt\n1/4 Cup Strawberries");
			txt10.setVisibility(View.GONE);
			
			txt4.setText("Bread & Tomato Salad ->Recipe Click Here");
			txt11.setText("1 Ounce Low Fat Cheddar Cheese\n3 Ounces Chicken Breast, Cooked Without Skin\n1Whole-Wheat Roll");
			txt12.setText("Rhubarb-Vanilla Compote ->Recipe Click Here");
			
			txt5.setVisibility(View.GONE);
			txt13.setText("1 Ounce Whole-Wheat Pretzel");
			txt14.setVisibility(View.GONE);
			
			txt6.setText("Grilled Salmon with Mustard & Herbs ->Recipe Click Here");
			txt15.setText("1 Cup Blueberries\n1 1/2 Cups Tossed Salad Mix\n2 Tablespoons Vinegar & Oil Salad Dressing\n3/4 Cup Cooked Pearled Barley");
			txt16.setVisibility(View.GONE);
 
			
			txt4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",101);
					startActivity(j);
				}
			});
			
			txt12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",102);
					startActivity(j);
				}
			});
			
			 
			 txt6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent j = new Intent(MenuAcivity.this,Recipe.class);
					j.putExtra("box3",103);
					startActivity(j);
				}
			});
		}
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(MenuAcivity.this,CalorieLevel.class);
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
			Intent aboutIntent = new Intent(MenuAcivity.this, AboutActivity.class);
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
					 											" I Would like to share this with you. Here You Can Download This Application from PlayStore "+
					 											"https://play.google.com/store/apps/details?id="+getPackageName());
		    sendIntent.setType("text/plain");
		    startActivity(sendIntent);
			return true;
			
		default:
			return super.onOptionsItemSelected(item);
		}
		
	}

}
