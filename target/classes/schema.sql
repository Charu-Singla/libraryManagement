DROP TABLE IF EXISTS brand_info;


CREATE TABLE user_info
(
  id int NOT NULL auto_increment,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(200) NOT NULL, 
  user_role VARCHAR(20) NOT NULL,
  created_timestamp timestamp without time zone,
  CONSTRAINT user_pkey PRIMARY KEY (id)
 );
 
create table category (
	category_id number not null,
	book_category VARCHAR(20) NOT NULL,
	CONSTRAINT category_pkey PRIMARY KEY (category_id)
);
  

CREATE TABLE book_info
(
  isbn VARCHAR(6) NOT NULL,
  book_name VARCHAR(50) NOT NULL,
  book_category VARCHAR(50) NOT NULL,
  rack_number VARCHAR(6) NOT NULL,
  author varchar(50) not null,
  IS_ISSUED INT DEFAULT 0,
  USER_id VARCHAR(50) ,
  created_timestamp timestamp without time zone,
  CONSTRAINT book_info_pkey PRIMARY KEY (isbn),
  
  foreign key (user_id) references  user_info(id) 	
 );

