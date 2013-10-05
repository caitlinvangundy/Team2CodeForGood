package com.example.handsonandroid.custom_calendar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import com.example.handsonandroid.Events;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class CalendarUtility {
	public static ArrayList<String> nameOfEvent = new ArrayList();
	public static ArrayList<String> startDates = new ArrayList();
	public static ArrayList<String> endDates = new ArrayList();
	public static ArrayList<String> descriptions = new ArrayList();

	public static ArrayList readCalendarEvent(Context context) {
		Cursor cursor = context.getContentResolver()
				.query(Uri.parse("content://com.android.calendar/events"),
						new String[] { "calendar_id", "title", "description",
					"dtstart", "dtend", "eventLocation" }, null,
					null, null);
		cursor.moveToFirst();
		// fetching calendars name
		String CNames[] = new String[cursor.getCount()];

		// fetching calendars id
		nameOfEvent.clear();
		startDates.clear();
		endDates.clear();
		descriptions.clear();
		
		int i = 0;
		try{
		
			for (i = 0; i < CNames.length; i++) {
	
				nameOfEvent.add(cursor.getString(1));
				startDates.add(getDate(Long.parseLong(cursor.getString(3))));
	  			endDates.add(getDate(Long.parseLong(cursor.getString(4))));
	  			descriptions.add(cursor.getString(2));
	  			CNames[i] = cursor.getString(1);
	  			cursor.moveToNext();
	
			} 
		
		}catch(Exception ex){}
		
		for(int a = 0; a < Events.getList().size(); a++){
				nameOfEvent.add(Events.getList().get(a).getOpportunityName());
				startDates.add(Events.getList().get(a).getStartDate());
				endDates.add(Events.getList().get(a).getEndDate());
				descriptions.add(Events.getList().get(a).getVolunteerDescription());
				CNames[i] = Events.getList().get(a).getOpportunityName();
				i++;
		}
		
		return nameOfEvent;
	}

	public static String getDate(long milliSeconds) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(milliSeconds);
		return formatter.format(calendar.getTime());
 	}
	
	public static String getDate(int year, int month, int day, int startHour, int endHour){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.YEAR, year);
		
		
		return formatter.format(calendar.getTime());
	}
}