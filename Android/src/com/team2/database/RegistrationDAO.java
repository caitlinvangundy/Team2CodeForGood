package com.team2.database;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

public class RegistrationDAO {

	private SQLiteDatabase database;
	private MySQLiteHelper helper;

	private static final String INSERT_PATH = "assets/insert_registration";
	private static final String DELETE_PATH = "assets/delete_registration";
	private static final String GET_OPPORTUNITIES_FOR_USER_PATH = "assets/get_opportunities_for_user";
	private static final String GET_USERS_FOR_OPPORTUNITY_PATH = "assets/get_users_for_opportunity";

	public RegistrationDAO(Context context) {
		this.helper = new MySQLiteHelper(context);
	}

	public void open() {
		this.database = helper.getWritableDatabase();
	}

	public void close() {
		this.helper.close();
	}

	/**
	 * Inserts a Registration instance into the registration table in the
	 * database. This occurs when a user volunteers for an oppurtunity.
	 * 
	 * @param user
	 *            the user object to be associated with the registration
	 * @param opportunity
	 *            the opportunity object to be associated with the registration
	 * @throws IOException
	 */
	public void insertRegistration(User user, Event event) throws IOException {

		File file = new File(INSERT_PATH);
		String insertQuery = FileUtils.readFileToString(file);

		/*
		 * The id is a primary key and automatically increments
		 */
		SQLiteStatement statement = this.database.compileStatement(insertQuery);
		statement.bindLong(1, Integer.parseInt(user.getId()));
		statement.bindLong(2, Integer.parseInt(event.getEventID()));

		statement.executeInsert();

	}

	/**
	 * Deletes a Registration instance from the registration table in the
	 * database. This occurs when a user decides to cancel on an oppurtunity.
	 * 
	 * @param user
	 *            the user object to be associated with the registration
	 * @param event
	 *            the opportunity object to be associated with the registration
	 * @throws IOException
	 */
	public void deleteRegistration(String registrationId)
			throws IOException {

		File file = new File(DELETE_PATH);
		String deleteQuery = FileUtils.readFileToString(file);

		/*
		 * The id is a primary key and automatically increments
		 */
		SQLiteStatement statement = this.database.compileStatement(deleteQuery);
		statement.bindLong(1, Integer.parseInt(registrationId));
		statement.executeInsert();
	}

	/**
	 * Returns a list of users who are registered for the specified opportunity.
	 * 
	 * @param user
	 *            the user object to be associated with the registration
	 * @param opportunityID
	 *            the opportunity object for which to search for users
	 * @throws IOException
	 */
	public List<User> getUsersForOpportunity(String eventID) throws IOException {

		File file = new File(GET_USERS_FOR_OPPORTUNITY_PATH);
		String getUsersForOpportunityQuery = FileUtils.readFileToString(file);

		// This is in order to satisfy the rawQuery arguments
		String[] arrayString = { eventID };
		// Query must not be terminated by semi colon
		Cursor results = this.database.rawQuery(getUsersForOpportunityQuery,
				arrayString);

		List<User> users = new ArrayList<User>();

		results.moveToFirst();
		do {
			User user = new User();
			user.setId(results.getString(0));
			user.setFirstName(results.getString(1));
			user.setLastName(results.getString(2));
			user.setDateOfBirth(results.getString(3));
			user.setAddress(results.getString(4), results.getString(5));
			user.setPhone(results.getString(6));
			user.setEmail(results.getString(7));
			user.setUserName(results.getString(8));
			user.setPassword(results.getString(9));
			users.add(user);
		} while (results.moveToNext());
		results.close();
		return users;
	}

	/**
	 * Returns a list of opportunities that a specified user is registered for.
	 * 
	 * @param userID
	 *            the user object for which to search for opportunities
	 * @throws IOException
	 */
	public List<Event> getOpportunitiesForUser(String userID) throws IOException {
		Event event = new Event();

		File file = new File(GET_OPPORTUNITIES_FOR_USER_PATH);

		String getEventsQuery = FileUtils.readFileToString(file);

		String[] idRep = { userID };

		Cursor results = this.database.rawQuery(getEventsQuery, idRep);
		// Iterate through each record (rows and columns (kind of))
		do {
			// Massive assignments...
			event.setEventID(results.getString(1));
			event.setEventName(results.getString(2));
			event.setAgeGroupsServed(results.getString(3));
			event.setVolunteerCity(results.getString(4));
			event.setVolunteerCountry(results.getString(5));
			event.setVolunteerDescription(results.getString(6));
			event.setEndDate(results.getString(7));
			event.setStartDate(results.getString(8));
			event.setGoogleMapURL(results.getString(9));
			event.setOrganization(results.getString(10));
			event.setMaxAttendance(results.getString(11));
			event.setMinAttendance(results.getString(12));
			event.setOrgServedID(results.getString(13));
			event.setOrgServedName(results.getString(14));
			event.setOrganizationServedURL(results.getString(15));
			event.setPartnerStaffEmail(results.getString(16));
			event.setPrimaryImpactArea(results.getString(17));
			event.setStateProvince(results.getString(18));
			event.setStatus(results.getString(19));

			// Cast from int
			event.setSuitableGroups((int) results.getLong(20));
			event.setCoordinatorEmail(results.getString(21));
			event.setLocation(results.getString(22));
			event.setLocationDetailpage(results.getString(23));
			event.setLocationDetailpage(results.getString(24));
			event.setVolunteerActivityType(results.getString(25));
			event.setRegistrationType(results.getString(26));
			event.setStreet(results.getString(27));
			event.setZipCode(results.getString(28));

			Event.addToList(event);
		} while (results.moveToNext());
		return Event.getList();
	}
}