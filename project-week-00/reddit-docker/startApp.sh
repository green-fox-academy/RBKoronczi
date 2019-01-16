docker run \
--name reddit \
--link database:mysql \
-p 8080:8080 \
-e REDDIT_DB_URL=jdbc:mysql://database:3306/reddit \
-e REDDIT_DB_USERNAME=user \
-e REDDIT_DB_PASSWORD=test123 \
--rm \
reddit