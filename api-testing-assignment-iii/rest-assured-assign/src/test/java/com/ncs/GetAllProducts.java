package com.ncs;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetAllProducts {

    @Test
    public void getAllProducts(){
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://dummyjson.com";
        Response response = given()
                                .header("Content-Type","application/json")
                            .when()
                                .get("/products")
                            .then()
                                .statusCode(200)
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
