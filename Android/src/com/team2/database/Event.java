package com.team2.database;

import java.util.ArrayList;

/**
 * This class is intended to serve as a model for the data pulled from the
 * database (event table) in order to interact with the user interface.
 * 
 * @author Ethan Hill
 * 
 */
public class Event {

	private String eventID;
	private String eventName;
	private String ageGroupsServed;
	private String volunteerCity;
	private String volunteerCountry;
	private String volunteerDescription;
	private String endDate;
	private String startDate;
	private String googleMapURL;
	private String organization;
	private String maxAttendance;
	private String minAttendance;
	private String orgServedID;
	private String orgServedName;
	private String organizationServedURL;
	private String partnerStaffEmail;
	private String primaryImpactArea;
	private String stateProvince;
	private String status;
	private int suitableGroups;
	private String coordinatorEmail;
	private String coordinatorName;
	private String location;
	private String locationDetailpage;
	private String volunteerActivityType;
	private String registrationType;
	private String street;
	private String zipCode;

	/**
	 * a static field that enables passing the same list of events around the
	 * application
	 */
	private static ArrayList<Event> curEvents = new ArrayList<Event>();

	/**
	 * Default Constructor
	 */
	public Event() {
		// Do nothing when this is constructed, the setters will initialize the
		// fields
	}

	// The list methods
	public static void clearList() {
		Event.curEvents = new ArrayList<Event>();
	}

	public static void addToList(Event e) {
		Event.curEvents.add(e);
	}

	public static void removeFromList(Event e) {
		Event.curEvents.remove(e);
	}

	public static ArrayList<Event> getList() {
		return Event.curEvents;

	}

	/**
	 * Getters and Setters below
	 */
	public String getEventID() {
		return this.eventID;
	}

	public void setEventID(String occurenceID) {
		this.eventID = occurenceID;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getAgeGroupsServed() {
		return this.ageGroupsServed;
	}

	public void setAgeGroupsServed(String ageGroupsServed) {
		this.ageGroupsServed = ageGroupsServed;
	}

	public String getVolunteerCity() {
		return volunteerCity;
	}

	public void setVolunteerCity(String volunteerCity) {
		this.volunteerCity = volunteerCity;
	}

	public String getVolunteerCountry() {
		return this.volunteerCountry;
	}

	public void setVolunteerCountry(String volunteerCountry) {
		this.volunteerCountry = volunteerCountry;
	}

	public String getVolunteerDescription() {
		return this.volunteerDescription;
	}

	public void setVolunteerDescription(String volunteerDescription) {
		this.volunteerDescription = volunteerDescription;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getGoogleMapURL() {
		return googleMapURL;
	}

	public void setGoogleMapURL(String googleMapURL) {
		this.googleMapURL = googleMapURL;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getMaxAttendance() {
		return maxAttendance;
	}

	public void setMaxAttendance(String maxAttendance) {
		this.maxAttendance = maxAttendance;
	}

	public String getMinAttendance() {
		return this.minAttendance;
	}

	public void setMinAttendance(String minAttendance) {
		this.minAttendance = minAttendance;
	}

	public String getOrgServedID() {
		return orgServedID;
	}

	public void setOrgServedID(String orgServedID) {
		this.orgServedID = orgServedID;
	}

	public String getOrgServedName() {
		return this.orgServedName;
	}

	public void setOrgServedName(String orgServedName) {
		this.orgServedName = orgServedName;
	}

	public String getOrganizationServedURL() {
		return this.organizationServedURL;
	}

	public void setOrganizationServedURL(String organizationServedURl) {
		this.organizationServedURL = organizationServedURl;
	}

	public String getPartnerStaffEmail() {
		return this.partnerStaffEmail;
	}

	public void setPartnerStaffEmail(String partnerStaffEmail) {
		this.partnerStaffEmail = partnerStaffEmail;
	}

	public String getPrimaryImpactArea() {
		return this.primaryImpactArea;
	}

	public void setPrimaryImpactArea(String primaryImpactArea) {
		this.primaryImpactArea = primaryImpactArea;
	}

	public String getStateProvince() {
		return this.stateProvince;
	}

	public void setStateProvince(String state) {
		this.stateProvince = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCoordinatorEmail() {
		return this.coordinatorEmail;
	}

	public void setCoordinatorEmail(String coordinatorEmail) {
		this.coordinatorEmail = coordinatorEmail;
	}

	public String getCoordinatorName() {
		return this.coordinatorName;
	}

	public void setCoordinatorName(String coordinatorName) {
		this.coordinatorName = coordinatorName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationDetailpage() {
		return this.locationDetailpage;
	}

	public void setLocationDetailpage(String locationDetailpage) {
		this.locationDetailpage = locationDetailpage;
	}

	public String getVolunteerActivityType() {
		return this.volunteerActivityType;
	}

	public void setVolunteerActivityType(String volunteerActivityType) {
		this.volunteerActivityType = volunteerActivityType;
	}

	public String getRegistrationType() {
		return this.registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public static ArrayList<Event> getCurEvents() {
		return Event.curEvents;
	}

	public static void setCurEvents(ArrayList<Event> curEvents) {
		Event.curEvents = curEvents;
	}

	public void setSuitableGroups(int yesOrNo) {
		this.suitableGroups = yesOrNo;
	}

	public int getSuitableGroups() {
		return this.suitableGroups;
	}

}
