package com.team2.database;

/**
 * This class is a small model of the data pulled from the database (the user
 * table). New User records are added to the database when a user signs up for
 * the service.
 * 
 * @author Ethan Hill
 * 
 */
public class User {

	/**
	 * ID is made a String so that it is immutable, to prevent accidental
	 * alteration
	 */
	private String id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String address1;
	private String address2;
	private String phone;
	private String email;

	// static instance to pass the object around the application
	private static User mUser = new User();;

	// UserDAO initializes with setters, not constructor
	public User() {
		// no code necessary
	}

	/*
	 * Getters
	 */
	public String getId() {
		return this.id;
	}

	public String getUserName() {
		return this.userName;
	}

	public String getPassword() {
		return this.password;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public String[] getAddress() {
		String[] addresses = { this.address1, this.address2 };
		return addresses;

	}

	public String getPhone() {
		return this.phone;
	}

	public String getEmail() {
		return this.email;
	}

	public static User getStaticUser() {
		return User.mUser;
	}

	/*
	 * Setters
	 */
	public static void setStaticUser(User user) {
		User.mUser = user;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setUserName(String user) {
		this.userName = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * Returns an array of size 2, containing address line 1 and line 2
	 * 
	 * @return an array of size two, containing address line 1 and line 2
	 *         respectively
	 */
	public void setAddress(String address1, String address2) {
		this.address1 = address1;
		this.address2 = address2;

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}