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

PRESCRIPTION-->Username:Prescription-->Password:prescription

```
### Doctor Controller

### Post
```
curl -X 'POST' \
  'http://localhost:8080/doctor/save' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "appointmentId": "12",
  "patientName": "john",
  "doctorName": "Alex",
  "date": "12-2-2023",
  "prescription": {
    "prescriptionId": "p12",
    "appointmentId": "12",
    "description": "fever",
    "patientName": "john",
    "doctorName": "Alex"
  }
}'

REQUEST URL - http://localhost:8080/doctor/save
```

### GET
```
curl -X 'GET' \
  'http://localhost:8080/doctor/doctor-appointment?doctorName=Alex' \
  -H 'accept: */*'

REQUEST URL - http://localhost:8080/doctor/doctor-appointment?doctorName=Alex

```

### Patient Controller

### Post
```
curl -X 'POST' \
  'http://localhost:8080/patient/save' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "appointmentId": "44",
  "patientName": "justin",
  "doctorName": "Max",
  "date": "12 march",
  "prescription": {
    "prescriptionId": "p22",
    "appointmentId": "44",
    "description": "headache",
    "patientName": "justin",
    "doctorName": "max"
  }
}'

REQUEST URL - http://localhost:8080/patient/save
```

### GET
```
curl -X 'GET' \
  'http://localhost:8080/patient/my-appointment?patientName=justine' \
  -H 'accept: */*'


REQUEST URL - http://localhost:8080/patient/my-appointment?patientName=justine

```
### Prescription Controller

### Post
```
curl -X 'POST' \
  'http://localhost:8080/prescription/save-prescription' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "prescriptionId": "p11",
  "appointmentId": "65",
  "description": "migraine",
  "patientName": "olivia",
  "doctorName": "harry"
}'


REQUEST URL - http://localhost:8080/prescription/save-prescription
```

### GET
```
curl -X 'GET' \
  'http://localhost:8080/prescription/view-prescription?patientName=olivia' \
  -H 'accept: */*'


REQUEST URL - http://localhost:8080/prescription/view-prescription?patientName=olivia
```