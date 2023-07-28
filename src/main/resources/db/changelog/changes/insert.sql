INSERT INTO countries (id, name, shortName)
VALUES (1, 'Kazakhstan', 'KAZ'),
       (2, 'Russia', 'RUS'),
       (3, 'Kyrgyzstan', 'KGZ');

INSERT INTO document_type (id, documentName)
VALUES (1, 'Id Card'),
       (2, 'Passport');

INSERT INTO permissions (id, role)
VALUES (1, 'USER'),
       (2, 'ADMIN');

INSERT INTO cities (id, name, shortName)
VALUES (1, 'Алматы', 'ALM'),
       (2, 'Астана', 'ASA'),
       (3, 'Шымкент', 'SHM'),
       (4, 'Тараз', 'TRZ');


INSERT INTO stations (id, station_name, address, contact)
VALUES (1, 'Tole bi 287', '+7702433845', 'Sayran'),
       (2, 'Суюнбая 1', '+77024313845', 'Sayahat'),
       (3, 'Елшибек Батыра', '+77024313845', 'Aina'),
       (4, 'Nazarbaev avenue', '+77024313845', 'Astana');

INSERT INTO cities_stations (city_id, station_id)
VALUES (1, 1),
       (2, 1),
       (3, 3),
       (4, 2);

INSERT INTO buses (id, stationId, places, govNumber)
VALUES (1, 1, 30, '345Al02'),
       (2, 2, 30, '432TY17'),
       (3, 2, 30, '875TO17'),
       (4, 4, 30, '574RE01');

INSERT INTO roads (id, departure, arrival, departure_time, arrival_time, departure_date, arrival_date,price,bus_id)
VALUES (1, 3, 1, '21:30','07:30', '2023-07-27', '2023-07-28',6000,1),
       (2, 3, 1, '21:30', '08:30', '2023-07-26', '2023-07-29',7000, 2),
       (3, 2, 4, '21:30', '08:30', '2023-07-26', '2023-07-29',7000, 3),
       (4, 2, 4, '21:30', '08:30', '2023-07-26', '2023-07-29',11000, 4);


INSERT INTO users (id, email, name,surname,  password,citizenship,patronymic,numberOfDocument, phoneNumber,   documentType, dateOfBirth)
VALUES (1, 'beks1004@mail.ru', 'Beksultan','Kuralbay', '$2a$10$Qtn4SBcyf4Kd7NqL376r2uz81astssB2108GfaS389IGctZhW8QbG',1,'Nurgisauly' ,'N23456',
        '+77024313845',  1,  '2004-07-10');

INSERT INTO user_permissions (user_id, permission_id)
VALUES (1, 1),
       (1, 2);

INSERT INTO ticket (id,primeCodeTicket, roadId, user_id, place)
VALUES (1, 883802, 1, 1, 2),
       (2, 209256, 1, 1, 15);