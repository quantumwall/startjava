CREATE DATABASE Jaegers;
CREATE TABLE Jaegers (
    id SERIAL NOT NULL PRIMARY KEY,
    modelName TEXT NOT NULL,
    mark TEXT NOT NULL,
    height REAL NOT NULL,
    weight REAL NOT NULL,
    status TEXT NOT NULL,
    origin TEXT NOT NULL,
    launch DATE NOT NULL,
    kaijuKill SMALLINT
);