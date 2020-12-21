package homeworkHashMapLT;

import java.util.HashMap;
import java.util.Map;

public class Cars {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("Corolla", "Toyota");
        cars.put("Evolution", "Mitsubishi");
        cars.put("Sentra", "Nissan");
        cars.put("Mustang", "Ford");
        cars.put("Charger","Dodge");

        System.out.println(cars);

        cars.put("Camry", "Toyota");
        cars.put("Focus", "Ford");
        System.out.println(cars);

        cars.replace("Corolla", "Toyota", "GM");
        System.out.println(cars);

        cars.replace("Corolla","Toyota");
        System.out.println(cars);

        cars.remove("Evolution");
        System.out.println(cars);

        System.out.println(cars.get("Sentra"));



        for (Map.Entry<String, String> entry : cars.entrySet()
             ) {
            System.out.println(entry.getKey()+" is made by "+ entry.getValue());

        }


    }

}
