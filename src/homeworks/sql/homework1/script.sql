create database library;

create table book (
                      id INT primary key generated always as identity,
                      title VARCHAR(120) NOT NULL ,
                      description VARCHAR(50) DEFAULT VARCHAR 'Description absent',
                      product_data DATE NOT NULL ,
                      author VARCHAR(60),
                      category VARCHAR(60)
);
insert into book (title, description, product_data, author, category)
values ('Last Night', 'Sorsbie', '01-07-2020', 'Boone Sorsbie', 'Carex backii Boott'),
       ('Young Lieutenant, The (Le petit lieutenant)', 'Knevett', '06-05-2021', 'Winifield Knevett', 'Carya illinoinensis'),
       ('Summer in Berlin (Sommer vorm Balkon)', 'Menelaws', '09-12-2021', 'Feliks Menelaws', 'Layia gaillardioides'),
       ('Blood Relatives (Liens de sang, Les)', 'McAneny', '05-05-2019', 'Roderick McAneny', 'Hygrohypnum subeugyrium'),
       ('Kedma', 'Bragg', '20-04-2022', 'Sheila Bragg', 'Heterodermia granulifera'),
       ('Too Beautiful for You (Trop belle pour toi)', 'Bensusan', '20-11-2021', 'Renato Bensusan', 'Pectis glaucescens'),
       ('Hunter, The', 'Dinkin', '22-10-2021', 'Mercedes Dinkin', 'Hosta lancifolia'),
       ('Darkness', 'Dulton', '21-05-2022', 'Gaylor Dulton', 'Oenothera flava'),
       ('Sexo, Amor e Traição', 'Buttfield', '01-07-2019', 'Cullen Buttfield', 'Lobaria scrobiculata'),
       ('Between the Folds', 'Myring', '09-06-2020', 'Rozamond Myring', 'Sidalcea neomexicana');

SELECT * FROM book;

create table books (
                       id INT primary key generated always as identity,
                       title VARCHAR(120) NOT NULL ,
                       description VARCHAR(120) NOT NULL,
                       product_data DATE NOT NULL,
                       isbn VARCHAR(50) NOT NULL,
                       pages INT NOT NULL,
                       first_name VARCHAR(45) NOT NULL,
                       second_name VARCHAR(45) NOT NULL,
                       email VARCHAR(50) NOT NULL,
                       age INT NOT NULL,
                       birthday DATE NOT NULL,
                       awards VARCHAR(120)
);
insert into books (title, description, product_data, isbn, pages, first_name, second_name, email, age, birthday, awards)
values ('The Face of Love', 'n/a', '19-07-2022', '324646795-1', 449, 'Léane', 'Garnsey', 'ggarnsey0@nbcnews.com', 32, '23-01-2019', 'WisdomTree Emerging Markets Consumer Growth Fund'),
       ('Scarlet Letter, The', 'Capital Goods', '29-07-2021', '967272820-4', 431, 'Amélie', 'Emma', 'kemma1@chron.com', 51, '07-08-2021', 'Chart Industries, Inc.'),
       ('Chillers', 'n/a', '04-06-2021', '158629726-0', 298, 'Naéva', 'McClory', 'cmcclory2@umn.edu', 72, '13-04-2022', 'First Trust Municipal CEF Income Opportunity ETF'),
       ('Gray Lady Down', 'n/a', '23-03-2022', '535921147-4', 316, 'Edmée', 'Treasure', 'atreasure3@opensource.org', 49, '14-09-2019', 'Solar Capital Ltd.'),
       ('Conan O''Brien Can''t Stop', 'Public Utilities', '18-11-2020', '993898485-1', 128, 'Céline', 'Hatry', 'jhatry4@blogspot.com', 74, '08-10-2018', 'Shenandoah Telecommunications Co'),
       ('Keeper, The', 'Consumer Services', '13-01-2021', '703414713-2', 419, 'Magdalène', 'Meacher', 'dmeacher5@1und1.de', 37, '22-10-2019', 'First Cash, Inc.'),
       ('Susannah of the Mounties', 'Health Care', '21-03-2021', '589942658-6', 166, 'Gwenaëlle', 'Axten', 'gaxten6@nih.gov', 64, '06-03-2020', 'NanoString Technologies, Inc.'),
       ('The Nutcracker in 3D', 'Basic Industries', '25-12-2020', '030310984-X', 143, 'Pélagie', 'Rylance', 'mrylance7@seesaa.net', 74, '09-10-2018', 'Albany International Corporation'),
       ('Armageddon 2012', 'Public Utilities', '14-08-2019', '455521365-3', 163, 'Erwéi', 'Drewell', 'ydrewell8@va.gov', 28, '21-05-2018', 'Entergy Louisiana, Inc.'),
       ('Diamond Dogs', 'n/a', '08-07-2021', '423649276-8', 364, 'Amélie', 'Bowness', 'lbowness9@hexun.com', 29, '12-11-2018', 'First Bank');

SELECT * FROM books;



