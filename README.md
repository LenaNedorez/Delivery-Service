# spring5-freelance-delivery-service
REST API project - freelance delivery service.

## Description
This project is a REST API service for managing orders for the delivery of goods. The service uses a modern technology stack, ensuring reliability, security and scalability. 

## Functionality
o Creating and managing orders:  
- Adding a new order with the delivery address, goods and contact information
- Updating the order status (in process, delivered, canceled) 
- Viewing the order history  
o Delivery management:  
- Assigning a courier to an order 
- Tracking the courier's location
- Updating the delivery status  
o Product management: 
- Adding/removing products from the catalog 
- Updating product information (name, description, price)

## Technologies
- [Spring Framework](https://spring.io/) 
- [OpenAPI](https://swagger.io/)
- [MapStruct](https://mapstruct.org/)
- [Auth0](https://auth0.com/)
- [PostgreSQL](https://www.postgresql.org/)


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
