package homeworkHashMapLT;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        CarModels camry = new CarModels("Camry", "Toyota", "Sedan");
        CarLuxuryScale midSize = new CarLuxuryScale("Mid-size", "$20,000 to $29,999", "Mass-produced");
        CarModels e350 = new CarModels("E350", "Mercedes", "Sedan");
        CarLuxuryScale fullSize = new CarLuxuryScale("Full-size", "$30,000 to $45,999", "Mass-produced");
        CarModels avalon = new CarModels("Avalon", "Toyota", "Sedan");
        CarLuxuryScale executive = new CarLuxuryScale("Executive", "$46,000-$69,999", "Limited production");
        CarModels ftyper = new CarModels("F-Type R", "Jaguar", "Coupe");
        CarLuxuryScale luxury = new CarLuxuryScale("Luxury", "$70,000 - $125,999", "Limited production");

        Map<CarModels, CarLuxuryScale> cars = new HashMap<>();
        cars.put(camry, midSize);
        cars.put(avalon, fullSize);
        cars.put(e350, executive);
        cars.put(ftyper, luxury);

        System.out.println(cars);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        for (Map.Entry<CarModels, CarLuxuryScale> range : cars.entrySet()) {
            System.out.println(range.getKey() + " - falls under the category of - " + range.getValue());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        CarModels navigator = new CarModels("Navigator", "Lincoln", "SUV");
        CarModels maxima = new CarModels("Maxima", "Nissan", "Sedan");

        cars.put(navigator, executive);
        cars.put(maxima, fullSize);


        for (Map.Entry<CarModels, CarLuxuryScale> range : cars.entrySet()) {
            System.out.println(range.getKey() + " - falls under the category of - " + range.getValue());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        cars.remove(maxima);

        for (Map.Entry<CarModels, CarLuxuryScale> range : cars.entrySet()) {
            System.out.println(range.getKey() + " - falls under the category of - " + range.getValue());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        cars.replace(avalon, midSize);
        for (Map.Entry<CarModels, CarLuxuryScale> range : cars.entrySet()) {
            System.out.println(range.getKey() + " - falls under the category of - " + range.getValue());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        System.out.println(cars.get(e350));






        }
    }
