#Build

mvn clean install

# Run
mvn spring-boot:run


## Create docker image

```bash
$ mvn install dockerfile:build
```

### Push docker images

```bash
docker login
$ docker push <repository-name>/springsecurity
```

## Running

The application can be start is either locally using maven or start in docker container.

### Running the application in local environment
Using eclipse:It can be run as java application or run configuration to provide the program arguments.
You can run using maven command as:

```bash
$ mvn spring-boot:run
```

### Running the application in docker container

```bash
$ docker run -p 8080:8080 vas123/hospital-application:1.0.0 
$ docker-compose  pull
$ docker-compose  up
```

## Looking docker image

docker exec -it c555dfd07277 bash



#Show data::

docker exec -it third-mongo-spring-data_mongo_1 bash

mongo

show dbs

use test_db

show tables

db.customer.find()

# swagger

http://localhost:8083/swagger-ui.html