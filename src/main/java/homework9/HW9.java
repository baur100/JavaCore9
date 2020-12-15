package homework9;

public class HW9 {
    public static void main(String[] args) {
//        PersonI mary= new PersonI();
//        mary.setName("Mary");
//        mary.setLastName("Anderson");
//        mary.setYear(2014);
//
//        String a= mary.getName();
//        System.out.println(a);

        PersonI william = new PersonI("William", "Smith", 1967);
//        System.out.println(william.getLastName());
        william.printInfo();


        Movie film = new Movie();
        film.setTitle("Green Book");
        film.setGenre("Drama");
        film.setYear(2018);

        String b = film.getTitle();
//        System.out.println(b);

        Movie myMovie = new Movie("Home Alone", "Comedy", 1990);
//        System.out.println(myMovie.getGenre());
        myMovie.printClass();

        Vehicle myCar = new Vehicle();
        myCar.setBrand("Toyota");
        myCar.setModel("Sienna");
        myCar.setYear(2013);

        String c = myCar.getBrand();
//        System.out.println(c);


        Vehicle car = new Vehicle("Volvo", "XC90", 2016);
//           System.out.println(car.getBrand());
           car.printMe();

        House home= new House("Bloomingtom", "MN",2013) ;
             System.out.println(home.getCity());
             home.printInfo();

        House myHome = new House();
        myHome. setCity("Minnetonka");
        myHome.setState("MN");
        myHome.setYear(2011);

        String f= myHome.getState();
//        System.out.println(f);
    }

}

