# English School Managment System
## Student Portal
This system allows students to have access to their academic data as well as their attendance and average grades.

## Admin Application
There is an admin appliation that allows users to register new students, new teachers, and publish student performance

- You can access the admin application in this link [https://github.com/maleianefernando/EESAdminApp.git](https://github.com/maleianefernando/EESAdminApp.git)

## Table of contents
- [How to use](#how-to-use)
- [Requirements](#requirements)
- [Clone the repository](#1-clone-this-repository)
- [Database](#2-import-the-database)
- [Install dependencies](#3-open-your-ide-to-install-dependencies)
- [Build and run](#4-access-the-using-the-command-line)
- [Login](#5-login-process)
- [Users credentials](#6-credentials)
- [Author](#author)

## How to use
### Requirements
- Java 17+
- Spring Tool Suite IDE
- MySQL
- Git
### Steps
#### 1. Clone this repository
```
git clone https://github.com/maleianefernando/Student-managment-system.git
```
#### 2. Import the database
Into the ```/Emmanuel Englsh School/Emmanuel-Englsh-School-WebApp/src/main/resources/static/sql``` directory we can access the application database, import it to your xampp server or sql.

#### 3. Open your IDE to install dependencies
#### 4. Access the using the command-line
```
cd Emmanuel Englsh School/Emmanuel-Englsh-School-WebApp
```
Since your are in this directory type this command to build the app:
```
./mvnw package
```
Run the app:
```
./mvnw spring-boot:run
```

#### 5. Login Process
Now [http://localhost:9090/](http://localhost:9090/) open your browser and sign in any account.

##### 6. Credentials
The username is the name of the student and the password is the student birthdate in the format ```ddmmyyy```

## Author
Fernando Paulo Maleiane