package petstoreApiTests;

import helpers.TestObjectGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetstoreTests {
    private long petId;
    Pet petRequest;
    String baseUrl = "https://petstore.swagger.io/v2/";
    @BeforeMethod
    public void startUp(){

        petRequest = TestObjectGenerator.generateRandomPet();
        Response response =
                given()
                        .baseUri(baseUrl)
                        .basePath("pet")
                        .header("Content-Type","application/json")
                        .body(petRequest)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        petId = jsonPath.getLong("id");
        System.out.println(petId);
    }
    @AfterMethod
    public void tearDown(){
        given()
                .baseUri(baseUrl)
                .basePath("pet/"+petId)
                .when()
                .delete()
                .then()
                .extract()
                .response();

    }
    @Test
    public void getPetById(){
        Response response =
            given()
                .baseUri(baseUrl)
                .basePath("pet/"+petId)
            .when()
                .get()
            .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();
        Pet petResponse = jsonPath.getObject("$",Pet.class);
        Assert.assertEquals(petResponse.getName(),petRequest.getName());
        Assert.assertEquals(petResponse.getStatus(),petRequest.getStatus());
        Assert.assertEquals(petResponse.getCategory().getName(),petRequest.getCategory().getName());
    }
    @Test
    public void updatePet(){
        Pet updatedPet = TestObjectGenerator.generateRandomPet();
        updatedPet.setId(petId);
        Response response =
                given()
                        .baseUri(baseUrl)
                        .basePath("pet")
                        .header("Content-Type","application/json")
                        .body(updatedPet)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        Pet petResponse = jsonPath.getObject("$",Pet.class);
        Assert.assertEquals(petResponse.getName(),updatedPet.getName());
        Assert.assertEquals(petResponse.getStatus(),updatedPet.getStatus());
        Assert.assertEquals(petResponse.getCategory().getName(),updatedPet.getCategory().getName());
    }

}
