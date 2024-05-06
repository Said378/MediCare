# Medicare Spring Boot Application

## Overview

The Medicare Spring Boot Application is a web-based platform designed to facilitate medical consultations and check-ups. Built on the Spring Boot framework, this application enabling seamless communication and efficient healthcare services.

## Features

1. **User Authentication**: Secure user authentication system for patients and healthcare providers.
2. **Patient Dashboard**: A personalized dashboard for patients to schedule appointments, view medical history, and communicate with healthcare providers.
3. **Healthcare Provider Dashboard**: A dedicated dashboard for healthcare providers to manage appointments, access patient records, and provide consultations.
4. **Appointment Scheduling**: Patients can easily schedule appointments with their preferred healthcare providers based on availability.
5. **Medical History Management**: Comprehensive storage and management of patient medical records for easy access and reference.
6. **Real-time Communication**: Secure messaging system for patients and healthcare providers to communicate in real-time for consultations and follow-ups.
7. **Prescription Management**: Healthcare providers can generate and manage electronic prescriptions for patients directly through the platform.
8. **Notification System**: Automated notifications for appointment reminders, prescription refills, and other important updates.

## Technologies Used

- **Spring Boot**: Backend framework for building robust and scalable web applications.
- **Spring Security**: Authentication and authorization framework for securing the application.
- **PostgreSQL**: Object-relational database management system for storing application data.
- **Hibernate**: Object-relational mapping framework for simplifying database interactions.
- **WebSocket**: Protocol for real-time communication between clients and the server.


## Installation

1. Clone the repository from GitHub:

    - git clone https://github.com/Said378/MediCare.git
   
3. Navigate to the project directory:  
 
    - cd MediCare
   
5. Configure the database settings in application.properties:

   - spring.datasource.url=jdbc:postgresql://localhost:5432/medicare
   - spring.datasource.username=postgres
   - spring.datasource.password=password

6. Build and run the application using Maven:

   - mvn spring-boot:run

## Usage

1. **Patient Registration**: Patients can sign up for a new account using their email address and password.
2. **Healthcare Provider Registration**: Healthcare providers can register with their professional credentials and specialties.
3. **Schedule Appointment**: Patients can browse available healthcare providers and schedule appointments based on their availability.
4. **Consultation**: Patients and healthcare providers can communicate in real-time through the messaging system for consultations and follow-ups.
5. **Access Medical Records**: Healthcare providers can access and update patient medical records as needed for diagnosis and treatment.
6. **Prescription Management**: Healthcare providers can generate electronic prescriptions and manage prescription refills for patients.

## Contribution

Contributions to the Medicare Spring Boot Application are welcome! If you have any suggestions for improvement or would like to report a bug, please open an issue on GitHub or submit a pull request with your changes.
   

   
