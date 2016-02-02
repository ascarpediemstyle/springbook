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