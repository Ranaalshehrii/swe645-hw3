### **Student Survey Application**

This project is a Spring Boot application that collects survey data from users. It can be easily tested using Postman.

---

### 🚀 **Prerequisites**

1. **Java 17 or higher** - Make sure Java is installed and configured.
2. **Maven** - For building the Spring Boot project.
3. **Postman** - For API testing.

---

### 🛠️ **Setup Instructions**

#### **1. Clone the Repository**

```bash
git clone https://github.com/Ranaalshehrii/swe645-hw3.git
cd swe645-hw3
```

#### **2. Configure Git (if not already set up)**

```bash
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
```

---

### 🌟 **Building and Running the Application Locally**

#### **1. Build the Project**

Make sure you are in the project root directory:

```bash
./mvnw clean install -DskipTests
```
OR
```bash
./mvnw clean package -DskipTests
```

- `clean`: Removes all previously compiled files.
- `install`: Compiles, tests (if not skipped), packages, and copies the `.jar` file to your local repository.
- `package`: Just creates the `.jar` file without installing it to the local repository.

---

#### **2. Run the Spring Boot Application**

```bash
./mvnw spring-boot:run
```
OR if you want to run the `.jar` directly:
```bash
java -jar target/student-survey-0.0.1-SNAPSHOT.jar
```

---

#### **3. Access the Application**

- **URL:** `http://localhost:8080`
- **H2 Database Console:**  
  ```
  http://localhost:8080/h2-console
  ```
  - JDBC URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: (Leave empty)

---

### 📮 **Testing with Postman**

#### **1. Postman Setup**

- Base URL: `http://localhost:8080`

#### **2. API Endpoints**

| HTTP Method | Endpoint               | Description                        |
|------------|-------------------------|------------------------------------|
| POST       | /survey/save            | Save a new survey                   |
| GET        | /survey/all             | Get all survey responses            |
| GET        | /survey/{id}            | Get a specific survey by ID         |
| DELETE     | /survey/{id}            | Delete a specific survey by ID      |

#### **3. Example POST Request**

- **URL:** `http://localhost:8080/survey/save`
- **Method:** POST
- **Body:** (JSON)
  ```json
  {
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "city": "Fairfax",
    "state": "VA",
    "zip": "22030",
    "telephoneNumber": "123-456-7890",
    "likedMost": "Location",
    "interestSource": "Friend",
    "recommendation": "Yes"
  }
  ```

#### **4. Example GET Requests**

- **Get All Surveys**  
  - **URL:** `http://localhost:8080/survey/all`
  - **Method:** GET

- **Get Survey By ID**  
  - **URL:** `http://localhost:8080/survey/1`
  - **Method:** GET

#### **5. Example DELETE Request**

- **Delete Survey By ID**  
  - **URL:** `http://localhost:8080/survey/1`
  - **Method:** DELETE

---

### 🔧 **Troubleshooting**

- **Common Spring Boot Errors:**  
  - If H2 driver issues arise, ensure the H2 dependency is correctly set in `pom.xml`.
  - Make sure you have the correct settings in your `application.properties` file.

---

