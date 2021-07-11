package zFLlesson15;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("China","Asia");
        countries.put("France","Europe");
        countries.put("Poland","Europe");
        countries.put("Germany","Europe");
        countries.put("USA","North America");
        countries.put("Canada","North America");
        countries.put("Canada","North Pole");

        System.out.println(countries);

        System.out.println(countries.get("Canada"));
        System.out.println(countries.get("France"));

        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "Red");
        colors.put(1, "Blue");
        System.out.println(colors.get(0));

        System.out.println(countries);
        countries.replace("Canada","North America");

        //if we want to save deleted value - we use remove with a "Key"
        String xx = countries.remove("Poland");
        System.out.println("Removed: "+xx);
        System.out.println(countries);

        boolean vv = countries.containsKey("Poland");
        System.out.println(vv);

        vv = countries.containsValue("Europe");
        System.out.println(vv);

        System.out.println("===========================");
        //Set contains unique values, no order
        for (String key:countries.keySet()) {
            System.out.println(key);
        }

        System.out.println("----------------------------");
        //Values it's collection of Strings, so can have duplicates or whatever we need
        for (String value:countries.values()) {
            System.out.println(value);
        }

        for(Map.Entry<String,String> entry: countries.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
