package apiPetstore;

import helpers.TestDataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Pet;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStore {
    private Pet pet;
    private long petId;
    @BeforeMethod
    public void startUp(){
        pet = TestDataGenerator.generateRandomPet();
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .header("Content-Type","application/json")
                        .body(pet)
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
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                        .when()
                        .delete();
                        // we don't have to use then and statusCode in delete call, instead use Get and check for 404
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                        .when()
                        .get()
                        .then()
                        .statusCode(404);
    }

    @Test
    public void getPetById_petReturned() {
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath jsonPath = response.jsonPath();
//        1st way ->
        Pet responsePet = jsonPath.getObject("$", Pet.class);
//        System.out.println(responsePet.getName());

//        2nd way ->
//        Category responseCategory = jsonPath.getObject("category", Category.class);
//        System.out.println(responseCategory.getName());

//        3 way ->
        System.out.println(responsePet.getCategory().getName());

        Assert.assertEquals(responsePet.getName(), pet.getName());
        Assert.assertEquals(responsePet.getCategory().getId(),pet.getCategory().getId());
        Assert.assertEquals(responsePet.getCategory().getName(),pet.getCategory().getName());
        System.out.println(responsePet.getName());
    }
    @Test
    public void updateExistingPet(){
        Pet updatedPet = TestDataGenerator.generateRandomPet();
        updatedPet.setId(petId);
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .header("Content-Type","application/json")
                        .body(updatedPet)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath jsonPath = response.jsonPath();

        Pet responsePet = jsonPath.getObject("$", Pet.class);
        Assert.assertEquals(responsePet.getName(), updatedPet.getName());
        Assert.assertEquals(responsePet.getCategory().getId(), updatedPet.getCategory().getId());
        Assert.assertEquals(responsePet.getCategory().getName(), updatedPet.getCategory().getName());
    }
}
