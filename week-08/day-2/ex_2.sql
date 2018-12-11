--Highschooler ( ID, name, grade ) 
--Friend ( ID1, ID2 ) 
--Likes ( ID1, ID2 ) 

--#Q1
SELECT DISTINCT h.name
FROM Highschooler h
INNER JOIN Friend ON Friend.ID1 = h.ID
INNER JOIN Highschooler g ON g.ID = Friend.ID2
WHERE g.name = "Gabriel";

--#Q2
SELECT DISTINCT h.name, h.grade, l.name, l.grade
FROM Highschooler h
INNER JOIN Likes ON Likes.ID1 = h.ID
INNER JOIN Highschooler l on l.ID = Likes.ID2
WHERE h.grade - l.grade > 1;