package com.team2.database;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/**
 * This is a Data Access Object that interfaces with the database (Event table)
 * in order to create Java model objects for use with the interface to display
 * event information.
 * 
 * @author Ethan Hill
 * 
 */
public class EventDAO {

	private SQLiteDatabase database;
	private MySQLiteHelper helper;

	private static final String INSERT_PATH = "assets/insert_event";

	private static final String GRAB_ALL_EVENTS_PATH = "assets/grab_all_events";

	private static final String GRAB_SINGLE_EVENT = "assets/grab_single_event_with_id";

	public EventDAO(Context context) {
		this.helper = new MySQLiteHelper(context);
	}

	public void open() {
		this.database = helper.getWritableDatabase();
	}

	public void close() {
		this.helper.close();
	}

	/**
	 * Inserts a fully complete Event (all fields filled) into the Event table
	 * 
	 * @param event
	 *            the Event to be inserted
	 * @throws IOException
	 */
	public void insertEvent(Event event) throws IOException {
		File file = new File(INSERT_PATH);
		String insertQuery = FileUtils.readFileToString(file);

		SQLiteStatement statement = this.database.compileStatement(insertQuery);

		// Prepare the very long SQL insert Query
		statement.bindString(1, event.getEventName());
		statement.bindString(2, event.getAgeGroupsServed());
		statement.bindString(3, event.getVolunteerCity());
		statement.bindString(4, event.getVolunteerCountry());
		statement.bindString(5, event.getVolunteerDescription());
		statement.bindString(6, event.getEndDate());
		statement.bindString(7, event.getStartDate());
		statement.bindString(8, event.getGoogleMapURL());
		statement.bindString(9, event.getOrganization());
		statement.bindString(10, event.getMaxAttendance());
		statement.bindString(11, event.getMinAttendance());
		statement.bindString(12, event.getOrgServedID());
		statement.bindString(13, event.getOrgServedName());
		statement.bindString(14, event.getOrganizationServedURL());
		statement.bindString(15, event.getPartnerStaffEmail());
		statement.bindString(16, event.getPrimaryImpactArea());
		statement.bindString(17, event.getStateProvince());
		statement.bindString(18, event.getStatus());

		// Cast the binary int as a Long for sake of ease
		statement.bindLong(19, event.getSuitableGroups());

		statement.bindString(20, event.getCoordinatorEmail());
		statement.bindString(21, event.getCoordinatorName());
		statement.bindString(22, event.getLocation());
		statement.bindString(23, event.getLocationDetailpage());
		statement.bindString(24, event.getVolunteerActivityType());
		statement.bindString(25, event.getRegistrationType());
		statement.bindString(26, event.getStreet());
		statement.bindString(27, event.getZipCode());

		statement.executeInsert();

	}

	/**
	 * Get a List of Events for the interface to display.
	 * 
	 * @return a list of fully filled Events (all information filled)
	 * 
	 * @throws IOException
	 */
	public List<Event> getAllEventList() throws IOException {
		Event event = new Event();

		File file = new File(GRAB_ALL_EVENTS_PATH);

		String getEventsQuery = FileUtils.readFileToString(file);

		Cursor results = this.database.rawQuery(getEventsQuery, null);
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

	/**
	 * Get an event from a single Id
	 * 
	 * @param id
	 *            the unique ID of the Event (the primary key) in the database
	 * @return the unique Event pulled from the database using its unique ID
	 * @throws IOException
	 */
	public Event getEventFromID(String id) throws IOException {
		Event event = new Event();

		File file = new File(GRAB_SINGLE_EVENT);

		String getSingleEventQuery = FileUtils.readFileToString(file);

		String[] idRep = {id};

		Cursor results = this.database.rawQuery(getSingleEventQuery, idRep);

		// Massive assignments...
		event.setEventName(results.getString(1));
		event.setAgeGroupsServed(results.getString(2));
		event.setVolunteerCity(results.getString(3));
		event.setVolunteerCountry(results.getString(4));
		event.setVolunteerDescription(results.getString(5));
		event.setEndDate(results.getString(6));
		event.setStartDate(results.getString(7));
		event.setGoogleMapURL(results.getString(8));
		event.setOrganization(results.getString(9));
		event.setMaxAttendance(results.getString(10));
		event.setMinAttendance(results.getString(11));
		event.setOrgServedID(results.getString(12));
		event.setOrgServedName(results.getString(13));
		event.setOrganizationServedURL(results.getString(14));
		event.setPartnerStaffEmail(results.getString(15));
		event.setPrimaryImpactArea(results.getString(16));
		event.setStateProvince(results.getString(17));
		event.setStatus(results.getString(18));

		// Cast from int
		event.setSuitableGroups((int) results.getLong(19));
		event.setCoordinatorEmail(results.getString(20));
		event.setLocation(results.getString(21));
		event.setLocationDetailpage(results.getString(22));
		event.setLocationDetailpage(results.getString(23));
		event.setVolunteerActivityType(results.getString(24));
		event.setRegistrationType(results.getString(25));
		event.setStreet(results.getString(26));
		event.setZipCode(results.getString(27));
		return event;

	}

}
