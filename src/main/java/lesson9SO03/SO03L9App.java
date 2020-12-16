package lesson9SO03;

public class SO03L9App {
    public static void main(String[] args) {
//        SO03L9Person elen = new SO03L9Person();
//       elen.name = "Elen";
//        elen.setName("Elen");
//        elen.setLastName("Lee");
//        elen.setYear(2020);
//
//        String xx = elen.getName();
//        System.out.println(xx);

        SO03L9Person peter = new SO03L9Person("Peter", "Jonson", 1990);
        System.out.println(peter.getLastName());

        SO03L9Vehicle vv = new SO03L9Vehicle();


        SO03L9Person david = new SO03L9Person("David","Moore");
        david.setYear(1987);


    }
}
