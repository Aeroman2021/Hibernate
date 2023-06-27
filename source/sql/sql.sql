create table users(
id int not null auto_increment primary key,
name varchar(200),
username varchar(200),
pass varchar(200),

created_at timestamp default current_timestamp(),
deleted_at timestamp null default null,
updated_at timestamp null default null
);

create table categories(
id int not null auto_increment primary key,
title varchar(200),
is_main enum('ok','nok') default 'nok',
has_child enum('0','1') default '0',
child_count int DEFAULT 0,
parent_id int,

index category_category_index(parent_id),
constraint category_category_fk foreign key (parent_id) references categories(id),

created_at timestamp default current_timestamp(),
deleted_at timestamp null default null,
updated_at timestamp null default null
);


create table products(
id int not null auto_increment primary key,
title varchar(200),
category_id int,

index product_category_index(category_id),
constraint product_category_fk foreign key (category_id) references categories(id),

created_at timestamp default current_timestamp(),
deleted_at timestamp null default null,
updated_at timestamp null default null
);

CREATE TABLE propics(
id int not null auto_increment primary key,
title VARCHAR(200),
file_path VARCHAR(200),
file_extension VARCHAR(200),
product_id int,

index propic_product_index(product_id),
constraint propic_product_fk foreign key (product_id) references products(id),

created_at timestamp default current_timestamp(),
deleted_at timestamp null default null,
updated_at timestamp null default null
);

create table orders(
id int not null auto_increment primary key,
title varchar(200),
user_id int,

index order_user_index(user_id),
constraint order_user_fk foreign key (user_id) references users(id),

created_at timestamp default current_timestamp(),
deleted_at timestamp null default null,
updated_at timestamp null default null
);

create table orderdetails(
id int not null auto_increment primary key,
title varchar(200),
pro_count int,
product_id int,
order_id int,

index orderdetail_product_index(product_id),
constraint orderdetail_product_fk foreign key (product_id) references products(id),
index orderdetail_order_index(order_id),
constraint orderdetail_order_fk foreign key (order_id) references orders(id),

created_at timestamp default current_timestamp(),
deleted_at timestamp null default null,
updated_at timestamp null default null
);
