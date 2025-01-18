create table topicos(
    id bigint not null auto_increment,
    titulo varchar(254) not null unique,
    mensaje varchar(254) not null unique,
    fechaCreacion datetime not null,
    status varchar(254) not null,
    usuario_id bigint not null,
    curso varchar(254) not null,

    CONSTRAINT fk_topico_usuario_id FOREIGN KEY (usuario_id) REFERENCES usuario(id) ON DELETE CASCADE

    primary key(id)
);