package homeworkArrayListLT;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCustomClass {
    public static void main(String[] args) {
        List<Professionals> houston = new ArrayList<>();

        Professionals james = new Professionals("James Smith", 35, Jobs.ACCOUNTANT);
       Professionals beth = new Professionals("Beth Harmon", 25, Jobs.ATHLETE);
       Professionals peter = new Professionals("Peter Douglas", 44, Jobs.RESEARCHER);
       Professionals ella = new Professionals("Ella Stone", 50, Jobs.TEACHER);

       houston.add(james);
       houston.add(beth);
       houston.add(peter);
       houston.add(ella);




        System.out.println(houston);
    }
}
