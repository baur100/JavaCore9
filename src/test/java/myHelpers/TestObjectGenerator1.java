package myHelpers;

import com.github.javafaker.Faker;
import enums.Status;
import modelsHW.CategoryHW;
import modelsHW.PetHW;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestObjectGenerator1 {
    public static String randomString(int lenght){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(lenght, useLetters, useNumbers);

    }
    public static PetHW generateRandomePet(){
        Faker faker = new Faker();
        Random random = new Random();
        String[]photoUrls = {faker.internet().image(),faker.internet().image()};
        PetHW pet = new PetHW(faker.cat().name(),photoUrls);
        pet.setStatus(Status.pending);
        CategoryHW category = new CategoryHW(faker.cat().breed(), random.nextLong());
        pet.setCategoryHW(category);
        return pet;


    }
    
}
