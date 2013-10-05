package com.example.handsonandroid;

import java.util.ArrayList;

public class Events {

	private String occurenceID;
	private String opportunityName;
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
	private String organizationServedURl;
	private String partnerStaffEmail;
	private String primaryImpactArea;
	private String state;
	private String status;
	private boolean groups;
	private String coordinatorEmail;
	private String coordinatorName;
	private String location;
	private String locationDetailpage;
	private String volunteerActivityType;
	private String registrationType;
	private String street;
	private String zipCode;
	
	
	private static ArrayList<Events> curEvents = new ArrayList<Events>();
	
	
	
	
	public Events(){
		
	}
	
	public static void clearList(){
		curEvents = new ArrayList<Events>();
	}
	
	public static void addToList(Events e){
		curEvents.add(e);
	}
	
	public static void removeFromList(Events e){
		curEvents.remove(e);
	}
	
	public static ArrayList<Events> getList(){
		return curEvents;
	}

	public String getOccurenceID() {
		return occurenceID;
	}

	public void setOccurenceID(String occurenceID) {
		this.occurenceID = occurenceID;
	}

	public String getOpportunityName() {
		return opportunityName;
	}

	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}

	public String getAgeGroupsServed() {
		return ageGroupsServed;
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
		return volunteerCountry;
	}

	public void setVolunteerCountry(String volunteerCountry) {
		this.volunteerCountry = volunteerCountry;
	}

	public String getVolunteerDescription() {
		return volunteerDescription;
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
		return startDate;
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
		return organization;
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
		return minAttendance;
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
		return orgServedName;
	}

	public void setOrgServedName(String orgServedName) {
		this.orgServedName = orgServedName;
	}

	public String getOrganizationServedURl() {
		return organizationServedURl;
	}

	public void setOrganizationServedURl(String organizationServedURl) {
		this.organizationServedURl = organizationServedURl;
	}

	public String getPartnerStaffEmail() {
		return partnerStaffEmail;
	}

	public void setPartnerStaffEmail(String partnerStaffEmail) {
		this.partnerStaffEmail = partnerStaffEmail;
	}

	public String getPrimaryImpactArea() {
		return primaryImpactArea;
	}

	public void setPrimaryImpactArea(String primaryImpactArea) {
		this.primaryImpactArea = primaryImpactArea;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isGroups() {
		return groups;
	}

	public void setGroups(boolean groups) {
		this.groups = groups;
	}

	public String getCoordinatorEmail() {
		return coordinatorEmail;
	}

	public void setCoordinatorEmail(String coordinatorEmail) {
		this.coordinatorEmail = coordinatorEmail;
	}

	public String getCoordinatorName() {
		return coordinatorName;
	}

	public void setCoordinatorName(String coordinatorName) {
		this.coordinatorName = coordinatorName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationDetailpage() {
		return locationDetailpage;
	}

	public void setLocationDetailpage(String locationDetailpage) {
		this.locationDetailpage = locationDetailpage;
	}

	public String getVolunteerActivityType() {
		return volunteerActivityType;
	}

	public void setVolunteerActivityType(String volunteerActivityType) {
		this.volunteerActivityType = volunteerActivityType;
	}

	public String getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public static ArrayList<Events> getCurEvents() {
		return curEvents;
	}

	public static void setCurEvents(ArrayList<Events> curEvents) {
		Events.curEvents = curEvents;
	}
	
	
	
}
