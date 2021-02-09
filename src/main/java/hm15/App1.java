package hm15;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<String,String> car = new HashMap<>();
        car.put("Lincoln", "Silver");
        car.put("BMW","Black");
        car.put("Mercedes","White");
        car.put("Audi","Red");
        System.out.println(car);
        car.replace("Audi","Gold");
        System.out.println(car.get("Audi"));
        String xx = car.remove("BMW");
        System.out.println(xx);

        Map<Integer,String> library = new HashMap<>();
        library.put(0,"Anna Karenina");
        library.put(1,"The Great Gatsby");
        library.put(2,"One Hundred Years of Solitude");
        library.put(3,"Invisible Man");
        System.out.println(library);

        Map<PizzaName, SizePizza> pizza = new HashMap<>();
        pizza.put(new PizzaName("Pepperoni"), new SizePizza("Large"));
        pizza.put(new PizzaName("Marinara"),new SizePizza("Small"));
        pizza.put(new PizzaName("Carbonara"), new SizePizza("Medium"));
        pizza.put(new PizzaName("Napoli"), new SizePizza("XL"));

//        pizza.forEach((PizzaName, SizePizza) -> System.out.println(PizzaName + ":" + key));

        for (Map.Entry<PizzaName, SizePizza> entry : pizza.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
