🎓 Student Management System
A complete web-based Student Management System built with Spring Boot backend and JSP frontend. This enterprise application provides full CRUD operations for managing student records with a traditional MVC architecture.

🛠️ Technology Stack
Backend
Java 17
Spring Boot 3.x
Spring MVC
Spring Data JPA
Hibernate ORM
MySQL Database
Maven

Frontend
JSP (Java Server Pages)
JSTL Tags
HTML5 & CSS3
Bootstrap 5
JavaScript
AJAX

Server
Apache Tomcat 10.x
Spring Boot Embedded Tomcat

📁 Project Structure
StudentManagementSystem/
├── src/main/java/
│   └── com/example/
│       ├── controller/     
│       │   ├── StudentController.java
│       ├── model/          
│       │   └── Student.java
│       ├── repository/     
│       │   └── StudentRepository.java
│       └── service/         
│           └── StudentService.java
│              
│
├── src/main/resources/
│   ├── templates/           
│   │   ├── index.jsp
│   │   ├── student-list.jsp
│   │   ├── student-form.jsp
│   ├── static/              
│   ├── application.properties
│   └── data.sql
│
├── pom.xml
└── README.md


🎯 Key Features
Student Management
✅ Add new students with validation
✅ View all students with pagination
✅ Update student information
✅ Delete student records

User Interface
🎨 Responsive JSP pages with Bootstrap
📱 Mobile-friendly design
⚡ Fast page loading
🔄 Form validation with JavaScript

🔧 Installation & Setup
Prerequisites
Java 17+
Maven 3.6+
MySQL 8.0+
IDE (Eclipse/IntelliJ)
Steps to Run
Clone the repository

bash
git clone https://github.com/amanullah435islam/StudentManagementSystem.git
Database Setup

sql
CREATE DATABASE student_management;
Configure application.properties

properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
server.port=8080
Build and Run

bash
mvn clean install
mvn spring-boot:run
Access Application

http://localhost:8080
📊 Application Flow
MVC Architecture :
Browser Request → Spring Controller → Service Layer → Repository → Database
      ↑                                              ↓
JSP View ← Model Data ← Spring Controller ← Service Layer

Key JSP Pages :
index.jsp - Homepage with navigation
student-list.jsp - Display all students
student-form.jsp - Add/Edit student form

🚀 API Endpoints
GET	/students	List all students	student-list.jsp
GET	/students/new	Show add student form	student-form.jsp
POST	/students	Create new student	Redirect to /students
GET	/students/edit/{id}	Show edit student form	student-form.jsp
POST	/students	Update student (same as create)	Redirect to /students
GET	/students/delete/{id}	Delete student	Redirect to /students

🎨 UI Features
Responsive Design - Works on all devices
Bootstrap Styling - Modern UI components
Form Validation - Client-side and server-side
Navigation Menu - Easy page navigation
Data Tables - Organized student listing

👨‍💻 Developer
Md. Amanullah Islam
Full Stack Java Developer
📧 aman435islam@gmail.com
🔗 GitHub: https://github.com/amanullah435islam  
🔗 LinkedIn: www.linkedin.com/in/md-amanullah-islam-634424377
