package petstoreAPITest;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import modelsHW.PetHW;
import myHelpers.TestObjectGenerator1;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetstoreTest {
    private long petId;
    PetHW petRequest;
    String baseUrl = "https://petstore.swagger.io/v2/";

    @BeforeMethod
    public void startUp(){

        petRequest = TestObjectGenerator1.generateRandomePet();
        Response response = given()
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
        petId  = jsonPath.getLong("id");
        System.out.println(petId);

    }
    @AfterMethod
    public void tearDown(){
        given()
                .baseUri(baseUrl)
                .basePath("pet/"+petId)
                .delete();

    }
    @Test
    public void getPetById() {
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
        PetHW petResponse = jsonPath.getObject("$",PetHW.class);
        Assert.assertEquals(petResponse.getName(),petRequest.getName());
        Assert.assertEquals(petResponse.getStatus(), petRequest.getStatus());
        Assert.assertEquals(petResponse.getCategoryHW().getName(), petRequest.getCategoryHW().getName());
    }
    @Test
    public  void updatePet(){
        PetHW updatedPet = TestObjectGenerator1.generateRandomePet();
        updatedPet.setId(petId);
        Response response = given()
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
        PetHW petResponse = jsonPath.getObject("$",PetHW.class);
        Assert.assertEquals(petResponse.getName(),updatedPet.getName());
        Assert.assertEquals(petResponse.getStatus(), updatedPet.getStatus());
        Assert.assertEquals(petResponse.getCategoryHW().getName(), updatedPet.getCategoryHW().getName());

    }

}



