package helpers;

import com.github.javafaker.Faker;
import models.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestDataGenerator {
    public static String getString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public static Pet generateRandomPet(){
        Faker faker = new Faker();
        Random random = new Random();

        String name = faker.cat().name();
        Category category = new Category(random.nextInt(), faker.cat().breed());
        String[] photoUrls= {faker.internet().image()};
        Tag tag = new Tag(random.nextInt(), faker.animal().name());
        Tag[] tags = {tag};

        return new Pet(name, category, photoUrls, tags, Status.pending);
    }
    public static User generateRandomUser(){
        Faker faker = new Faker();
        Random random = new Random();

        String username = faker.cat().name()+198;
        String firstName = faker.name().name();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String password = "12345";
        int phone = 1112223344;
        int userStatus =0;

        return new User(username, firstName, lastName, email, password, phone, userStatus);
    }

}
