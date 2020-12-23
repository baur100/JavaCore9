package hw13;

public class DriveBoat implements UsaDriverLicense  {
    private int age = 21;
    private String swim = "know to swim";

    @Override
    public void usaDriverLicence() {
        System.out.println("Your age is  " + age +" and  you " +swim);
    }
}
