package homework15;

import java.util.HashMap;
import java.util.Map;

public class Appp1 {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();
        fruits.put(0, "Apple");
        fruits.put(1, "Mango");
        fruits.put(2, "Pear");
        fruits.put(3, "Orange");
        fruits.put(3, "Kiwi");

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        fruits.replace(3, "Orange");
        System.out.println(fruits);

//        int i = fruits.remove(1);
//        System.out.println(i);
        for (int key : fruits.keySet()) {
            System.out.println(key);
        }
        for (String value : fruits.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> entry : fruits.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
