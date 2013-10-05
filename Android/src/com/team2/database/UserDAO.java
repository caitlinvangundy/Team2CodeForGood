package com.team2.database;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/**
 * This is a Data Access Object that interfaces with the database (the User table) in order to
 * create Java model objects for use with the interface to display User
 * information.
 * 
 * @author Ethan
 *
 */
public class UserDAO {

	private SQLiteDatabase database;
	private MySQLiteHelper helper;

	private static final String INSERT_PATH = "assets/insert_user";

	private static final String GRAB_USER_PATH = "assets/grab_user";

	public UserDAO(Context context) {
		this.helper = new MySQLiteHelper(context);
	}

	public void open() {
		this.database = helper.getWritableDatabase();
	}

	public void close() {
		this.helper.close();
	}

	/**
	 * Inserts a User instance into the user table in the database. This occurs
	 * when a user signs up for a new account.
	 * 
	 * @param user
	 *            the user object to be inserted into the user table
	 * @throws IOException
	 */
	public void insertUser(User user) throws IOException {

		File file = new File(INSERT_PATH);
		String insertQuery = FileUtils.readFileToString(file);

		/*
		 * We will bind all private members of a User object to the
		 * preparedStatement except for user.getId(), because the id is a
		 * primary key and automatically increments
		 */
		SQLiteStatement statement = this.database.compileStatement(insertQuery);
		statement.bindString(1, user.getUserName());
		statement.bindString(2, user.getPassword());
		statement.bindString(3, user.getFirstName());
		statement.bindString(4, user.getLastName());
		statement.bindString(5, user.getDateOfBirth().toString());

		// Get the address lines(1 and 2)
		String[] addresses = user.getAddress();
		statement.bindString(6, addresses[0]);
		statement.bindString(7, addresses[1]);

		statement.bindString(8, user.getPhone());
		statement.bindString(9, user.getEmail());

		statement.executeInsert();

	}

	/**
	 * This method is intended to be used with the login sequence on the UI. If
	 * the entered credentials are incorrect, the User object returned will have
	 * null fields.
	 * 
	 * @param userName
	 *            the user's login username for the application
	 * @param password
	 *            the user's login password credential for the application
	 * @return either a complete User object with all completed fields or an
	 *         incomplete user object that indicates a failed login attempt
	 * @throws IOException
	 */
	public User getUser(String userName, String password) throws IOException {
		User user = new User();

		File file = new File(GRAB_USER_PATH);

		String getUserByUsernameQuery = FileUtils.readFileToString(file);

		// This is in order to satisfy the rawQuery arguments
		String[] arrayString = { userName, password };
		// Query must not be terminated by semi colon
		Cursor results = this.database.rawQuery(getUserByUsernameQuery,
				arrayString);

		// Now fill in the values from the result set
		results.moveToFirst();
		// Make the ID immutable, change to a String to prevent alteration
		String idRep = Integer.toString(results.getInt(0));
		user.setId(idRep);
		user.setFirstName(results.getString(1));
		user.setLastName(results.getString(2));

		// We are going to convert the date pulled from the table to a String
		user.setDateOfBirth(results.getString(3));
		
		user.setAddress(results.getString(4), results.getString(5));
		user.setPhone(results.getString(6));
		user.setEmail(results.getString(7));
		user.setUserName(results.getString(8));
		user.setPassword(results.getString(9));

		results.close();

		return user;
	}
}
