package lesson15Dec19OB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppOB {
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<String,String>();
        //Key-value pair
        countries.put("China","Asia");
        countries.put("France","Europe");
        countries.put("Poland","Europe");
        countries.put("Germany","Europe");
        countries.put("USA","North America");
        countries.put("Canada","North America"); //key must be unique
        countries.put("Canada","North Pole");//North America was replaced by North Pole

        System.out.println(countries);
        System.out.println(countries.get("Canada"));
        System.out.println(countries.get("France"));


        HashMap<Integer,String> colors = new HashMap<>();
        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Blue");
        colors.put(0,"Red");
        colors.put(1,"Blue");
        System.out.println(colors.get(1));
        System.out.println(colors1.get(1));

        System.out.println(countries);
        countries.replace("Canada", "North America");
        System.out.println(countries);
        String xx = countries.remove("Poland");
        System.out.println(xx);
        Boolean yy = countries.containsKey("Canada");// Returns True or False, so we can check if the key is present of not,
        // the same is with containsValue
        System.out.println(yy);
        yy = countries.containsValue("Europe");
        System.out.println(yy);



        HashMap<FruitOB,PersonOB> favoriteFruit = new HashMap<>();
        favoriteFruit.put(new FruitOB(),new PersonOB());
        System.out.println(favoriteFruit.size());

        /*ITERATIONS THROUGH HASHMAPS:
        1. Iterate ONLY KEYS
        2.-//- ONLY VALUES
        3.-//_ BOTH KEYS and VALUES-???
         */
        //Foreach is used for iteration

        for(String key:countries.keySet()){
            System.out.println(key);
        }
        for(String value:countries.values()){
            System.out.println(value);
        }
        for(Map.Entry<String,String> entry: countries.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        } //47:37 homework
    }
}
