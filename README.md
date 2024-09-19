# Delivery service
REST API project - freelance delivery service.

## Description
This project is a REST API service for managing orders for the delivery of goods. The service uses a modern technology stack, ensuring reliability, security and scalability. 

## Functionality
### Creating and managing orders:  
- Adding a new order with the delivery address, goods and contact information
- Updating the order status (in process, delivered, canceled) 
- Viewing the order history
### Delivery management:
- Assigning a courier to an order 
- Tracking the courier's location
- Updating the delivery status
### Product management:
- Adding/removing products from the catalog 
- Updating product information (name, description, price)

## Technologies
- Backend: Java
- Framework: Spring Framework
- Build system: Maven
- API specification: OpenAPI 
- DTO generation: MapStruct
- Authentication and authorization: Auth0
- Database: PostgreSQL
- API documentation: Swagger

## Installation
1. Clone the repository:
git clone <url of repository>
2. Install dependencies:
mvn clean install
3. Set up configuration:
- Copy the application.properties.example file to application.properties.
- Replace the default values ​​in the application.properties file with your own.
4. Run the application:
mvn spring-boot:run
## API documentation:
API documentation is available at: http://localhost:8080/api
