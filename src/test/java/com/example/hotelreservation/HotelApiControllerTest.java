package com.example.hotelreservation;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

class HotelApiControllerTest {

    @Test
    void getHotels() {
        given().when()
                .get("http://localhost:8080/hotels")
                .then()
                .statusCode(200);
    }

    @Test
    void postHotel() throws JSONException {
        JSONObject jsonHotel = new JSONObject();
        jsonHotel.put("name", "Vancouver Hotel");
        jsonHotel.put("price", "70.5");
        jsonHotel.put("availability", "true");
        given()
                .contentType("application/json")
                .body(jsonHotel.toString())
        .when()
                .post("http://localhost:8080/hotels")
                .then()
                .statusCode(201)
                .body("id", notNullValue())
                .body("name", equalTo("Vancouver Hotel"))
                .body("price", equalTo(70.5F))
                .body("availability", equalTo(true));


    }
}