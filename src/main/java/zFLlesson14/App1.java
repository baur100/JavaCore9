package zFLlesson14;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Color");
        list.add("Pencil");
        list.add("Cow");
        System.out.println(list);

        list.add("Car");
        System.out.println(list);
        System.out.println(list.get(1));
        // add(value) > adding values to arrayList
        // get(index) > returns element with index
        // set(index, value) > replacing existing value

        list.set(2,"SheepSet");
        System.out.println(list);

        System.out.println(list.size());
        list.add(1,"ReplacedElement");
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
        list.add("Pencil");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove("Pencil");
        System.out.println(list);

        list.remove("WrongValue");
        System.out.println(list);

        boolean xx = list.remove("Shoes");
        System.out.println(xx);

        String result = list.remove(1);
        System.out.println(result);

        xx = list.contains("Color");
        System.out.println(xx);

        //option1 to print out whole array:
//        for ( String s : list) {
//            System.out.println(s);
//        }
        //option 2 to print out whole array:
//        list.forEach(s -> System.out.println(s));

        //option 3 to print out whole array:
        list.forEach(System.out::println);


    }
}
