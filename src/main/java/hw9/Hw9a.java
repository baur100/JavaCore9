package hw9;

public class Hw9a {
    public static void main(String[] args) {
        Animal alligator = new Animal("Alligator Gena", "green", "Egypt");
        alligator.print();
    }

    static {
        TV samsung = new TV("Samsung", " 6500", 1234567);
        samsung.printIt();
    }

    static {
        Phone iPhone = new Phone("iPhone", "12 pro", 999);
        iPhone.printout();
    }

    static {
        Order yourOrder = new Order ("Sweets", "Premium", 35, 12);
        yourOrder.printall();
    }
    static {
        Worker alan = new Worker();
        alan.setName("Alan");
        String xx = alan.getName ();
        alan.setLastName("Morrison");
        alan.setPhoneNumber( 818299742);
        alan.setCity("LA");
        String xy = alan.getLastName ();
        System.out.println(xy);
        int xz = alan.getPhoneNumber();
        String xa = alan.getCity();
        System.out.println(xx+ ", " + xy + ", " + xz + ", " + xa);


    }
}

