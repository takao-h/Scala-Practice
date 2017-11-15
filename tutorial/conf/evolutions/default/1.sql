# --- !Ups

create table if not exists play_scala_intro.people(
    id INT not null primary key auto_increment,
    name VARCHAR(255) not null,
    age INT not null
);

# --- create table "people" (
# ---   "id" bigint generated by default as identity(start with 1) not null primary key,
# ---   "name" varchar not null,
# ---   "age" int not null
# --- );


# --- !Downs
drop table if exists people;

# --- drop table "people" if exists;