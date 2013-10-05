package com.team2.database;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

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
	private static final String DATABASE_FILE = "database.sqlite";

	/**
	 * the current database version
	 */
	private static final int DATABASE_VERSION = 1;

	/**
	 * the path to the SQL file of the create user table query
	 */
	private static final String CREATE_USER_TABLE_PATH = "res/database-table-creation/create_user_table.sql";

	/**
	 * the path to the SQL file of the create opportunity table query
	 */
	private static final String CREATE_OPPORTUNITY_TABLE_PATH = "res/database-table-creation/create_opportunity_table.sql";

	/**
	 * the path to the SQL file of the create registration table query
	 */
	private static final String CREATE_REGISTRATION_TABLE_PATH = "res/database-table-creation/create_registration_table.sql";

	/**
	 * the path to the SQL drop file for the user table
	 */
	private static final String DROP_USER_TABLE_PATH = "res/database-table-drop/drop_user_table.sql";

	/**
	 * the path to the SQL drop file for the opportunity table
	 */
	private static final String DROP_OPPORTUNITY_TABLE_PATH = "res/database-table-drop/drop_opportunity_table.sql";

	/**
	 * the path to the SQL drop file for the registration table
	 */
	private static final String DROP_REGISTRATION_TABLE_PATH = "res/database-table-drop/drop_registration_table.sql";

	public MySQLiteHelper() {
		super(null, DATABASE_FILE, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {

		File createUserTableFile = new File(CREATE_USER_TABLE_PATH);
		File createOpportunityTableFile = new File(
				CREATE_OPPORTUNITY_TABLE_PATH);
		File createRegistrationTableFile = new File(
				CREATE_REGISTRATION_TABLE_PATH);
		try {
			String createUserTableQuery = FileUtils
					.readFileToString(createUserTableFile);
			String createOpportunityTableQuery = FileUtils
					.readFileToString(createOpportunityTableFile);
			String createRegistrationTableQuery = FileUtils
					.readFileToString(createRegistrationTableFile);

			database.execSQL(createUserTableQuery);
			database.execSQL(createOpportunityTableQuery);
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
		File dropOpportunityTableFile = new File(DROP_OPPORTUNITY_TABLE_PATH);
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
