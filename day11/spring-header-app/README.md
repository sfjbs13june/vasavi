## Import project
Import the project on either eclipse or intelli j as a maven import project

## Building

### Maven
This project is maven project which will be build using maven command.

```
$ mvn clean install
```

## Dockerization

```
$ mvn install dockerfile:build
```
## List docker images
```
$ docker images
```

### Running the application in docker container

```
$ docker run -p 8081:8081 vas123/spring-header-app:1.0.0-SNAPSHOT
```

## List docker running container

```
$ docker ps
```

## Start app With Docker-compose

```
$ docker-compose up
```

## Stop app With Docker-compose

```
$ docker-compose down
```

## Start app With Docker-compose in back groud mode

```
$ docker-compose up -d
```


## get docker container logs

```
$ docker-compose logs
```

## List all docker container

```
$ docker ps -a
```

## List only running docker container

```
$ docker ps
```

## List all docker images

```
$ docker images
```

## Stop and remove docker container

```
$ docker stop <container-id>
$ docker rm <container-id>
```

## remove docker images

```
$ docker rmi <image-id>
```
