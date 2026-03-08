# 📦 My Java WebApp – Contact Form

A simple Java web application built with **Servlets + JSP** and packaged as a `.war` file.  
This app demonstrates form handling, validation, and dynamic rendering of user input. It’s designed to integrate seamlessly with **Jenkins CI/CD pipelines** and deploy on **Apache Tomcat**.

---

## ✨ Features
- 📝 Contact form with **Name, Email, Message** fields  
- ✅ Basic validation (all fields required)  
- 📄 Displays submitted data on a success page  
- ⚙️ Packaged as a `.war` using **Maven**  
- 🔄 Ready for **Jenkins automation**: build, test, and deploy to Tomcat  

---

## 📂 Project Structure
my-java-webapp/ ├── Jenkinsfile ├── pom.xml ├── src │   └── main │       ├── java │       │   └── com/example/ContactServlet.java │       └── webapp │           ├── index.jsp │           └── success.jsp


---

## 🛠 Prerequisites
- ☕ Java 11+  
- 🛠 Apache Maven 3.6+  
- 🐱 Apache Tomcat 9/10  
- 🔧 (Optional) Jenkins for CI/CD automation  

---

## ⚙️ Build Instructions
Clone the repository and build the `.war` file:



my-java-webapp/ ├── Jenkinsfile ├── pom.xml ├── src │   └── main │       ├── java │       │   └── com/example/ContactServlet.java │       └── webapp │           ├── index.jsp │           └── success.jsp

git clone https://github.com/HarshavardhanBhosale/email-fill-withtomcat.git cd my-java-webapp mvn clean package


📦 The `.war` file will be generated in:
target/my-java-webapp.war


---

## 🚀 Deployment on Tomcat
1. 📂 Copy the `.war` file to Tomcat’s `webapps` folder:
2. ▶️ Start Tomcat:
3. 🌐 Access the app: http://localhost:8080/my-java-webapp/


---

## 🔧 Jenkins Pipeline
This project includes a `Jenkinsfile` with stages:
- 📥 **Checkout** → Pull code from GitHub  
- 🏗 **Build** → Run `mvn clean package`  
- 🧪 **Test** → Execute unit tests  
- 🚀 **Deploy** → Copy `.war` to Tomcat server  

---

## 📈 Next Steps
- 🗄 Add database integration (e.g., MySQL) to persist submissions  
- 🐳 Containerize with Docker (Tomcat + DB) for reproducible deployments  
- 🌍 Extend pipeline with staging/production environments  

---

## 📜 License
This project is licensed under the **MIT License** — feel free to use and adapt.

