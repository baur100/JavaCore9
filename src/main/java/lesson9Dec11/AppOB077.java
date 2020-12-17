package lesson9Dec11;
// 4 principles of OOP: encapsulation(getter/setter),inheritance,polymorphism,abstraction
//import lesson9.Person;
//import lesson9.Vehicle;

public class AppOB077 {
    public static void main(String[] args) {


        /*ENCAPSULATION:
 (WE DO NOT EXPOSE FIELDS FROM CLASS)
 (By using private instead public)
 as values are not exposed anymore, to work with values we need methods, that allow us to set and get values*/

     //PersonOB077 elen = new PersonOB077();
//        elen.name = "Elen";
      /* elen.setName("Elen");
        String xx = elen.getName();
        System.out.println(xx);

        elen.setLastName("Lee");
        String ll = elen.getLastName();
        System.out.println(ll);

        elen.setYear(2020);
        int yy = elen.getYear();
        System.out.println(yy);*/


        //CONSTRUCTOR - used for simplification
        //Constructor is a function. Constructor is public (in rare cases may be private). May be partial, may be empty

        PersonOB077 peter = new PersonOB077("Peter","Lee",1989);
        System.out.println(peter.getLastName());


       /*Vehicle vv = new Vehicle(); is default constructor. When parameters are not defined in the class,
       we can use default constructor
        */


        }

    }



            /*Person peter = new Person("Peter","Jonson",1990);
            System.out.println(peter.getLastName());




            Person david = new Person("David","Moore");
            david.setYear(1987);

        }
    }
}
*/