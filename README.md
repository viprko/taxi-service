# Taxi-service

![img.png](taxi-img.png)


It is a simple project that demonstrates my JAVA knowledge and skills, such as working with JDBC, Servlet API, JSP and
SQL databases. The app has a part functionality of a taxi-like application, which includes adding a driver, adding a car,
authentication as a driver etc. Realized a functionality for CRUD operations (create, read, update, delete) with SQL database
and a small interface for using these operations by the driver.

## Functionality

![img.png](navbar.png)

1. Login page (login as driver)
2. My Cars page (display car by authenticated driver)
3. Add driver
4. Add manufacturer
5. Add car
6. Add driver to car
7. Display all drivers
8. Display all cars
9. Display all manufacturers
10. Delete car
11. Delete driver
12. Delete manufacturer

## Project structure

* **Controller** Layer: This layer consists of servlets or controllers that handle HTTP requests and generate responses.
  Each
  functionality is mapped to a specific controller class responsible for processing the corresponding request and
  interacting with the service layer.


* **Service** Layer: The service layer encapsulates the business logic of the application. It provides an abstraction
  between
  the controllers and the data access layer (DAO). The service layer processes requests from the controllers, applies
  necessary validations, performs data manipulations, and coordinates with the DAO layer for data retrieval or
  persistence.


* **DAO** Layer: The DAO (Data Access Object) layer is responsible for interacting with the underlying database. It
  provides
  methods for creating, reading, updating, and deleting data from the database. The DAO layer handles the persistence
  and
  retrieval of entities such as drivers, cars, and manufacturers.

## Technologies used

- Java 19
- JDBC
- Servlet API 4.0.1
- JSP
- JSTL 1.2
- Maven
    - Checkstyle plugin 3.1.1
    - War plugin 3.3.2
    - Compiler plugin 3.8.0
- Tomcat 9.0.76
- MySQL 8.0.33

## How to run

1. Fork this project
2. Clone it to your machine
3. Configure [MySQL](https://dev.mysql.com/downloads/mysql/) (install and configure your user)
4. Run the scripts from "src/main/resources/init_db.sql" with MySQL (for initialization a local database for project)
5. Change credentials in "src/main/java/taxi/util/ConnectionUtil.java"

![img.png](DbConnectionCredentials.png)

6. Configure [Tomcat 9.0.76](https://tomcat.apache.org/download-90.cgi)
7. Run Tomcat local server (You can access to project's functionality by "http:// yourserver:yourport/login")

