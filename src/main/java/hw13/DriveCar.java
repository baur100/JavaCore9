package hw13;

public class DriveCar implements UsaDriverLicense {
    private int age  = 16;
    private String car = "You have a car";


    @Override
    public void usaDriverLicence() {
        System.out.println("your age is "  + age +" and " + car);
    }
}

