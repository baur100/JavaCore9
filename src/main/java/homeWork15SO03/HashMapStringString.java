package homeWork15SO03;

import java.sql.SQLOutput;
import java.util.HashMap;

public class HashMapStringString {
    public static void main(String[] args) {

        HashMap<String, String> fruits = new HashMap<>();
        fruits.put("Orange", "Citrus");
        fruits.put("Grapefruit", "Citrus");
        fruits.put("Pear", "Orchard");
        fruits.put("Apple", "Orchard");
        fruits.put("Peach", "Stone fruit");
        fruits.put("Mango", "Stone fruit");
        fruits.put("Cherry", "Stone fruit");

        System.out.println(fruits);
        System.out.println(fruits.get("Cherry"));
        System.out.println(fruits.replace("Orange","Citrus","Berries"));
        System.out.println(fruits.remove("Orange"));

        for (String f: fruits.keySet()){
            System.out.println(f);
        }

    }
}
