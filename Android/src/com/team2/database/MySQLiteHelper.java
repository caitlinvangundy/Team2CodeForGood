package com.team2.database;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * This class is intended to be a helper for creating a database with some
 * tables.
 * 
 * @author Ethan Hill
 * 
 */
public class MySQLiteHelper extends SQLiteOpenHelper {

	/**
	 * database file name constant
	 */
	private static final String DATABASE_FILE_PATH = "assets/database.sqlite";
	
	/**
	 * the current database version
	 */
	private static final int DATABASE_VERSION = 1;

	/**
	 * the path to the SQL file of the create user table query
	 */
	private static final String CREATE_USER_TABLE_PATH = "assets/create_user_table";

	/**
	 * the path to the SQL file of the create event table query
	 */
	private static final String CREATE_EVENT_TABLE_PATH = "assets/create_event_table";

	/**
	 * the path to the SQL file of the create registration table query
	 */
	private static final String CREATE_REGISTRATION_TABLE_PATH = "assets/create_registration_table";

	/**
	 * the path to the SQL drop file for the user table
	 */
	private static final String DROP_USER_TABLE_PATH = "assets/drop_user_table";

	/**
	 * the path to the SQL drop file for the event table
	 */
	private static final String DROP_EVENT_TABLE_PATH = "assets/drop_event_table";

	/**
	 * the path to the SQL drop file for the registration table
	 */
	private static final String DROP_REGISTRATION_TABLE_PATH = "assets/drop_registration_table";

	public MySQLiteHelper(Context context) {
		super(context, DATABASE_FILE_PATH, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {

		File createUserTableFile = new File(CREATE_USER_TABLE_PATH);
	  //File createOpportunityTableFile = new File(
	  //			CREATE_EVENT_TABLE_PATH);
		File createRegistrationTableFile = new File(
				CREATE_REGISTRATION_TABLE_PATH);
		try {
			String createUserTableQuery = FileUtils
					.readFileToString(createUserTableFile);
	//	    String createEventTableQuery = FileUtils
	//				.readFileToString(createOpportunityTableFile);
			String createRegistrationTableQuery = FileUtils
					.readFileToString(createRegistrationTableFile);

			database.execSQL(createUserTableQuery);
			//database.execSQL(createEventTableQuery);
			database.execSQL(createRegistrationTableQuery);

		} catch (IOException e) {
			System.out
					.println("Problem with reading SQL files into a String while creating tables.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out
					.println("Problem with executing SQL query while creating tables.");
			e.printStackTrace();
		}

	}

	@Override
	public void onUpgrade(SQLiteDatabase database, int oldVersion,
			int newVersion) {

		Log.w(MySQLiteHelper.class.getName(), "Upgrading from version "
				+ oldVersion + " to " + newVersion);

		File dropUserTableFile = new File(DROP_USER_TABLE_PATH);
		File dropOpportunityTableFile = new File(DROP_EVENT_TABLE_PATH);
		File dropRegistrationTableFile = new File(DROP_REGISTRATION_TABLE_PATH);
		try {
			String dropUserTableQuery = FileUtils
					.readFileToString(dropUserTableFile);
			String dropOpportunityTableQuery = FileUtils
					.readFileToString(dropOpportunityTableFile);
			String dropRegistrationTableQuery = FileUtils
					.readFileToString(dropRegistrationTableFile);

			database.execSQL(dropUserTableQuery);
			database.execSQL(dropOpportunityTableQuery);
			database.execSQL(dropRegistrationTableQuery);

			this.onCreate(database);

		} catch (IOException e) {
			System.out
					.println("Problem with reading SQL files into a String while trying to drop tables.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out
					.println("Problem with executing SQL query while trying to drop tables.");
			e.printStackTrace();
		}

	}

}
