# Contact Management Project
# Contacts Management Application

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
  - [Backend Setup](#backend-setup)
  - [Database Setup](#database-setup)
  - [Frontend Setup](#frontend-setup)
- [API Documentation](#api-documentation)
- [How to Run](#how-to-run)
- [Design Choices](#design-choices)

## Overview

This Contacts Management Application allows users to manage their contact information through CRUD operations, handle duplicate contacts via merging, and ensures robust data validation. The backend is implemented in pure Java and MySQL, while the frontend is built using React for a modern user interface.

## Features

### Backend

1. **CRUD Operations**
   - Add, View, Update, and Delete contacts.
2. **Contact Merging**
   - Merge duplicate contacts based on email or phone number.
3. **Validations**
   - Ensure valid and unique email and phone numbers.
   - Validate names to contain only alphabetic characters.
4. **Authentication**
   - Basic placeholder authentication functionality.

### Frontend

1. **CRUD Operations UI**
   - Interfaces for adding, viewing, editing, and deleting contacts.
2. **Contact Merging Interface**
   - UI for identifying and merging duplicate contacts.
3. **Validation Feedback**
   - User-friendly error messages for validation errors.
4. **Responsive Design**
   - Optimized for both desktop and mobile devices.

## Technologies Used

- **Backend Programming Language:** Java
- **Database:** MySQL
- **Frontend Framework:** React
- **Build Tool:** None (pure Java backend)

## Setup Instructions

### Backend Setup

1. Clone the repository:

   ```bash
   git clone <repository-url>
   cd contacts-management-backend
   ```

2. Compile the Java code:

   ```bash
   javac -d build src/*.java src/*/*.java
   ```

3. Run the application:

   ```bash
   java -cp build AppServer
   ```

### Database Setup

1. Install MySQL and set up a database.
2. Use the following commands to create the database and table:
   ```sql
   CREATE DATABASE contacts_db;
   USE contacts_db;

   CREATE TABLE contacts (
       id INT AUTO_INCREMENT PRIMARY KEY,
       first_name VARCHAR(50) NOT NULL,
       last_name VARCHAR(50) NOT NULL,
       email VARCHAR(100) UNIQUE NOT NULL,
       phone VARCHAR(15) UNIQUE NOT NULL,
       address VARCHAR(255)
   );
   ```
3. Update the database credentials in the `AppServer.java` file:
   ```java
   private static final String DB_URL = "jdbc:mysql://localhost:3306/contacts_db";
   private static final String USER = "your_username";
   private static final String PASSWORD = "your_password";
   ```

### Frontend Setup

1. Navigate to the `frontend` directory:

   ```bash
   cd contacts-management-ui
   ```

2. Install the required dependencies:

   ```bash
   npm install
   ```

3. Start the development server:

   ```bash
   npm start
   ```

   The application will be available at `http://localhost:3000`.

## API Documentation

This implementation includes the following methods and functionalities:

### Methods

- **`getAllContacts()`**
  - Retrieves all contacts.
- **`getContactById(int id)`**
  - Retrieves a contact by ID.
- **`addContact(Contact contact)`**
  - Adds a new contact.
- **`updateContact(int id, Contact updatedContact)`**
  - Updates a contact by ID.
- **`deleteContact(int id)`**
  - Deletes a contact by ID.
- **`authenticate(String username, String password)`**
  - Validates login credentials (placeholder logic).

## How to Run

1. Ensure MySQL is running and the database is properly set up.
2. Start the backend server:

   
   cd contacts-management-backend
   javac -d build src/*.java src/*/*.java
   java -cp build AppServer
   

3. Start the frontend application:

   
   cd contacts-management-ui
   npm start
   

   Access the application at `http://localhost:3000`.

## Design Choices

- **Pure Java for Backend:** The backend uses a lightweight, framework-free approach to enhance simplicity and educational value.
- **MySQL Database:** Chosen for its reliability and compatibility with Java.
- **React Frontend:** Offers a dynamic and interactive user experience.
- **Validation:** Ensures robustness by preventing invalid or duplicate data.

---

For issues or contributions, feel free to raise a pull request or contact the repository maintainer.

