CREATE TABLE topicos (
    id bigint not null auto_increment,
        titulo VARCHAR(255) NOT NULL,
        mensaje TEXT NOT NULL,
        fecha_de_creacion TIMESTAMP NOT NULL,
        status BOOLEAN NOT NULL,
        curso VARCHAR(255) NOT NULL,

        primary key(id)


);