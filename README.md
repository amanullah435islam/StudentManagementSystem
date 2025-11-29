# 🎓 Student Management System

A complete web-based Student Management System built with **Spring Boot** backend and **JSP** frontend. This enterprise application provides full CRUD operations for managing student records with a traditional MVC architecture.

## 🛠️ Technology Stack

### **Backend**
![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=flat-square)
![Spring MVC](https://img.shields.io/badge/Spring_MVC-3.x-brightgreen?style=flat-square)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-3.x-blue?style=flat-square)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-lightgrey?style=flat-square)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-3.6+-red?style=flat-square)

### **Frontend**
![JSP](https://img.shields.io/badge/JSP-Java_Server_Pages-yellow?style=flat-square)
![JSTL](https://img.shields.io/badge/JSTL-Tags-yellowgreen?style=flat-square)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5-purple?style=flat-square)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat-square)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat-square)
![JavaScript](https://img.shields.io/badge/JavaScript-ES6+-yellow?style=flat-square)

### **Server**
![Tomcat](https://img.shields.io/badge/Apache_Tomcat-10.x-orange?style=flat-square)
![Spring Boot Embedded](https://img.shields.io/badge/Spring_Boot_Embedded-Tomcat-green?style=flat-square)





<div>
## 📁 Project Structure
StudentManagementSystem/
├── src/main/java/
│ └── com/example/
│ ├── controller/
│ │ ├── StudentController.java
│ ├── model/
│ │ └── Student.java
│ ├── repository/
│ │ └── StudentRepository.java
│ └── service/
│ └── StudentService.java
├── src/main/resources/
│ ├── templates/
│ │ ├── index.jsp
│ │ ├── student-list.jsp
│ │ ├── student-form.jsp
│ ├── static/
│ ├── application.properties
│ └── data.sql
├── pom.xml
└── README.md
</div>





<div> 
## 🎯 Key Features

### **Student Management**
- ✅ Add new students with validation
- ✅ View all students with pagination
- ✅ Update student information  
- ✅ Delete student records
 </div>





<div>
### **User Interface**
- 🎨 Responsive JSP pages with Bootstrap
- 📱 Mobile-friendly design
- ⚡ Fast page loading
- 🔄 Form validation with JavaScript
</div>





<div>
## 🔧 Installation & Setup

### **Prerequisites**
- Java 17+
- Maven 3.6+
- MySQL 8.0+
- IDE (Eclipse/IntelliJ)

### **Steps to Run**
</div>





<div>
1. **Clone the repository**
   ```bash
   git clone https://github.com/amanullah435islam/StudentManagementSystem.git
Database Setup

sql
CREATE DATABASE student_management;
Configure application.properties
</div>





<div>
properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
server.port=8080
Build and Run
</div>





<div>
bash
mvn clean install
mvn spring-boot:run
Access Application

http://localhost:8080
</div>





<div>
📊 Application Flow
MVC Architecture
Browser Request → Spring Controller → Service Layer → Repository → Database
      ↑                                              ↓
JSP View ← Model Data ← Spring Controller ← Service Layer
</div>





<div>
Key JSP Pages
index.jsp - Homepage with navigation
student-list.jsp - Display all students
student-form.jsp - Add/Edit student form
</div>





<div>
🚀 API Endpoints
Method	Endpoint	Description	View
GET	/students	List all students	student-list.jsp
GET	/students/new	Show add form	student-form.jsp
POST	/students	Create student	Redirect to list
GET	/students/edit/{id}	Show edit form	student-form.jsp
POST	/students	Update student	Redirect to list
GET	/students/delete/{id}	Delete student	Redirect to list
</div>





<div>
🎨 UI Features
Responsive Design - Works on all devices
Bootstrap Styling - Modern UI components
Form Validation - Client-side and server-side
Navigation Menu - Easy page navigation
Data Tables - Organized student listing
</div>





<div>
👨‍💻 Developer
Md. Amanullah Islam
Full Stack Java Developer
📧 Email: aman435islam@gmail.com
🔗 GitHub: amanullah435islam
🔗 LinkedIn: Md. Amanullah Islam
</div>





<div align="center">
⭐ Star this repository if you find it helpful!
</div> ```
