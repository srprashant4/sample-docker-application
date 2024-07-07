# Sample Spring Boot Application with PostgreSQL

This project is a sample Spring Boot application demonstrating how to connect to a PostgreSQL database and perform basic CRUD operations. The application includes a RESTful API to add entries to a sample table, showcasing the integration of Spring Data JPA for data persistence.

## Features

- Spring Boot framework
- PostgreSQL database integration
- RESTful API for CRUD operations
- Spring Data JPA for database interaction
- Lombok for reducing boilerplate code

## Prerequisites

- JDK 17
- Maven
- PostgreSQL

## Setup and Run

1. **Clone the repository**:
    ```sh
    git clone https://github.com/yourusername/sample-spring-boot-postgres.git
    cd sample-spring-boot-postgres
    ```

2. **Configure PostgreSQL**:
   Update the `src/main/resources/application.properties` file with your PostgreSQL credentials.

3. **Build the project**:
    ```sh
    mvn clean package
    ```

4. **Run the application**:
    ```sh
    mvn spring-boot:run
    ```

## Docker

To run the application using Docker, ensure you have Docker installed and follow these steps:

1. **Build the Docker image**:
    ```sh
    docker build -t sample-spring-boot-postgres .
    ```

2. **Run the Docker container**:
    ```sh
    docker run -p 8080:8080 sample-spring-boot-postgres
    ```

## Usage

Use the following endpoint to add an entry to the sample table:

- **POST** `/samples`
  - Request Body: `{"name": "sample name"}`

## License

This project is licensed under the MIT License.