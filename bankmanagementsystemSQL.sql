CREATE DATABASE bankmanagementsystem;

SHOW DATABASES;

USE bankmanagementsystem;

CREATE TABLE signup(formno varchar(20),Name varchar(50),Father_name varchar(40),DOB varchar(20),Gender varchar(20),Email varchar(50),Marital_Status varchar(20),Address varchar(50),City varchar(30),State varchar(30),PinCode varchar(30));

SHOW TABLES;

SELECT * FROM signup;

CREATE TABLE signuptwo(formno varchar(20),Religion varchar(20),Category varchar(20),Income varchar(20),Education varchar(20),Occupation varchar(20),PanNo varchar(20),AadharNo varchar(20),SeniorCitizen varchar(20),ExistingAccount varchar(20));

SELECT * FROM signuptwo;

CREATE TABLE signupthree(formno varchar(20),AccountType varchar(40),CardNumber varchar(25),Pin varchar(10),Facility varchar(100));

CREATE TABLE login(formno varchar(20),CardNumber varchar(25),Pin varchar(10));

SELECT * FROM signupthree;

SELECT * FROM login;

DROP TABLE bank;

CREATE TABLE bank(Pin varchar(20),Date varchar(50),Type varchar(20),Amount varchar(20));

SELECT * FROM bank;