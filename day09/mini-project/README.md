### **#Create Spring boot project**

https://start.spring.io/




#### **#Build project**
```
mvn clean install
```

#### **Dockerization**
```
mvn install dockerfile:build
```

#### **List docker images**
```  
docker images
```

#### **List docker running container**
``` 
docker ps
```

#### **Running the application in docker container**
``` 
docker run -p 8080:8080 vas123/mini-project:0.0.1-SNAPSHOT
```