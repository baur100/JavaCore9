package models;

import org.testng.annotations.AfterMethod;

public class CreatePlaylistRequest {
    private String name;
    private String[]rules;

    public CreatePlaylistRequest(String name) {
        this.name = name;
    }
}

