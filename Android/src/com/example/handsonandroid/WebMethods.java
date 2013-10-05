package com.example.handsonandroid;

import java.sql.Date;

public class WebMethods {

	public WebMethods(){
		
	}
	
	public static void login(){
		
		//Create the new user, User user = new User(); user.setUser(this);
	}
	
	public static void registerUser(){
		
	}
	
	public static void signUpForEvent(){
		//Event signup goes here!
		
		
		String title = "Default";
		String description = "Default";
		String location = "Default";
		Date date = new Date(1994, 05, 27);
		int beginTime = 000;
		int endTime = 000;
		
		WebMethods.addEventToCalendar(title, description, location, date, beginTime, endTime);
	}
	
	public static void queryByTag(){
		
	}
	
	public static void queryByCategory(){
		
	}
	
	public static void queryByDate(){
		
	}
	
	public static void queryByZipcode(){
		
	}
	
	public static void updateFacebook(){
		
	}
	
	public static void updateTwitter(){
		
	}
	
	//Helper Additional Methods
	
	private static void addEventToCalendar(String title, String description,  String location, Date date, int beginTime, int endTime){
		
	}
	
}
