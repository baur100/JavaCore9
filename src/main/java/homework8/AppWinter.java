package homework8;

public class AppWinter {
    public static void main(String[] args) {
        Winter northeastern = new Winter();
        northeastern.weather = "*** Freezing *** ";
        northeastern.temp = 20.5;
        northeastern.clothes = "hat";

        Winter snowEmergency = new Winter();
        snowEmergency.weather = "*** Snowing *** ";
        snowEmergency.clothes = "gloves and winter boots";
        snowEmergency.temp = 30.5;


        northeastern.dressWarm() ;
        northeastern.putOn();

        System.out.println("------------");

        snowEmergency.dressWarm();
        snowEmergency.putOn();
    }
}
