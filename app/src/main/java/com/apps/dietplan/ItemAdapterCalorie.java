package com.apps.dietplan;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.nutribot.R;

public class ItemAdapterCalorie extends ArrayAdapter<String>{
	
	Typeface tf;
	Context context;
	String[] level;
	int[] food;
	TextView txt1,txt2;
	ImageView img;

	public ItemAdapterCalorie(Context context, String[] level, int[] food) {
		super(context, R.layout.calorie_item,level);
		// TODO Auto-generated constructor stub
		this.context = context;
		this.level = level;
		this.food = food;		
	}	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.calorie_item,parent,false);
		
		txt1 = (TextView) rowView.findViewById(R.id.textView1);
		txt2 = (TextView) rowView.findViewById(R.id.textView2);
		img = (ImageView) rowView.findViewById(R.id.imageView1);
		
		txt2.setText(level[position]);
		img.setImageResource(food[position]);		 
		 
		 
		return rowView;
	}

}
