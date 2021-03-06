create table student
(
  name     varchar(20) not null,
  ser_name varchar(20),
  phone    varchar(20) not null,
  email    varchar(20) not null
);

alter table student
  owner to postgres;

create unique index student_phone_uindex
  on student (phone);

create unique index student_email_uindex
  on student (email);

INSERT INTO student (name, ser_name, phone, email) VALUES ('bim', 'frick', '+380503456785', 'bim@mail.ru');
INSERT INTO student (name, ser_name, phone, email) VALUES ('doberman', 'dog', '+380503456787', 'doberman@gmail.com');
INSERT INTO student (name, ser_name, phone, email) VALUES ('karl', 'bobovich', '+380503456789', 'bob@mail.ru');
INSERT INTO student (name, ser_name, phone, email) VALUES ('jon', 'karlov', '+380633456781', 'jon@mail.ru');
INSERT INTO student (name, ser_name, phone, email) VALUES ('toma', 'karlova', '+380633456782', 'toma@mail.ru');
INSERT INTO student (name, ser_name, phone, email) VALUES ('ikka', 'bus', '+380633456788', 'ikka@mail.ru');
INSERT INTO student (name, ser_name, phone, email) VALUES ('fox', 'gordon', '+380683456784', 'fox@mail.ru');
INSERT INTO student (name, ser_name, phone, email) VALUES ('don', 'abramov', '+380903456786', 'don@mail.ru');
INSERT INTO student (name, ser_name, phone, email) VALUES ('dina', 'ivanova', '+380903456789', 'dina@mail.ru');
INSERT INTO student (name, ser_name, phone, email) VALUES ('den', 'ketch', '+380933456783', 'den@gmail.com');
INSERT INTO student (name, ser_name, phone, email) VALUES ('lila', 'karlova', '0000', 'lila@mail.ru');