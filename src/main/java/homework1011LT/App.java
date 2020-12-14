package homework1011LT;

public class App {
    public static void main(String[] args) {
        Engineer john = new Engineer("John", "Smith", 45, "male", 123465789, "Mechanical", 15);
        john.printInfo();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++=");

        Soldier mary = new Soldier("Mary", "Taylor", 35, "female", 4657189, "Major", "O-6");
        mary.printInfo();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++=");


        Doctor steve = new Doctor("Steve", "Carter", 44, "male", 20980387, "Internal Medicine", "Medical Fellowship");
        steve.printInfo();



    }


}
