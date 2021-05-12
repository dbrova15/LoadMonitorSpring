create table if not exists load_monitor
(
    id           int auto_increment primary key,
    name_service varchar(255) not null,
    name_node    varchar(255) not null,
    memory       varchar(255) not null,
    cpu          varchar(255) not null,
    date_time    timestamp    not null
);