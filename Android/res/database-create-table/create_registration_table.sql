CREATE TABLE registration (
	registration_seq_id INTEGER PRIMARY KEY AUTOINCREMENT,
	user_seq_id INTEGER NOT NULL,
	opportunity_seq_id 	INTEGER NOT NULL,
	registration_date_time DATETIME NOT NULL
);