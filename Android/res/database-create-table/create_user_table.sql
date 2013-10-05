CREATE TABLE user (
	user_seq_id INTEGER PRIMARY KEY AUTOINCREMENT,
	first_name TEXT NOT NULL,
	last_name TEXT NOT NULL,
	date_of_birth DATE NOT NULL,
	address_1 TEXT NOT NULL,
	address_2 TEXT NOT NULL,
	phone TEXT NOT NULL,
	email TEXT NOT NULL,
	username TEXT NOT NULL,
	password TEXT NOT NULL
);