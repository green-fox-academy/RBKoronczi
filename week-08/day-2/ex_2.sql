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

--#Q3
SELECT DISTINCT h.name, h.grade, l.name, l.grade
FROM Highschooler h
INNER JOIN Likes ON Likes.ID1 = h.ID
INNER JOIN Highschooler l ON l.ID = Likes.ID2
INNER JOIN Likes x ON x.ID1 = l.ID
INNER JOIN Highschooler h2 ON h2.ID = x.ID2
WHERE h2.name = h.name AND h.name < l.name;

--#Q4
SELECT DISTINCT h.name, h.grade
FROM Highschooler h
LEFT JOIN Likes l1 ON l1.ID1 = h.ID
LEFT JOIN Likes l2 ON l2.ID2 = h.ID
WHERE l1.ID1 IS NULL AND l2.ID2 IS NULL
ORDER BY h.grade, h.name;