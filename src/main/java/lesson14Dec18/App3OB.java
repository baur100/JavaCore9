package lesson14Dec18;

import java.util.ArrayList;
import java.util.List;

public class App3OB {
    public static void main(String[] args) {
        List<ColorsOB> colors = new ArrayList<ColorsOB>();
        colors.add(ColorsOB.BLUE);
        colors.add(ColorsOB.BLUE);
        colors.add(ColorsOB.CRIMSON);
        colors.add(ColorsOB.GREY);
        System.out.println(colors);


        PersonOB sam = new PersonOB("Samuel", "Adams");
        PersonOB mary = new PersonOB("Mary","Shelly");
        List<PersonOB> people = new ArrayList<PersonOB>();
        people.add(mary);
        people.add(sam);
        people.add(new PersonOB("Anna","Lee"));
        System.out.println(people);


    }
}
