package floreslesson14;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        List<Colors> colors = new ArrayList<>();

        colors.add(Colors.BLUE);
        colors.add(Colors.BLUE);
        colors.add(Colors.CRIMSON);
        colors.add(Colors.WHITE);
        System.out.println(colors);

        Person sam = new Person("Samuel", "Adams");
        Person mary = new Person("Mary", "Shelly");
        List<Person> people = new ArrayList<>();
        people.add(mary);
        people.add(sam);
        people.add(new Person("George","Miles"));

        System.out.println(people);
    }
}
