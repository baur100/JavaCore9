package homework14;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        ArrayList<Fruits> fruits = new ArrayList<>();

        fruits.add(Fruits.APPLE);
        fruits.add(Fruits.MANGO);
        fruits.add(Fruits.KIWI);
        fruits.add(Fruits.PICH);
        System.out.println(fruits);
        fruits.add(Fruits.PINEAPPLE);
        System.out.println(fruits);
        System.out.println(fruits.get(1));

       // fruits.set(0,)

       //fruits.add(1,"");

        fruits.remove(1);
        System.out.println(fruits);
        fruits.remove("APPLE");
        System.out.println(fruits);


    }
}
