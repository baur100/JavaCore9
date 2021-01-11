package lesson14Dec18;

import java.util.ArrayList;

public class App1OB {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Color");
        list.add("Pencil");
        list.add("Cow");
        System.out.println(list);
        list.add("Car");
        System.out.println(list);
        System.out.println(list.get(1));
        //(.add)-adds value to the list
        //(.get)-returns element with index
        list.set(2,"Sheep");// Used for replacement
        System.out.println(list);
        list.add(1,"New");// Add element into the list
        System.out.println(list);
        System.out.println(list.size());//count how many items in the list
        System.out.println(list.get(list.size()-1));//sout pre-last
        list.add("Pencil");
        System.out.println(list);



        //Remove by object (will be removed 1st Pencil)
        boolean cc = list.remove("Pencil");
        System.out.println(cc);
        System.out.println(list);
        boolean xx = list.remove("Shoes");
        System.out.println(xx);// will sout false, because we tried to remove an object which doesn't exist

        //Delete by Index
        String result = list.remove(1);
        System.out.println(list);
        System.out.println(result);


        // HOW TO FIND OUT WE HAVE A WORD IN THE LIST
        xx=list.contains("Car");
        System.out.println(xx); //sout returns TRUE, which means we DO have this word in the list.

        //for (String ss: list){                 THIS IS THE SAME AS FOLLOWING:
          //  System.out.println(ss);
        //}


        list.forEach(ss-> System.out.println(ss));
        //SAME THING AS:
        list.forEach(System.out::println);
        }

    }

