docker run \
--name database \
-e MYSQL_ROOT_PASSWORD=egysornemsor \
-e MYSQL_DATABASE=reddit \
-e MYSQL_USER=user \
-e MYSQL_PASSWORD=test123 \
-d \
--rm \
mysql:5
