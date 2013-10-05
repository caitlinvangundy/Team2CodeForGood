CREATE TABLE opportunity (
	opportunity_seq_id INTEGER PRIMARY KEY AUTOINCREMENT,
	name TEXT NOT NULL,
	age_group TEXT NOT NULL,
	city TEXT NOT NULL,
	country TEXT NOT NULL,
	description TEXT NOT NULL,
	end_date_time DATETIME NOT NULL,
	start_date_time DATETIME NOT NULL,
	google_map_url TEXT NOT NULL,
	managing_name TEXT NOT NULL,
	max_attendance TEXT NOT NULL,
	min_attendance TEXT NOT NULL,
	organization_served_seq_id INTEGER NOT NULL,
	organization_served_name TEXT NOT NULL,
	organization_served_url TEXT NOT NULL,
	partner_staff_email TEXT NOT NULL,
	primary_impact_area TEXT NOT NULL,
	state_province TEXT NOT NULL,
	status TEXT NOT NULL,
	suitable_for_groups_ind TEXT NOT NULL,
	coordinator_email TEXT NOT NULL,
	coordinator_name TEXT NOT NULL,
	location TEXT NOT NULL,
	location_details_url TEXT NOT NULL,
	volunteer_activity_type TEXT NOT NULL,
	registration_type TEXT NOT NULL,
	address TEXT NOT NULL,
	zip_code TEXT NOT NULL
);
	