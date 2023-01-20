# Build application

```
mcn clean install
```

# Run application

```
mvn spring-boot:run
```

# Test Application

```
curl GET 'localhost:8081/welcome?name=vasavi'
curl --location --request GET 'localhost:8081/welcome?name=vasavi'

```
