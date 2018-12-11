--#1;
SELECT title FROM Movie WHERE director = "Steven Spielberg";

--#2;
SELECT DISTINCT year FROM movie
INNER JOIN rating on rating.mID = movie.mID
WHERE stars IN (4, 5)
ORDER BY year;

--#3;
SELECT title FROM movie
LEFT JOIN rating on rating.mID = movie.mID
WHERE stars IS NULL;

--#4;
SELECT name FROM reviewer
LEFT JOIN rating ON rating.rID = reviewer.rID
WHERE ratingDate IS NULL;

--#5;
SELECT reviewer.name, movie.title, rating.stars, rating.ratingDate
FROM movie
INNER JOIN rating ON rating.mID = movie.mID
LEFT JOIN reviewer ON reviewer.rID = rating.rID
ORDER BY reviewer.name, movie.title, rating.stars;

--#6;
SELECT reviewer.name, movie.title
FROM movie
INNER JOIN rating ON rating.mID = movie.mID
LEFT JOIN reviewer ON reviewer.rID = rating.rID
GROUP BY
reviewer.name, movie.title
HAVING COUNT(*) > 1;
--NOT COMPLETE;

--#B1
SELECT DISTINCT reviewer.name FROM movie
INNER JOIN rating ON rating.mID = movie.mID
INNER JOIN reviewer ON reviewer.rID = rating.rID
WHERE movie.title = "Gone with the Wind";

--#B2
SELECT reviewer.name, movie.title, rating.stars
FROM movie
INNER JOIN rating ON rating.mID = movie.mID
INNER JOIN reviewer ON reviewer.rID = rating.rID
WHERE reviewer.name = movie.director;

