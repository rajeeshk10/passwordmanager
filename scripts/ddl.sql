create table account (id bigint not null auto_increment, version bigint not null, account_type_id bigint not null, username tinyblob not null, password tinyblob not null, account_name varchar(255), primary key (id)) ENGINE=InnoDB;
create table account_category (id bigint not null auto_increment, version bigint not null, category varchar(255) not null, primary key (id)) ENGINE=InnoDB;
create table account_type (id bigint not null auto_increment, version bigint not null, type_value varchar(255) not null, account_category_id bigint not null, type_name varchar(255) not null, primary key (id)) ENGINE=InnoDB;
create table user (id bigint not null auto_increment, version bigint not null, phone varchar(255) not null, username varchar(255) not null, role varchar(255) not null, password varchar(255) not null, full_name varchar(255) not null, email varchar(255) not null, primary key (id)) ENGINE=InnoDB;
alter table account add constraint FKgw84mgpacw9htdxcs2j1p7u6j foreign key (account_type_id) references account_type (id);
alter table account_type add constraint FKbmwydrvb4a6wtb2a8yvqp8ogn foreign key (account_category_id) references account_category (id);
