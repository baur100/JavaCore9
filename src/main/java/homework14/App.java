package homework14;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Animals");
        list.add("Colors");
        list.add("Computer");
        list.add("Pen");
        System.out.println(list);

        list.add("Fruits");
        System.out.println(list);

        System.out.println(list.get(2));

        list.set(3,"Car");
        System.out.println(list);

        list.add(1,"TV");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1));

        list.remove("TV");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        for (String ss: list){
            System.out.println(ss);
        }
        list.forEach(ss-> System.out.println(ss));

    }
}
