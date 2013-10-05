package com.example.handsonandroid;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * 
 * @author Garrett
 * 
 * This activity is the feed for the app, all the events.
 */
public class FeedActivity extends Activity {

	ArrayList<Events> events;
	User user;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_feed);

	    // DatabaseHandler db = new DatabaseHandler(this);
         
	        /**
	         * CRUD Operations
	         * */
	        // Inserting Contacts
	   
	         
	        // Reading all contacts
	    
		

	    
		
		
	}
	public void test(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("Cincinatti Walk for Good");
		your_array_list.add("JPMorgan and Chase Coding for the Good");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				
				
				Intent i = new Intent(FeedActivity.this,EventActivity.class);
				Events temp = Events.findByName(text.toString());
				i.putExtra("Event",temp);
				startActivity(i);
				
			}
		});
	}
	public void t1asa(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("Cincinatti Walk for Good");
		your_array_list.add("JPMorgan and Chase Coding for the Good");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				
				Intent i = new Intent(FeedActivity.this,EventActivity.class);
				Events temp = Events.findByName(text.toString());
				i.putExtra("Event",temp);
				startActivity(i);
			}
		});
	}
	public void t2(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("Cincinatti Walk for Good");
		your_array_list.add("JPMorgan and Chase Coding for the Good");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				
				Intent i = new Intent(FeedActivity.this,EventActivity.class);
				Events temp = Events.findByName(text.toString());
				i.putExtra("Event",temp);
				startActivity(i);
			}
		});
	}
	public void t3(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("Cincinatti Walk for Good");
		your_array_list.add("JPMorgan and Chase Coding for the Good");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				
				Intent i = new Intent(FeedActivity.this,EventActivity.class);
				Events temp = Events.findByName(text.toString());
				i.putExtra("Event",temp);
				startActivity(i);
			}
		});
	}
	public void t4(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("Cincinatti Walk for Good");
		your_array_list.add("JPMorgan and Chase Coding for the Good");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				
				Intent i = new Intent(FeedActivity.this,EventActivity.class);
				Events temp = Events.findByName(text.toString());
				i.putExtra("Event",temp);
				startActivity(i);
			}
		});
	}
	public void t5(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("Cincinatti Walk for Good");
		your_array_list.add("JPMorgan and Chase Coding for the Good");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				
				Intent i = new Intent(FeedActivity.this,EventActivity.class);
				Events temp = Events.findByName(text.toString());
				i.putExtra("Event",temp);
				startActivity(i);
			}
		});
	}
	public void t6(View v)
	{
		ListView lv1 = (ListView) findViewById(R.id.event_feed);
		
		ArrayList<String> your_array_list = new ArrayList<String>();
		your_array_list.add("Cincinatti Walk for Good");
		your_array_list.add("JPMorgan and Chase Coding for the Good");


		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_checked, your_array_list);


		lv1.setAdapter(arrayAdapter);
	
	
		lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() 
		{

			@SuppressLint("NewApi")
			@Override
			public void onItemClick(AdapterView<?> parent, final View view,
					int position, long id) 
			{
				final String item = (String) parent.getItemAtPosition(position);

				Context context = getApplicationContext();
				CharSequence text = item;
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
				
				Intent i = new Intent(FeedActivity.this,EventActivity.class);
				Events temp = Events.findByName(text.toString());
				i.putExtra("Event",temp);
				startActivity(i);
			}
		});
	}
	

}
