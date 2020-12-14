package homework9;

public class HW9 {
    public static void main(String[] args){
//        PersonI mary= new PersonI();
//        mary.setName("Mary");
//        mary.setLastName("Anderson");
//        mary.setYear(2014);
//
//        String a= mary.getName();
//        System.out.println(a);

        PersonI william = new PersonI("William","Smith", 1967);
//        System.out.println(william.getLastName());
        william.printInfo();


        Movie film = new Movie();
        film.setTitle ("Green Book");
        film.setGenre("Drama");
        film.setYear(2018);

        String b= film.getTitle();
        System.out.println(b);

        Movie myMovie = new Movie ("Home Alone", "Comedy" ,1990);
        System.out.println(myMovie.getGenre());
        myMovie.printClass();









    }
}
