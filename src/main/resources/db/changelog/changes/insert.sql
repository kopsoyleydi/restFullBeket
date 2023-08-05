INSERT INTO permission (role)
VALUES ('USER'),
       ('ADMIN');

INSERT INTO document_type (document_name)
VALUES ('Id Card'),
       ('Passport');

INSERT INTO stations (address, contact, station_name)
VALUES ('Tole bi', '+7702433845', 'Sayran'),
       ('Suinbaya', '+77024313845', 'Sayahat'),
       ('Elsibek batyr', '+77024313845', 'Aina'),
       ('Nazarbaev avenue', '+77024313845', 'Astana');

INSERT INTO cities (name, short_name)
VALUES ('Almaty', 'ALM'),
       ('Astana', 'ASA'),
       ('Shymkent', 'SHM'),
       ('Taraz', 'TRZ');


INSERT INTO cities_stations (list_of_cities_id, stations_id)
VALUES (1, 1),
       (2, 1),
       (3, 3),
       (4, 2);

INSERT INTO buses (station_id_id, places, gov_number)
VALUES (1, 30, '345Al02'),
       (2, 30, '432TY17'),
       (2, 30, '875TO17'),
       (4, 30, '574RE01');

INSERT INTO roads (departure_id, arrival_id, departure_time, arrival_time, departure_date, arrival_date,price,bus_id_id)
VALUES (3, 1, '21:30','07:30', '2023-07-27', '2023-07-28',6000,1),
       (3, 1, '21:30', '08:30', '2023-07-26', '2023-07-29',7000, 2),
       (2, 4, '21:30', '08:30', '2023-07-26', '2023-07-29',7000, 3),
       (2, 4, '21:30', '08:30', '2023-07-26', '2023-07-29',11000, 4);

INSERT INTO countries (name, short_name)
VALUES ('Kazakhstan', 'KAZ'),
       ('Russia', 'RUS'),
       ('Kyrgyzstan', 'KGZ');

INSERT INTO users (email, name,surname,  password,citizenship_id_id,patronymic,number_of_document, phone_number,   document_type_id, date_of_birth)
VALUES ('beks1004@mail.ru', 'Beksultan','Kuralbay', '$2a$10$Qtn4SBcyf4Kd7NqL376r2uz81astssB2108GfaS389IGctZhW8QbG',1,'Nurgisauly' ,'N23456',
        '+77024313845',  1,  '2004-07-10');

INSERT INTO users_permissions (user_id, permissions_id)
VALUES (1, 1),
       (1, 2);

INSERT INTO ticket (prime_code_ticket, road_id_id, user_id, place)
VALUES (883802, 1, 1, 2),
       (209256, 1, 1, 15);