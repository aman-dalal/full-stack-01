# Electrical Appliance Tracking & Maintenance System

This repository demonstrates a minimal full-stack example using **SQL**, **Spring Boot**, and **React**.

## Directories

- `sql/schema.sql` – Database schema defining all entities.
- `backend/` – Spring Boot project with JPA entities and basic REST controllers.
- `frontend/` – Simple React app that lists assets from the backend API.

## Running the Backend

The backend is a Maven project. Ensure you have a local MySQL instance and update `application.properties` with the correct credentials.

```bash
cd backend
mvn spring-boot:run
```

## Running the Frontend

```bash
cd frontend
npm install
npm start
```

The React app expects the backend to be running on the same host and port.
