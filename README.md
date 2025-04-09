## Amazon RDS MySQL Database Setup

This microservice application uses a MySQL database hosted on Amazon RDS for storing survey responses. Below are the steps used to create and configure the database:

### Step 1: Access AWS Academy Lab
- Logged into AWS Academy Lab using AWS Learner Lab credentials provided by Joey.
- Launched the lab environment and accessed the AWS Console.

### Step 2: Create RDS MySQL Instance
- Navigated to **Amazon RDS** in the AWS Console.
- Clicked **"Create database"**.
- Selected:
  - Engine: **MySQL**
  - Template: **Free tier** or **Dev/Test**
  - DB instance identifier: `student-survey-db`
  - Master username: `admin`
  - Master password: `01bYgdkHminrSaZg`

### Step 3: Enable Public Access
- Set **Public Access**: `Yes` during database creation.
- Used the **default VPC security group**.

### Step 4: Configure Security Group
- Edited **Inbound Rules** of the selected security group:
  - Added rule:
    - **Type**: MySQL/Aurora
    - **Port**: 3306
    - **Source**: `0.0.0.0/0` (temporarily allowed all IPs for development)

### Step 5: Provide Connection Details
- Shared the following credentials with the team to update `application.properties`:
# MySQL RDS Database Config
spring.datasource.url=jdbc:mysql://student-survey-db.cpo6pmgwxit1.us-east-1.rds.amazonaws.com:3306/student-survey-db
spring.datasource.username=admin
spring.datasource.password=${DB_PASSWORD}

# Hibernate settings
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

> Note: RDS automatically creates the schema from the Spring Boot entity if `spring.jpa.hibernate.ddl-auto=update` is enabled.

### Result
The database is publicly accessible and ready to be integrated with the Spring Boot backend. This setup allows the application to store and retrieve student survey data in a centralized, cloud-based relational database.
