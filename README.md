# Spring Boot CRUD Application with Spring Data REST

## Overview
This project demonstrates a Spring Boot CRUD application using **Spring Data REST**, eliminating the need for explicit controller and service layers. The application automatically exposes RESTful endpoints for managing employees.

## Key Features
- **Spring Data REST**: Simplifies API development by exposing repository-based REST endpoints.
- **Auto-Generated Endpoints**: Eliminates the need for `EmployeeRestController`, `EmployeeService`, and `EmployeeServiceImpl`.
- **Custom Repository Path (Optional)**: The repository path can be customized using `@RepositoryRestResource`.

## Configuration

### **POM Dependency**
To enable Spring Data REST, add the following dependency in `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-rest</artifactId>
</dependency>
```

### **Employee Repository**
Spring Data REST automatically generates endpoints based on the `JpaRepository` interface.

#### **Optional Customization**
- By default, the endpoint is available at `/employees`.
- Uncomment `@RepositoryRestResource(path="members")` to expose it under `/members` instead.

## Available Endpoints
Once the application is running, the following REST endpoints are available:

| HTTP Method | Endpoint          | Description           |
|------------|------------------|----------------------|
| GET        | `/employees`       | Retrieve all employees |
| GET        | `/employees/{id}`  | Retrieve an employee by ID |
| POST       | `/employees`       | Add a new employee |
| PUT        | `/employees/{id}`  | Update an existing employee |
| DELETE     | `/employees/{id}`  | Delete an employee |

## Running the Application
1. Ensure the database is configured with an `Employee` entity.
2. Run the Spring Boot application.
3. Access the API endpoints directly without writing a controller.

## Notes
- Spring Data REST automatically handles JSON conversion and HATEOAS links.
- You can use Postman or any API client to test the endpoints.
- For advanced customization, refer to Spring Data REST documentation.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Spring Data REST

