create table user_info (user_id int not null auto_increment,
						name varchar(20) not null,
						salary float,
						DOB date,
						primary key (user_id))
						);
create table user_track_data (id int not null auto_increment,
							  user_id int not null,
							  Date date not null,
							  amount float,
							  category int,
							  sub_category int,
							  description varchar(40),
							  );
create table sub_category (id int not null auto_increment,
					       sub_cat_description varchar(40),
					       );
create table category (id int not null auto_increment,
					   cat_description varchar(40)
				       );
create table user_saving_data (id int not null auto_increment,
							   user_id int,
							   saving_type varchar(20),
							   amount float,
							   description varchar(40),
							   maturity_date date,
							   )
create table user_validation (id int not null auto_increment,
			      user_name varchar(20),
			      password varchar (20)
			      )
			      
