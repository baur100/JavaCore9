package lesson14SO03;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Color");
        list.add("Pencil");
        list.add("Cow");
        System.out.println(list);
        list.add("Car");
        System.out.println(list);
        System.out.println(list.get(1));
        // add(value) > adding values to arraylist
        // get(index) > return element with index
        list.set(2, "Sheep");
        System.out.println(list);
        list.add(1,"New");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1));
        list.add("Pencil");
        System.out.println(list);
        boolean cc = list.remove("Pencil");
        System.out.println(cc);
        System.out.println(list);
        boolean xx = list.remove("Shoes");
        System.out.println(xx);
        String result = list.remove(1);
        System.out.println(list);
        System.out.println(result);

        xx = list.contains("Car");
        System.out.println(xx);

//        for (String ss: list){
//            System.out.println(ss);
//        }
        list.forEach(ss-> System.out.println(ss));
        list.forEach(System.out::println);



    }
}
