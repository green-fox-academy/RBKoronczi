CREATE DATABASE ToDo1

use ToDo

CREATE TABLE users (
id INT NOT NULL AUTO_INCREMENT,
firstName VARCHAR(30) NOT NULL,
lastName VARCHAR(30) NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE tasks (
taskID INT NOT NULL AUTO_INCREMENT,
userID INT NOT NULL,
name VARCHAR(80) NOT NULL,
description BLOB,
isComplete BOOLEAN,
deadLine DATE,
PRIMARY KEY (taskID),
FOREIGN KEY (userID) REFERENCES users(id)
);

INSERT INTO users (firstName, lastName)
VALUES  ("John", "Doe"), ("Jane", "Doe");

INSERT INTO tasks (userID, name, description, isComplete, deadLine)
VALUES
(1, "Walk the milk", null, 0, '2008-03-07'),
(1, "Do dog", null, 0, '2136-03-03'),
(1, "Sell my kidney", "I need moaaaar moneeeeyyyy$$$$$", 0, '2019-01-01'),
(1, "Buy homework", null, 1, '2018-12-11');
