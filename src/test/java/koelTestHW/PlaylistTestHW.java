package koelTestHW;


import com.github.javafaker.Faker;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistResponse;
import models.RenamePlaylistRequest;
import modelsHW.CreatePlaylistRequestHW;
import modelsHW.CreatePlaylistResponseHW;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlaylistTestHW {
    private Faker faker;
    private int playlistId;
    private String playlistName;
    private String token;
    @BeforeClass
    private void runOnce(){
       token = Token.get();

    }
    @BeforeMethod
    public void startUp(){
         faker = new Faker();
         String token = Token.get();
         playlistName = faker.artist().name();
        CreatePlaylistRequestHW createPlaylistRequest = new CreatePlaylistRequestHW(playlistName);
        Response response =
                given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist")
                .header("Content-Type","application/json")
                .header("Accept","application/json")
                .header("Authorization",token)
                .body(createPlaylistRequest)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponseHW createPlaylistResponse = jsonPath.getObject("$", CreatePlaylistResponseHW.class);
        playlistId  = createPlaylistResponse.getId();
        Assert.assertEquals(playlistName, createPlaylistResponse.getName());
        System.out.println(playlistId);

    }
    @Test
    public void getPlaylist(){
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist")
                        .header("Content-Type","application/json")
                        .header("Accept","application/json")
                        .header("Authorization",token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();

        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponseHW[] createPlaylists = jsonPath.getObject("$", CreatePlaylistResponseHW[].class);
        boolean found = false;
        for(CreatePlaylistResponseHW playlist : createPlaylists){
            if(playlist.getId()==playlistId){
                Assert.assertEquals(playlist.getName(),playlistName);
                found=true;
                break;

            }
        }
        Assert.assertTrue(found);
    }
    @Test
    public void renamePlaylist(){
        String updatedName = faker.funnyName().name();
        RenamePlaylistRequest renamePlaylistRequest = new RenamePlaylistRequest(updatedName);
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist/"+playlistId)
                        .header("Content-Type","application/json")
                        .header("Accept", "application/json")
                        .header("Authorization",token)
                        .body(renamePlaylistRequest)
                        .when()
                        .patch()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse createPlaylistResponse = jsonPath.getObject("$",CreatePlaylistResponse.class);
        Assert.assertEquals(createPlaylistResponse.getName(),updatedName);

    }
}
