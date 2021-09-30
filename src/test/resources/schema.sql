create table if not exists user
(
    id          bigint           not null auto_increment primary key,
    create_date timestamp        not null default CURRENT_TIMESTAMP,
    update_date timestamp        null on update current_timestamp,

    name        varchar(100)     not null default '',
    sex         tinyint unsigned not null default 0,
    age         tinyint unsigned not null default 0
);
create table if not exists role
(
    id          bigint       not null auto_increment primary key,
    create_date timestamp    not null default CURRENT_TIMESTAMP,
    update_date timestamp    null on update current_timestamp,

    name        varchar(100) not null default ''
);

create table if not exists permission
(
    id          bigint       not null auto_increment primary key,
    create_date timestamp    not null default CURRENT_TIMESTAMP,
    update_date timestamp    null on update current_timestamp,

    name        varchar(100) not null default '',
    code        varchar(100) not null default '',
    uri         varchar(500) not null default '',

    unique index uq_code (code),
    unique index uq_uri (uri)
);

create table if not exists role_permission_ref
(
    id            bigint    not null auto_increment primary key,
    create_date   timestamp not null default CURRENT_TIMESTAMP,
    update_date   timestamp null on update current_timestamp,

    role_id       bigint    not null,
    permission_id bigint    not null,

    unique index uq_role_permission (role_id, permission_id)
);

create table if not exists user_role_ref
(
    id          bigint    not null auto_increment primary key,
    create_date timestamp not null default CURRENT_TIMESTAMP,
    update_date timestamp null on update current_timestamp,

    user_id     bigint    not null,
    role_id     bigint    not null,

    unique index uq_user_role (user_id, role_id)
);





