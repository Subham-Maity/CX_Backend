# Resource – CodeXam
Resources

**First Resources for our Application**

*   user
*   category
*   post
*   comment

**Best architecture while using spring boot for backend**

*   Layered Architecture - Spring Boot

```
                               +----------------+
                               |                |
                               |  Spring Boot   |
                               |  Application   |
                               |                |
                               +-------+--------+
                               |
                               |
+-------------+        +-------v--------+
|             |        |                |
|  Database   |        |   Services     |
|             |        |                |
+------+------+        +-------+--------+
|                      |
|                      |
|              +-------v--------+
|              |                |
|              |   Controllers  |
|              |                |
+--------------+----------------+
```


![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/03.%20Resources/1.png?raw=true)

*   Postman client: The Postman client is used to send HTTP requests to the application's API endpoints. It can be used to test the various endpoints of the application and view the responses.
    
*   DTO (Data Transfer Object): A DTO is an object that is used to transfer data between different layers of the application. It is often used to transfer data from the presentation layer (such as a web application) to the business logic layer (such as a service or controller).
    
*   JSON (JavaScript Object Notation): JSON is a data interchange format that is used to transmit data between a server and a client. It is often used to send data from a server to a web application and vice versa. In a Spring Boot application, JSON is often used to serialize and deserialize data when communicating with the client.
    
*   Controller: A controller is a component in a Spring application that handles HTTP requests and returns a response. When the Postman client sends an HTTP request to the application, the request is received by the controller. The controller is responsible for delegating the task to the appropriate service, and returning a response to the client.
    
*   API Layer: The API layer is the layer of the application that exposes the API endpoints that can be accessed by clients. It typically consists of controllers that handle requests and return responses.
    
*   Service: A service is a component in a Spring application that contains the business logic. It is responsible for performing the tasks required to fulfill a request from the controller, such as interacting with a database or external API.
    
*   DAO (Data Access Object): A DAO is a component that is responsible for interacting with a database. It typically contains methods for performing CRUD (create, read, update, delete) operations on the database.
    
*   Persistence Logic: The persistence logic is the component of the application that is responsible for managing the data persistence layer. This could include tasks such as saving data to a database or retrieving data from a database.
    
*   Database: A database is a system that is used to store and retrieve data. Spring applications can use a variety of databases, including relational databases (such as MySQL or Oracle) and NoSQL databases (such as MongoDB). The DAO component interacts with the database to perform CRUD operations.
    

Here is a diagram illustrating the flow of an HTTP request through a Spring Boot application:

```
+----------------+        +----------------+        +----------------+      +----------------+      +----------------+
|                |        |                |        |                |      |                |      |                |
|  Postman       |        |  Controller    |        |  Service       |      |  DAO           |      |  Database      |
|  Client        |        |                |        |                |      |                |      |                |
+----------------+        +----------------+        +----------------+      +----------------+      +----------------+
+----------------+        +----------------+        +----------------+      +----------------+      +----------------+
|                |        |                |        |                |      |                |      |                |
|  HTTP Request  |        |  HTTP Response |        |  HTTP Request  |      |  HTTP Response |      |  HTTP Request  |
|                |        |                |        |                |      |                |      |                |
+----------------+        +----------------+        +----------------+      +----------------+      +----------------+
+----------------+        +----------------+        +----------------+      +----------------+      +----------------+
|                |        |                |        |                |      |                |      |                |
|  JSON & DTO    |        |  API Layer     |        | Business Logic |      |  Persistence   |      |  Data          |
|                |        |                |        |                |      |  Logic         |      |                |
+----------------+        +----------------+        +----------------+      +----------------+      +----------------+
```
