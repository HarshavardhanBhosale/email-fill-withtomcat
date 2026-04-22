FROM maven:3.9.9-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package 
FROM payara/server-full:latest
COPY --from=builder /app/target/*.war /opt/payara/deployments/
EXPOSE 8080
EXPOSE 4848