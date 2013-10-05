package com.example.handsonandroid;

import java.sql.Date;

/**
 * 
 * @author Garrett
 *
 * A class to encapsulate the user data. Also has a static
 * variable that the app can use throughout.
 */
public class User {

	//Member variables that are required
	private String id;
	private String userName;
	private String firstName;
	private String lastName;
	private int age;
	private String address1;
	private String address2;
	private String phone;
	private String email;
	
	//Static user to use throughout the application
	private static User user;
	
	/**
	 * Default constructor
	 */
	public User(){
		
	}
	
	public User(String userName, String password, String firstName){
		this.userName = userName;
		this.firstName = firstName;
		
		WebMethods.login(userName, password);
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
