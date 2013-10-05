package com.example.handsonandroid;

import java.sql.Date;
import java.util.ArrayList;

import com.example.handsonandroid.mail_utility.Mail;

import android.content.Context;

/**
 * 
 * @author Garrett
 *
 * The webmethods for the application. We are currently
 * using a pseudo database for this to make it easy.
 * 
 * The class is setup so that for implementation, they would simply strip
 * our pseudo database code and communicate with their servers for the same
 * actions, with roughly little to no modification required to the application.
 */
public class WebMethods {

	private static Context ctx;
	
	/**
	 * Default Constructor
	 */
	public WebMethods(Context ctx){
		WebMethods.ctx = ctx;
	}
	
	/**
	 * Method to do a login, using username and password
	 * @param userName : The username
	 * @param password : The password
	 * @return : Return false if login was unsuccessful
	 */
	public static boolean login(String userName, String password){
		
		//Create the new user, User user = new User(); user.setUser(this);
		
		//If the login query was succesful, save the preferences
		String firstName = "Default";
		String id = "0";
		boolean success = false;
		if(success){
			SaveSharedPreference.setData(ctx, SaveSharedPreference.USER_ID_KEY, id);
			SaveSharedPreference.setData(ctx, SaveSharedPreference.USER_NAME_KEY, firstName);
			SaveSharedPreference.setData(ctx, SaveSharedPreference.USER_PASS_KEY, password);
			SaveSharedPreference.setData(ctx, SaveSharedPreference.USERNAME_KEY, userName);
			
		}

		return false;
	}
	
	/**
	 * Login from the user preferences, 
	 * @return : Return false if login was unsuccessful
	 */
	public static boolean loginFromPref(){
		
		String userName = SaveSharedPreference.getData(WebMethods.ctx, SaveSharedPreference.USERNAME_KEY);
		String password = SaveSharedPreference.getData(WebMethods.ctx, SaveSharedPreference.USER_PASS_KEY);
		
		return false;
	}
	
	/**
	 * Register a new user
	 * @return : Return false if registration was unsuccesful
	 */
	public static boolean registerUser(){
		
		//Insert into table, then create a new user with that data
		
		//Using the users email
		String userEmail = "test@test.com";
		
		Mail mailSender = new Mail();
		mailSender.setTo(new String[] { userEmail });
		mailSender.setBody("Welcome User! Thanks for Registering with HandsOn Android!");
		mailSender.sendMail();
		
		return false;
	}
	
	/**
	 * Sign up for event
	 * @param e : The event to sign up for
	 * @return : Return false if registration was unsuccessful
	 */
	public static boolean signUpForEvent(Events e){
		//Event signup goes here!
		
		
		String title = "Default";
		String description = "Default";
		String location = "Default";
		Date date = new Date(1994, 05, 27);
		int beginTime = 000;
		int endTime = 000;
		String firstName = "Default";
		
		String eventCoordinatorEmail = "test@test.com";
		String userEmail = "test@test.com";
		
		Mail mailSender = new Mail();
		mailSender.setTo(new String[] { userEmail });
		mailSender.setBody("Welcome User! Thanks for Registering for the event " + title + "! The date is " + date.toString() + 
				" from " + beginTime + " to " + endTime);
		mailSender.sendMail();
		
		mailSender = new Mail();
		mailSender.setTo(new String[] { eventCoordinatorEmail} );
		mailSender.setBody("The user " + firstName + " has signed up for the event " + title + "!" + " Their Email is " + userEmail);
		mailSender.sendMail();
		
		//Unimplemented
		WebMethods.addEventToCalendar(title, description, location, date, beginTime, endTime);
		return false;
	}
	
	/**
	 * Query events by tags
	 * @param tag : The tag to query
	 * @return : The list of returned events
	 */
	public static ArrayList<Events> queryByTag(String tag){
		
		return null;
	}
	
	/**
	 * Query Events by Category
	 * @param category : The category to query
	 * @return : The list
	 */
	public static ArrayList<Events> queryByCategory(String category){
		
		return null;
	}
	
	/**
	 * Query Events by Date
	 * @param date : The date to query
	 * @return : The list
	 */
	public static ArrayList<Events> queryByDate(String date){
		
		return null;
	}
	
	/**
	 * Query events by Zipcode
	 * @param zipcode : The zipcode to query
	 * @return : The list of events
	 */
	public static ArrayList<Events> queryByZipcode(int zipcode){
		
		return null;
	}
	
	/**
	 * Send an update to facebook, not implemented
	 */
	public static void updateFacebook(){
		
	}
	
	/**
	 * Send an update to twitter, not implemented
	 */
	public static void updateTwitter(){
		
	}
	
	//Helper Additional Methods
	
	/**
	 * Add the event to the users calendar, currently unimplemented
	 * @param title : Title of the event
	 * @param description : Description of the event
	 * @param location : Location of the event
	 * @param date : Date of the event
	 * @param beginTime : The beginning time of the event
	 * @param endTime : The end time of the event
	 */
	private static void addEventToCalendar(String title, String description,  String location, Date date, int beginTime, int endTime){
		
	}
	
}
