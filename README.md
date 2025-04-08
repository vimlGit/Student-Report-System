# Student Report Generation System 📊🎓

A secure and user-friendly web application built using Spring Boot MVC that enables educational institutions to generate, manage, and view student academic reports with ease. This system supports dynamic data handling, secure authentication, and a responsive interface for seamless experience.

---

## 🚀 Features

- 🔐 **User Authentication & Authorization** (Spring Security)
- 📋 **CRUD Operations** for Student Data
- 📊 **Generate & View Reports**
- 🔍 **Search & Filter** Students
- 🧾 **Show Reports** i
- 🎨 Responsive UI with Bootstrap
- ⚙️ Integrated with Oracle DB for persistent storage

---

## 🛠️ Tech Stack

### Backend
- **Java 17+**
- **Spring Boot**
- **Spring MVC**
- **Spring Security**
- **Spring Data JPA**
- **Oracle Database**

### Frontend
- **JSP**
- **HTML / CSS**
- **Bootstrap 5**
- **JavaScript**

### Tools
- **Maven**
- **Eclipse**
- **Apache Tomcat**
- **Git**

---

## 📂 Project Structure

ReportGenerationSystemBySpringBootMVC
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.nt/
│   │   │       ├── ReportGenetationSystemIGNTURCMBYSpringBootMVC.java
│   │   │       ├── config/
│   │   │       │   └── SecurityConfig.java
│   │   │       ├── controller/
│   │   │       │   └── StudentOperationsController.java
│   │   │       ├── entity/
│   │   │       │   ├── Student.java
│   │   │       │   └── Marksheet.java
│   │   │       ├── repository/
│   │   │       │   └── IStudentRepository.java
│   │   │       └── service/
│   │   │           ├── IStudentMgmtService.java
│   │   │           └── StudentMgmtServiceImpl.java
│   │
│   ├── resources/
│   │   ├── static/
│   │   ├── templates/
│   │   └── application.properties
│
├── test/
│   └── java/
│
├── pom.xml
├── README.md
└── HELP.md


---

## ⚙️ Setup Instructions

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/vimlGit/Student-Report-System.git
   cd StudentReportGen-SpringBoot
Create Oracle DB Table:

Create a schema and required tables as per the schema.sql or entities.

Configure application.properties:

# View  resolver cfg
spring.mvc.view.prefix=/WEB-INF/pages/
spring.mvc.view.suffix=.jsp

# Embedded Server port
server.port=4042

# ContextPath  while running the App in the Embedded server
server.servlet.context-path=/IGNTU-RCM_ReportGenerate

# Oracle jdbc driver details for  DataSource
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE
spring.datasource.username=c##BATCH37
spring.datasource.password=ORACLE

# JPA-Hibernate Properties
spring.jpa.database-platform=org.hibernate.dialect.OracleDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update

#  make the spring data jpa performing lazy loading through underlying  Hibernate framework
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true

🔒 Default Roles
Admin – Full access to manage reports and users.

User – Limited to viewing and downloading their own report.

📸 Screenshots+
![image](https://github.com/user-attachments/assets/e4f443eb-4caa-4d0f-8b40-cb52fe1809cd)
![image](https://github.com/user-attachments/assets/6038014a-6342-47ed-b992-812da7deeb14)
![image](https://github.com/user-attachments/assets/dcd8359d-86f1-4e74-81f1-af619b93aace)
![image](https://github.com/user-attachments/assets/ccc53221-63f8-4af6-8c85-4069883215a2)
![image](https://github.com/user-attachments/assets/736975b2-7d0f-47d5-a710-d9db4dfc5fd8)
![image](https://github.com/user-attachments/assets/7fe6360f-c8f7-4e85-909b-05a028852b63)


📃 License
This project is for academic and personal learning purposes. For commercial use, please contact the author.

👨‍💻 Author
Vimlesh Kumar Singh

GitHub Profile: https://github.com/vimlGit

Email: vimleshji92@gmail.com

🌟 Acknowledgments
Thanks to all the open-source libraries and Spring community for their extensive documentation and support.

yaml
Copy
Edit
