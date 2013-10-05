package com.example.handsonandroid;

import android.app.Activity;
import android.os.Bundle;

public class EventActivity extends Activity
{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
		Bundle extras = getIntent().getExtras();
		Events event = null;
		if (extras != null) {
		    event = (Events) extras.get("Event");
		}
		
	}
	
}
