package homework9;

public class App {
    public static void main(String[] args) {
//        Person ivan = new Person();

//        ivan.setName("Ivan");
//        String xx = ivan.getName();
//        System.out.println(xx);
//
//        ivan.setLastName("Smith");
//        String yy = ivan.getLastName();
//        System.out.println(yy);
//
//        ivan.setYear(2010);
//        int i = ivan.getYear();
//        System.out.println(i);
        Person ivan = new Person("Ivan", "Smith", 2010);
        System.out.println(ivan.getLastName());
        System.out.println(ivan.getName());
        System.out.println(ivan.getYear());

    }
}
