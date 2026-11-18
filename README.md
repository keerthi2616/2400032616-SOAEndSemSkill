# Direct JWT Generation API

Small Spring Boot project: accepts JSON and returns a signed JWT.

## Requirements
- Java 17+
- Maven (or VS Code Java extensions)

## Run
Open this folder in VS Code, then run `JwtApplication.java`, or use terminal:
```bash
mvn spring-boot:run
```

Swagger UI:
http://localhost:8080/swagger-ui/index.html

## Test
POST `/api/jwt/generate` with:
```json
{
  "userId": 101,
  "username": "Keerthi",
  "role": "STUDENT"
}
```
The response is a JWT string with three dot-separated sections.

> The sample secret is for local learning only. Replace it with a securely generated secret for real deployments.
