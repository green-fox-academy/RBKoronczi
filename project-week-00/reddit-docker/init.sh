docker run \
--name database \
-e MYSQL_ROOT_PASSWORD=egysornemsor \
-e MYSQL_DATABASE=reddit \
-e MYSQL_USER=user \
-e MYSQL_PASSWORD=test123 \
-d \
--rm \
mysql:5


docker run \
--name reddit \
--link database \
-p 8080:8080 \
-e REDDIT_DB_URL=jdbc:mysql://database:3306/reddit \
-e REDDIT_DB_USERNAME=user \
-e REDDIT_DB_PASSWORD=test123 \
-d \
--rm \
reddit