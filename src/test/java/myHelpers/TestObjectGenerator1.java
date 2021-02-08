package myHelpers;

import org.apache.commons.lang3.RandomStringUtils;

public class TestObjectGenerator1 {
    public static String randomString(int lenght){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(lenght, useLetters, useNumbers);

    }
    
}
