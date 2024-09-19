# spring5-freelance-delivery-service
REST API project - freelance delivery service.

## Description
This project is a REST API service for managing orders for the delivery of goods. The service uses a modern technology stack, ensuring reliability, security and scalability. 

## Functionality
• Creating and managing orders: 
o Adding a new order with the delivery address, goods and contact information. 
o Updating the order status (in process, delivered, canceled). 
o Viewing the order history. 
• Delivery management: 
o Assigning a courier to an order. 
o Tracking the courier's location. 
o Updating the delivery status. 
• Product management: 
o Adding/removing products from the catalog. 
o Updating product information (name, description, price).

## Technologies
- [Spring Framework](https://spring.io/) 
- [OpenAPI](https://swagger.io/)
- [MapStruct](https://mapstruct.org/)
- [Auth0](https://auth0.com/)
- [PostgreSQL](https://www.postgresql.org/)


## Getting Started

Freelance delivery API is a Spring Boot application built using Maven. You can build a jar file and run it from the command line (JDK 11 is required):

```bash
git clone https://github.com/uniloftsky/spring5-freelance-delivery-service
cd spring5-freelance-delivery-service
./mvnw package
java -jar target/*.jar
```

You can then access api documentation here: [http://localhost:8080/api](http://localhost:8080/api)
