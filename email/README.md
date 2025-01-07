# Email MicroServices

This project is a Spring Boot-based email microservice that uses RabbitMQ for message queuing and PostgreSQL for data storage.

## Technologies Used

- Java
- Spring Boot
- RabbitMQ
- PostgreSQL
- Maven

## Setup

1. Ensure you have Java, Maven, RabbitMQ, and PostgreSQL installed on your system.
2. Clone this repository.
3. Configure your RabbitMQ and PostgreSQL connection details in the application properties file.

## Building the Project

To build the project, run the following command in the project root directory:

```
mvn clean install
```

## Running the Application

To run the application, use the following command:

```
java -jar target/email-0.0.1-SNAPSHOT.jar
```

Replace `0.0.1-SNAPSHOT` with the actual version of your built JAR file.

## Usage

This microservice listens for email messages on a RabbitMQ queue and processes them. The queue name is configured in the application properties file.

For more detailed information about the API and its usage, please refer to the source code and comments in the repository.