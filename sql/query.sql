CREATE DATABASE dbexames;

USE dbexames;

CREATE TABLE exames(
    id_ex INT PRIMARY KEY AUTO_INCREMENT,
    nm_pac VARCHAR(50) NOT NULL UNIQUE,
    nm_ex varchar(50) NOT NULL,
    dt_ex DATE NOT NULL,
    obs_ex VARCHAR(255)
);