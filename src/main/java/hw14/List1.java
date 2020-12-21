package hw14;


import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {

        List<String> cars = new ArrayList<>();

        cars.add("Honda");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("KIA");
        System.out.println(cars);
        System.out.println(cars.get(4));
        System.out.println(cars.set(4,"Acura"));
        System.out.println(cars);
        System.out.println(cars.remove(0));
        System.out.println(cars);
        cars.add(0,"Nissan");
        System.out.println(cars);
        System.out.println(cars.get(2));
        //for (String zx:cars
          //   ) {
           // System.out.println(zx);
            System.out.println(cars.size()-1);
        }
    }

