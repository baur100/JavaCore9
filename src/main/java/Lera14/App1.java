package Lera14;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();


        list.add("Color");
        list.add("Pencil");
        list.add("Cow");
        System.out.println(list);
        list.add("Car");
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(2,"sheep");
        System.out.println(list);
        list.add(1,"New");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1));
        list.add("Pencil");
        System.out.println(list);
        list.remove("Pencil");
        System.out.println(list);
    }
}
