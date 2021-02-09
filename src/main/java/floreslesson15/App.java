package floreslesson15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,String> countries = new HashMap<String, String>();
        countries.put("China","Asia");
        countries.put("Poland","Europe");
        countries.put("France","Europe");
        countries.put("Germany","Europe");
        countries.put("USA","North America");
        countries.put("Canada","North America");
        countries.put("Canada", "North Pole");
        System.out.println(countries);
        System.out.println(countries.get("Canada"));
        System.out.println(countries.get("France"));

        Map<Integer, String> colors = new HashMap<>();
        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Blue");
        colors.put(0, "Red");
        colors.put(1,"Blue");
        System.out.println(colors.get(1));
        System.out.println(colors1.get(1));

        System.out.println(countries);
        countries.replace("Canada","North America");
        System.out.println(countries);
        String xx = countries.remove("Poland");
        System.out.println(xx);

        Boolean vv = countries.containsKey("Poland");
        System.out.println(vv);
        vv = countries.containsValue("Europe");
        System.out.println(vv);

        Map<Fruit,Person> favoriteFruit = new HashMap<>();
        favoriteFruit.put(new Fruit(), new Person());
        System.out.println(favoriteFruit.size());

        for(String key : countries.keySet()){
            System.out.println(key);
        }
        System.out.println("===========");

        for (String value : countries.values()){
            System.out.println(value);
        }
        System.out.println("===========");

        for (Map.Entry<String,String> entry : countries.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}
