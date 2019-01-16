docker run \
--name database \
-e MYSQL_ROOT_PASSWORD='egysornemsor' \
-e MYSQL_DATABASE='reddit' \
-d \
--rm \
mysql:latest

docker run \
--name reddit \
--link database:mysql \
-p 8080:8080 \
-e REDDIT_DB_URL='jdbc:mysql://database/reddit' \
-e REDDIT_DB_USERNAME='root' \
-e REDDIT_DB_PASSWORD='egysornemsor' \
--rm \
reddit