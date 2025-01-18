create table usuarios(

    id bigint not null auto_increment,
    nombre varchar(254) not null,
    username varchar(254) not null,
    email varchar(254) not null,
    password varchar(254) not null,


    primary key(id)

);