create table stations
(
    id           bigint auto_increment,
    address      text,
    contact      text,
    station_name text,
    primary key (id)
);

CREATE TABLE buses
(
    id        bigint AUTO_INCREMENT,
    station_id_id bigint,
    places    INT,
    gov_number VARCHAR(255),
    FOREIGN KEY (station_id_id) REFERENCES stations (id),
    primary key (id)
);

CREATE TABLE cities
(
    id        bigint AUTO_INCREMENT,
    name     VARCHAR(50),
    short_name VARCHAR(50),
    primary key (id)
);

CREATE TABLE countries
(
    id        bigint AUTO_INCREMENT,
    name      VARCHAR(255),
    short_name VARCHAR(50),
    primary key (id)
);
CREATE TABLE cities_stations
(
    list_of_cities_id    bigint,
    stations_id bigint
);
CREATE TABLE document_type
(
    id           bigint AUTO_INCREMENT,
    document_name VARCHAR(255),
    primary key (id)
);

CREATE TABLE permission
(
    id   bigint AUTO_INCREMENT,
    role VARCHAR(50),
    primary key (id)
);


CREATE TABLE users
(
    id               bigint AUTO_INCREMENT,
    email            VARCHAR(255),
    name             VARCHAR(255),
    surname          VARCHAR(255),
    password         VARCHAR(255),
    citizenship_id_id      bigint,
    patronymic       VARCHAR(255),
    number_of_document  VARCHAR(50),
    phone_number      VARCHAR(20),
    document_type_id     bigint,
    date_of_birth      varchar(255),
    FOREIGN KEY (citizenship_id_id) REFERENCES countries (id),
    FOREIGN KEY (document_type_id) REFERENCES document_type (id),
    primary key (id)
);
CREATE TABLE roads
(
    id             bigint AUTO_INCREMENT,
    departure_id      bigint,
    arrival_id        bigint,
    departure_time VARCHAR(50),
    arrival_time   VARCHAR(50),
    departure_date varchar(255),
    arrival_date   varchar(255),
    price          INT,
    bus_id_id         bigint,
    FOREIGN KEY (departure_id) REFERENCES cities (id),
    FOREIGN KEY (arrival_id) REFERENCES cities (id),
    FOREIGN KEY (bus_id_id) REFERENCES buses (id),
    primary key (id)
);

CREATE TABLE users_permissions
(
    user_id       bigint,
    permissions_id bigint
);
CREATE TABLE review
(
    id        bigint AUTO_INCREMENT,
    comment   VARCHAR(250),
    user_id   bigint,
    stationId bigint,
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (stationId) REFERENCES stations (id),
    primary key (id)
);
CREATE TABLE ticket
(
    id              bigint AUTO_INCREMENT,
    user_id         bigint,
    prime_code_ticket BIGINT,
    road_id_id          bigint,
    place           INT,
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (road_id_id) REFERENCES roads (id),
    primary key (id)
);
ALTER TABLE users_permissions
    ADD CONSTRAINT FK_user_permissions_permission
        FOREIGN KEY (permissions_id) REFERENCES permission (id)
            on delete cascade;

ALTER TABLE users_permissions
    ADD CONSTRAINT FK_user_permissions_users
        FOREIGN KEY (user_id) REFERENCES users (id)
            on delete cascade;

ALTER TABLE cities_stations
    ADD CONSTRAINT FK_cities_stations_cities
        FOREIGN KEY (list_of_cities_id) REFERENCES cities (id)
            on DELETE cascade;

ALTER TABLE cities_stations
    ADD CONSTRAINT FK_cities_stations_stations
        FOREIGN KEY (stations_id) REFERENCES stations (id)
            on DELETE cascade;