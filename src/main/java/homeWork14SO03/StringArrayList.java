package homeWork14SO03;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>();
        city.add("London");
        city.add("Tokyo");
        city.add("Moscow");
        city.add("Paris");
        city.add("Chicago");
        city.add("New York");
        System.out.println(city);
        city.set(3, "New York");
        System.out.println(city);
        System.out.println(city.get(4));
        city.remove(2);
        System.out.println(city);

        for (String c : city) {
            System.out.println(c);
        }
    }
}
