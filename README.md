# SpringBoot Messaging App

This is a simple Spring Boot application demonstrating different REST API calls.

## Features
- Implements various HTTP methods (`GET`, `POST`, `PUT`).
- Uses **Path Variables**, **Query Parameters**, and **Request Body**.
- Provides structured responses.

---

## API Endpoints

### 🚀 UC-1: Basic GET Request
Returns a simple greeting message.

- **Endpoint:**  
  ```http
  GET /hello
- **Response:**
```
"Hello from BridgeLabz!"
```
- **CURL Command:**
```
curl -X GET "http://localhost:8080/hello" -w "\n"
```
### 🔎 UC-2: GET Request with Query Parameter
Takes a name as a query parameter and returns a personalized greeting.

- **Endpoint**:
```
GET /query?name={name}
```
-**Example Request:**
```
GET /query?name=Mark
```
-**Response:**
```
"Hello Mark!"
```
-**CURL Command:**
```
curl -X GET "http://localhost:8080/query?name=Mark" -w "\n"
```

### 📌 UC-3: GET Request with Path Variable
Takes a name as a path variable and returns a personalized greeting.

- **Endpoint**:

```
GET /param/{name}
```
-**Example Request:**
 ```
GET /param/Mark
```
-**Response:**
```
"Hello Mark!"
```
-**CURL Command:**
```
curl -X GET "http://localhost:8080/param/Mark" -w "\n"
```

### 📬 UC-4: POST Request with JSON Body
Accepts a firstName and lastName in the request body and returns a greeting.

- **Endpoint**:
```
POST /post
```
-**Request Body:**
```
{
  "firstName": "Mark",
  "lastName": "Taylor"
}
```
-**Response:**
```
"Hello Mark Taylor from BridgeLabz!"
```
-**CURL Command:**
```
curl -X POST -H "Content-Type: application/json" -d '{"firstName": "Mark", "lastName": "Taylor"}' "http://localhost:8080/post" -w "\n"
```

### 🔄 UC-5: PUT Request with Path Variable and Query Parameter
Accepts firstName as a path variable and lastName as a query parameter.

- **Endpoint**:
```
PUT /put/{firstName}?lastName={lastName}
```
-**Example Request:**
```
PUT /put/Mark?lastName=Taylor
```
-**Response:**
```
"Hello Mark Taylor!"
```
-**CURL Command:**
```
curl -X PUT "http://localhost:8080/put/Mark?lastName=Taylor" -w "\n"
```
### 📂 Project Structure


SpringBoot-Messaging-App

│── app

│   ├── src/main/java/com/messaging/app

│   │   ├── HelloWorld.java  # Controller class

│   │   ├── User.java        # DTO for user details

│── README.md


### 🚀 How to Run
-**Clone the repository:**
```
git clone https://github.com/thelastcig/SpringBoot-Messaging-App.git
```
-**Navigate to the project directory:**
```
cd SpringBoot-Messaging-App
```
-**Run the application:**
```
mvn spring-boot:run
```
```
Open http://localhost:8080/hello in a browser or use the provided CURL commands.
```
### 🎯 Tech Stack
- **Java (JDK 17)**

- **Spring Boot (REST API framework)**

- **Maven (Build tool)**

### 📌 Author
**Sonu Sharma**

### GitHub: thelastcig

