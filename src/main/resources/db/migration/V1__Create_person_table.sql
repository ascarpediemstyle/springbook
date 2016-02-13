create table pserion (
    person_id int not null,
    person_name varchar(100) not null,
    PRIMARY KEY(person_id)
);

create table customer (
    customer_id int not null,
    customer_name varchar(100) not null,
    PRIMARY KEY(customer_id)
);

create table book(
	book_id serial not null,
	book_name character varying not null,
	price int ,
	description character varying ,	
	rank int ,
	amazon_url character varying ,
	category_id int ,
	publisher_id int ,
	comment character varying ,
	created_at character varying ,
	PRIMARY KEY(book_id)

);

create table categorie (
    categorie_id int not null,
    categorie_name character varying not null,
    PRIMARY KEY(categorie_id)
);

create table publisher (
    publisher_id int not null,
    publisher_name character varying not null,
    order_by int ,
    PRIMARY KEY(publisher_id)
);