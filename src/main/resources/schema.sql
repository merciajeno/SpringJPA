create table employee
(
   id int not null,
   name varchar(255) not null,
   salary decimal(10,2) not null,
   dateOfJoining date not null,
   primary key(id)
);

create table employeeAddress
(
  id int not null,
  area varchar(300) not null,
  street varchar(300) not null,
  city varchar(300) not null,
  primary key (id),
  foreign key (id) references employee(id) 
);