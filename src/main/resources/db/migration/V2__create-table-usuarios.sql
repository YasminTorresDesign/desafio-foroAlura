create table usuarios(

    id bigint not null auto_increment,
    nombre varchar(150) UNIQUE not null,
    email varchar(150) not null,
    clave varchar(300) not null,

    primary key(id)

);