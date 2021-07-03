package zFLlesson9;

public class App {
    public static void main(String[] args) {
        Person elen = new Person();
        elen.setName("Elen");
        elen.setLastName("Lee");
        elen.setYear(2021);
        System.out.println(elen.getName());

//        or #2 way ->
//        String xx = elen.getName();
//        System.out.println(xx);

        Person peter=new Person("Peter","Jonson",1990);
        System.out.println(peter.getLastName());

        Person david =new Person("David","Moore");
    }
}
