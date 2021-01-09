package floreslesson9;

public class App {
    public static void main(String[] args) {
        Person elen = new Person();
        elen.setName("Elen");
        elen.setLastName("Lee");
        elen.setYear(2020);

        String xx = elen.getName();
        System.out.println(xx);
        Person peter = new Person("Peter", "Jonson", 1990);
        System.out.println(peter.getLastName());

//        Vehicle test9 = new Vehicle();
//        test9.setYear(2019);
//        System.out.println(test9.getYear());

        Vehicle vv = new Vehicle();

        Person david = new Person("David", "Moore");
        david.setYear(1987);
        System.out.println(david.getName() + " " + david.getLastName() + " " + david.getYear());

    }
}
