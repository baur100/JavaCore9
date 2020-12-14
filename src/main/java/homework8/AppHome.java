package homework8;


public class AppHome{
    public static void main(String[] args) {

        Home myHouse = new Home();
        myHouse.streetNumber = 64;
        myHouse.streetName = "Main";
        myHouse.aptNumber = 45;

        Home dadHouse = new Home();
        dadHouse.streetName = "Wyoming ave";
        dadHouse.streetNumber = 121;
        dadHouse.aptNumber = 1;

//        printHome(streetName);
//        printHome(streetNumber);
//        printHome(aptNumber);
    }

            public static void printHome(Home home){
    System.out.println("Steer number = "+home.streetNumber +
            "\nStreet name = "+home.streetName +
            "\nApt = "+home.aptNumber );



    }
}
