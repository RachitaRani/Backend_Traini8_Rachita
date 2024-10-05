*Traini8 - Government-funded Training Center Registry*

### Overview

Traini8 is a Spring Boot-based application that provides APIs to manage a registry of government-funded training centers. The application allows users to create and retrieve training center information, with validations in place and optional filtering capabilities on retrieval.

### Features

- *Create Training Centers*: Create and save training centers with validated fields like name, center code, address, student capacity, and contact details.
- *Retrieve Training Centers*: Retrieve all stored training centers with optional filters such as city, state, and courses offered.
- *Validation*: Ensures data integrity through annotations-based validations for fields like email, phone number, and student capacity.
- *Filtering*: Retrieve training centers based on filters for city, state, capacity, and courses.
- *PostgreSQL Database Integration*: Data is persisted using PostgreSQL.

---

## *Table of Contents*

1. [Technologies Used](#technologies-used)
2. [Project Setup](#project-setup)
3. [API Endpoints](#api-endpoints)
4. [Database Configuration](#database-configuration)
5. [Testing the APIs](#testing-the-apis)

---

## *Technologies Used*

- *Java*: 17+
- *Spring Boot*: 3.0+
- *Spring Data JPA*: For ORM and database operations
- *PostgreSQL*: For persistent storage
- *Maven*: For dependency management and build
- *H2 Console*: (For development/testing)
  

## *Project Setup*

### *Step 1: Clone the Repository*
bash
git clone https://github.com/RachitaRani/Backend_Traini8_Rachita.git
cd traini8

### *Step 2: Configure PostgreSQL Database*

1. Ensure PostgreSQL is installed and running on your machine.
2. Create a new PostgreSQL database and user:
   sql
   CREATE DATABASE traini8db;
   CREATE USER traini8user WITH PASSWORD 'yourpassword';
   GRANT ALL PRIVILEGES ON DATABASE traini8db TO traini8user;
   
3. Update the application.properties file located at src/main/resources/ with your database credentials:
   properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/traini8db
   spring.datasource.username=traini8user
   spring.datasource.password=yourpassword
   spring.datasource.driver-class-name=org.postgresql.Driver
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
   spring.jpa.hibernate.ddl-auto=update
   

### *Step 3: Build the Project*
You can use *Maven* to build the project. If you are using an IDE such as IntelliJ IDEA, import the project and build from there.
bash
mvn clean install


### *Step 4: Run the Application*
Once the project is built successfully, run the Spring Boot application using Maven:
bash
mvn spring-boot:run

By default, the application will start at http://localhost:8080.

---

## *API Endpoints*
For detailed API endpoints description visit <a href="https://github.com/RachitaRani/Backend_Traini8_Rachita/blob/main/Training%20Center%20Registry%20API%20Documentation.pdf">PDF</a>

## *Database Configuration*
This project uses *PostgreSQL* as the primary database. You need to configure the database details in the application.properties file:

spring.datasource.url=jdbc:postgresql://localhost:5432/traini8db
spring.datasource.username=traini8user
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update


### *Using PostgreSQL*
1. Install and run PostgreSQL locally or use a cloud-based PostgreSQL instance.
2. Create the required database and user as shown in the [setup instructions](#step-2-configure-postgresql-database).

---

## *Testing the APIs*
You can use *Postman* or *cURL* to interact with the APIs. For sample cURL commands to help you test the APIs <a href="https://github.com/RachitaRani/Backend_Traini8_Rachita/blob/main/Training%20Center%20Registry%20API%20Documentation.pdf">VISIT</a>


### *License*

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
This should provide a comprehensive *README.md* file for your GitHub project.
