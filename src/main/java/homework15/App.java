package homework15;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String,String> cities = new HashMap<String, String>();
        cities.put("Paris","France");
        cities.put("Moscow","Russia");
        cities.put("Rome","Italy");
        cities.put("Washington","USA");
        cities.put("Rome","Europe");

        System.out.println(cities);
        System.out.println(cities.get("Paris"));

        cities.replace("Rome","Italy");
        System.out.println(cities);

        String xx = cities.remove("Paris");
        System.out.println(xx);

        boolean vv = cities.containsKey("Paris");
        System.out.println(vv);
        vv=cities.containsValue("Russia");
        System.out.println(vv);

        for (String key : cities.keySet()){
            System.out.println(key);
        }
        for (String value : cities.values()){
            System.out.println(value);
        }
        for (Map.Entry<String,String> entry : cities.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }

    }
}
