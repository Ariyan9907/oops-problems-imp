# Food Delivery System

## Overview

The Food Delivery System is a Java-based Object-Oriented Programming (OOP) project that simulates the core functionality of food delivery platforms like **Swiggy** and **Zomato**. The application demonstrates the practical implementation of major OOP concepts such as **Encapsulation, Inheritance, Polymorphism, Abstraction, Composition, Aggregation, Association, and Interfaces** in a real-world scenario.

The system allows customers to browse restaurants, place orders, make payments using multiple payment methods, receive notifications, and track order status until delivery.

---

## OOP Concepts Demonstrated

- Encapsulation
- Abstraction
- Inheritance
- Method Overriding
- Runtime Polymorphism
- Interfaces
- Composition
- Aggregation
- Association

---

## Features

### Customer Management
- Register customers
- Premium customer support
- Additional discounts for premium customers

### Restaurant Management
- Create restaurants
- Manage restaurant menus
- Display available food items

### Order Management
- Place food orders
- Multiple food items per order
- Calculate total order amount
- Track order details

### Payment System
Supports multiple payment methods:
- UPI
- Credit Card
- Wallet

Implemented using the **Strategy Design Pattern** through interfaces.

### Delivery Management
- Assign delivery partners
- Deliver customer orders

### Notification Service
- Order Confirmation Notification
- Delivery Notification

Implemented using runtime polymorphism.

### Order Tracking
Track the complete order lifecycle:

- Placed
- Confirmed
- Preparing
- Out For Delivery
- Delivered

---

## Technologies Used

- Java
- Object-Oriented Programming
- Collections Framework

---

## Project Structure

```
src/
│
├── customer/
│   ├── Customer.java
│   └── PremiumCustomer.java
│
├── restaurant/
│   ├── Restaurant.java
│   ├── Menu.java
│   └── FoodItem.java
│
├── order/
│   ├── Order.java
│   ├── OrderItem.java
│   └── OrderStatus.java
│
├── payment/
│   ├── Payment.java
│   ├── UPI.java
│   ├── CreditCard.java
│   └── Wallet.java
│
├── delivery/
│   └── DeliveryPartner.java
│
├── notification/
│   ├── Notification.java
│   ├── EmailNotification.java
│   └── SMSNotification.java
│
└── Main.java
```

---

## Class Relationships

| Relationship | Example |
|--------------|---------|
| Association | Customer ↔ Restaurant |
| Aggregation | Restaurant → Menu |
| Composition | Order → OrderItem |
| Inheritance | PremiumCustomer extends Customer |
| Interface | Payment, Notification |
| Polymorphism | UPI, Credit Card, Wallet implementations |
| Encapsulation | Private fields with getters/setters |

---

## Learning Outcomes

Through this project, you will learn:

- Designing a real-world system using OOP
- Applying all four pillars of Object-Oriented Programming
- Managing object relationships
- Implementing interfaces and runtime polymorphism
- Building modular and maintainable Java applications
- Writing clean and reusable code

---

## Future Enhancements

- JDBC Integration
- MySQL Database
- User Authentication
- Admin Dashboard
- Restaurant Dashboard
- Delivery Tracking using Location
- Online Payment Gateway Integration
- Spring Boot REST APIs
- JSP/Servlet Frontend
- Mobile Application Support

---

## Author

**Aryan Pujari**

Java Full Stack Developer

```
"Code is not just written to solve problems;
it is designed to be understood, maintained, and extended."
```