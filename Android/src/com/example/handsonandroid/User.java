package com.example.handsonandroid;

import java.sql.Date;

public class User {

	private String id;
	private String userName;
	private String firstName;
	private String lastName;
	private int age;
	private String address1;
	private String address2;
	private String phone;
	private String email;
	
	private static User user;
	
	public User(){
		
	}
	
	public User(String userName, String password, String firstName){
		this.userName = userName;
		this.firstName = firstName;
		
		WebMethods.login();
	}
	
	
	public static void setUser(User user){
		User.user = user;
	}
	
	public static User getUser(){
		return User.user;
	}
	
	public void setAge(Date date){
		//Do math to set the date.
	}
}
