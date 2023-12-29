package com.userCrud;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UserApiTest {

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "http://localhost:8080"; 
        RestAssured.port = 8080; 
    }

    @Test
    public void testGetAllUsers() {
        given()
            .when()
                .get("/users")
            .then()
                .statusCode(200)
                .body("$", hasSize(greaterThanOrEqualTo(1)))
                .body("[0].name", equalTo("Alam"));
    }
    
    
    @Test
    public void testGetUserById() {
        int userId = 352; // Specify the user ID you want to retrieve

        given()
            .pathParam("id", userId)
        .when()
            .get("/user/{id}")
        .then()
            .statusCode(200)
            .body("id", equalTo(userId))
            .body("name", equalTo("Alice"))
            .body("age", equalTo(25))
            .body("location", equalTo("City"))
            .body("skills", equalTo("Java"));
    }

    @Test
    public void testCreateUser() {
        String requestBody = "{\"name\": \"Alice\", \"age\": 25, \"location\": \"City\", \"skills\": \"Java\"}";

        given()
            .contentType(ContentType.JSON)
            .body(requestBody)
        .when()
            .post("/user")
        .then()
            .statusCode(201)
            .body("name", equalTo("Alice"))
            .body("age", equalTo(25));
    }

    @Test
    public void testDeleteUserById() {
       
        int userIdToDelete = 354;

        given()
            .pathParam("id", userIdToDelete)
        .when()
            .delete("/user/{id}")
        .then()
            .statusCode(204); 

        // Optionally, we can add assertions to ensure the user is actually deleted
        // For example, we can send a GET request for the same user ID and assert a 404 status
        given()
            .pathParam("id", userIdToDelete)
        .when()
            .get("/user/{id}")
        .then()
            .statusCode(404); // Assuming a user not found returns a 404 status
    }
    
    @Test
    public void testUpdateUserById() {
        // Assume there is a user with ID 456 that you want to update
        int userIdToUpdate = 202;

        // Request body with updated user data
        String updatedUserData = "{"
                + "\"name\": \"Kausher Alam\","
                + "\"age\": 25,"
                + "\"location\": \"Mumbai Maharastra\","
                + "\"skills\": \"Java, spring microservices, mysql\""
                + "}";

        given()
            .pathParam("id", userIdToUpdate)
            .contentType("application/json")
            .body(updatedUserData)
        .when()
            .put("/user/{id}")
        .then()
            .statusCode(200)
            .body("id", equalTo(userIdToUpdate))
            .body("name", equalTo("Kausher Alam"))
            .body("age", equalTo(25))
            .body("location", equalTo("Mumbai Maharastra"))
            .body("skills", equalTo("Java, spring microservices, mysql"));

        // Optionally, you can add assertions to ensure the user is actually updated
        // For example, send a GET request for the same user ID and assert the updated values
        given()
            .pathParam("id", userIdToUpdate)
        .when()
            .get("/user/{id}")
        .then()
            .statusCode(200)
            .body("id", equalTo(userIdToUpdate))
            .body("name", equalTo("Kausher Alam"))
            .body("age", equalTo(25))
            .body("location", equalTo("Mumbai Maharastra"))
            .body("skills", equalTo("Java, spring microservices, mysql"));
    }
}

