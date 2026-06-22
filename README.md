# Hyperlocal Marketplace Backend

## Overview

A full-stack marketplace backend built using Spring Boot where customers can discover local service providers, book services, leave reviews, and track bookings.

## Features

* User Registration & Login
* JWT Authentication
* Role-Based Authorization
* Customer, Provider, and Admin Roles
* Service Management
* Booking Management
* Booking Status Workflow (PENDING → ACCEPTED → COMPLETED)
* Reviews & Ratings
* Average Rating Calculation
* Search Services by Category
* Search Services by Price Range
* DTO Architecture
* Validation
* Global Exception Handling

## Tech Stack

* Java 21
* Spring Boot
* Spring Security
* JWT
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## API Endpoints

### Authentication

* POST /auth/login

### Users

* POST /users
* GET /users

### Services

* POST /services
* GET /services
* GET /services/category/{name}
* GET /services/price

### Bookings

* POST /bookings
* PUT /bookings/{id}/accept
* PUT /bookings/{id}/complete

### Reviews

* POST /reviews
* GET /reviews
* GET /reviews/service/{id}
* GET /reviews/service/{id}/rating

## Future Enhancements

* Angular Frontend
* Provider Dashboard
* Payment Integration
* Location-Based Search
* Notifications
