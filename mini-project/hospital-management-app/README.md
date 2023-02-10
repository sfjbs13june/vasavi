### spring boot application

```
https://start.spring.io/
```
### build the project
```
mvn clean install
mvn install dockerfile:build
```
### Run the application
```
docker-compose -f docker-compose-mongo.yml up -d

```
### Stop the application
```
docker-compose -f docker-compose-mongo.yml down -d
```

### Build the application
```
mvn spring-boot:run
```

### Run Project
```
- cd docker
- docker-compose up -d
- cd..
- mvn spring-boot:run

```
### Swagger
```
http://localhost:8080/swagger-ui/index.html
```

### Swagger Credentials
```
DOCTOR-->Username:Doctor-->Password:doctor

PATIENT-->Username:Patient-->Password:patient


```
### Doctor Controller

### Post
```
curl --location --request POST 'localhost:8080/doctor/save' \
--header 'Authorization: Basic RG9jdG9yOmRvY3Rvcg==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=BF0B23B3C292F1CEAD7EC1C1050CA6E5' \
--data-raw '{
  "appointmentId": "1",
  "patientName": "justin",
  "doctorName": "max",
  "date": "12 march",
  "prescription": {
    "prescriptionId": "32",
    "appointmentId": "1",
    "description": "fever",
    "patientName": "justin",
    "doctorName": "max"
  }
}'}'

REQUEST URL - http://localhost:8080/doctor/save
```

### GET
```
curl --location --request GET 'http://localhost:8080/doctor/doctor-appointment?doctorName=max' \
--header 'Authorization: Basic RG9jdG9yOmRvY3Rvcg==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=A7B0E2EC41D1E688A4E61AD3D958015C'



REQUEST URL - http://localhost:8080/doctor/doctor-appointment?doctorName=max

```

### Patient Controller

### Post
```
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic UGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=BF0B23B3C292F1CEAD7EC1C1050CA6E5' \
--data-raw '{
  "appointmentId": "1",
  "patientName": "justin",
  "doctorName": "mark",
  "date": "12 feb",
  "prescription": {
    "prescriptionId": "22",
    "appointmentId": "1",
    "description": "fever",
    "patientName": "justin",
    "doctorName": "mark"
  }
}'



REQUEST URL - http://localhost:8080/patient/save
```

### GET
```
curl --location --request GET 'http://localhost:8080/patient/my-appointment?patientName=justin' \
--header 'Authorization: Basic UGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=A7B0E2EC41D1E688A4E61AD3D958015C'



REQUEST URL - http://localhost:8080/patient/my-appointment?patientName=justin

```
### Prescription Controller

### Post
```
curl --location --request POST 'http://localhost:8080/prescription/save-prescription' \
--header 'Authorization: Basic UGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=A7B0E2EC41D1E688A4E61AD3D958015C' \
--data-raw '{
  "prescriptionId": "2",
  "appointmentId": "1",
  "description": "fever",
  "patientName": "justin",
  "doctorName": "max"
}'



REQUEST URL - http://localhost:8080/prescription/save-prescription
```

### GET
```
curl --location --request GET 'http://localhost:8080/prescription/view-prescription?patientName=justin' \
--header 'Authorization: Basic UGF0aWVudDpwYXRpZW50' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=A7B0E2EC41D1E688A4E61AD3D958015C' 




REQUEST URL - http://localhost:8080/prescription/view-prescription?patientName=justin
```