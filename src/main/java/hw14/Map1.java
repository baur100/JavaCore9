package hw14;

import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String,String> family = new HashMap<String,String>();
        family.put("Diana","Ross");
        family.put("Mark","Ross");
        family.put("Alice","Brown");
        family.put("Eva","Greenberg");

        System.out.println(family);
        family.replace("Diana","Redwood");
        System.out.println(family);
        System.out.println(family.remove("Alice","Brown"));
        System.out.println(family);
        System.out.println(family.get("Eva"));
        for (String zz:family.values()) {
            System.out.println(zz);
        }
        System.out.println(family.containsKey("Ann"));
    }
}
