package lesson9;

public class App {
    public static void main(String[] args) {
        Person elen = new Person();
//        elen.name = "Elen";
        elen.setName("Elen");
        elen.setLastName("Lee");
        elen.setYear(2020);

        String xx = elen.getName();
        System.out.println(xx);
        Person peter = new Person("Peter","Jonson",1990);
        System.out.println(peter.getLastName());

        Vehicle vv = new Vehicle();


        Person david = new Person("David","Moore");
        david.setYear(1987);

    }
}
