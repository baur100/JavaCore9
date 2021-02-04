package petstoreApiTests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetstoreTests {
    @Test
    public void getPetById(){
        String baseUrl = "https://petstore.swagger.io/v2/";
        Response response =
            given()
                .baseUri(baseUrl)
                .basePath("pet/100")
            .when()
                .get()
            .then()
                .statusCode(200)
                .extract()
                .response();
//        String responseStr = response.asPrettyString();
//        System.out.println(responseStr);
        JsonPath jsonPath = response.jsonPath();
        Pet petResponse = jsonPath.getObject("$",Pet.class);
        Assert.assertEquals(petResponse.getName(),"My Doggie");


    }
}
