CREATE TABLE users (
	user_id bigserial PRIMARY KEY,
	email varchar(55) NOT NULL UNIQUE,
	password varchar(55) NOT NULL,
	first_name varchar(55) NOT NULL,
	last_name varchar(55) NOT NULL,
    );

CREATE TABLE tasks (
	task_id bigserial PRIMARY KEY,
	user_id bigint NOT NULL,
	task_name varchar(55) NOT NULL UNIQUE,
	status varchar(25) NOT NULL,
	FOREIGN KEY(user_id) REFERENCES users (user_id)
);
