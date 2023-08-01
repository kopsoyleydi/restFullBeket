INSERT INTO permissions (role)
VALUES ('USER'),
       ('ADMIN');

INSERT INTO document_type (documentName)
VALUES ('Id Card'),
       ('Passport');

INSERT INTO stations (address, contact, station_name)
VALUES ('Tole bi', '+7702433845', 'Sayran'),
       ('Suinbaya', '+77024313845', 'Sayahat'),
       ('Elsibek batyr', '+77024313845', 'Aina'),
       ('Nazarbaev avenue', '+77024313845', 'Astana');

INSERT INTO cities (name, shortName)
VALUES ('Almaty', 'ALM'),
       ('Astana', 'ASA'),
       ('Shymkent', 'SHM'),
       ('Taraz', 'TRZ');


INSERT INTO cities_stations (city_id, station_id)
VALUES (1, 1),
       (2, 1),
       (3, 3),
       (4, 2);

INSERT INTO buses (stationId, places, govNumber)
VALUES (1, 30, '345Al02'),
       (2, 30, '432TY17'),
       (2, 30, '875TO17'),
       (4, 30, '574RE01');

INSERT INTO roads (departure, arrival, departure_time, arrival_time, departure_date, arrival_date,price,bus_id)
VALUES (3, 1, '21:30','07:30', '2023-07-27', '2023-07-28',6000,1),
       (3, 1, '21:30', '08:30', '2023-07-26', '2023-07-29',7000, 2),
       (2, 4, '21:30', '08:30', '2023-07-26', '2023-07-29',7000, 3),
       (2, 4, '21:30', '08:30', '2023-07-26', '2023-07-29',11000, 4);

INSERT INTO countries (name, shortName)
VALUES ('Kazakhstan', 'KAZ'),
       ('Russia', 'RUS'),
       ('Kyrgyzstan', 'KGZ');

INSERT INTO users (email, name,surname,  password,citizenship,patronymic,numberOfDocument, phoneNumber,   documentType, dateOfBirth)
VALUES ('beks1004@mail.ru', 'Beksultan','Kuralbay', '$2a$10$Qtn4SBcyf4Kd7NqL376r2uz81astssB2108GfaS389IGctZhW8QbG',1,'Nurgisauly' ,'N23456',
        '+77024313845',  1,  '2004-07-10');

INSERT INTO user_permissions (user_id, permission_id)
VALUES (1, 1),
       (1, 2);

INSERT INTO ticket (primeCodeTicket, roadId, user_id, place)
VALUES (883802, 1, 1, 2),
       (209256, 1, 1, 15);