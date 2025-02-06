# Spring Boot CRUD Application with Security

## Overview
This project is a Spring Boot-based CRUD application with integrated Spring Security. It includes role-based access control (RBAC) for securing API endpoints.

## Features
- **JDBC Authentication**: Uses a database for user authentication instead of hardcoded credentials.
- **Role-Based Authorization**: Controls access to APIs based on user roles.
- **HTTP Basic Authentication**: Ensures secure access to API endpoints.
- **CSRF Protection Disabled**: Since the API is stateless, CSRF protection is disabled.

## Security Configuration
The application uses `SecurityConfig.java` to define security settings:

### User Authentication (JDBC)
- Retrieves users from a database using custom SQL queries.
- `members` table stores user credentials.
- `roles` table stores user roles.

### Role-Based Access Control
Access is controlled based on user roles:

- **EMPLOYEE**: Can read employee details.
- **MANAGER**: Can create and update employees.
- **ADMIN**: Can delete employees.

### HTTP Basic Authentication
Authentication is implemented using HTTP Basic authentication.

```java
http.httpBasic(Customizer.withDefaults());
```

### CSRF Configuration
CSRF protection is disabled as it is not required for stateless REST APIs.

```java
http.csrf(csrf -> csrf.disable());
```

## Running the Application
1. Ensure you have a database configured with `members` and `roles` tables.
2. Run the Spring Boot application.
3. Use an API client (e.g., Postman) to access the secured endpoints with appropriate credentials.

## Technologies Used
- Java
- Spring Boot
- Spring Security
- JDBC Authentication
- HTTP Basic Authentication

