# Mart — Full Stack E-Commerce App

A resume-ready upgrade of the original Java console e-commerce project into a web application.

## Stack
- Frontend: React + Vite + Axios
- Backend: Java 17 + Spring Boot + Spring Data JPA
- Database: H2 for zero-setup local demo; MySQL profile included for production-style setup

## Features
- Product catalog with seeded products
- Search and category filtering
- Add to cart / quantity controls
- Persistent cart using localStorage
- Checkout flow
- REST API for product CRUD
- Responsive modern UI



## MySQL
Use the `mysql` Spring profile after creating/configuring MySQL:
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=mysql
```
Update `backend/src/main/resources/application-mysql.properties` with your MySQL password.

## API
- `GET /api/products`
- `GET /api/products/{id}`
- `POST /api/products`
- `PUT /api/products/{id}`
- `DELETE /api/products/{id}`

## Next upgrades
Authentication/JWT, real order persistence, admin dashboard, payment gateway, inventory management, image upload, tests, Docker and deployment.
