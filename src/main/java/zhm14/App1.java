package zhm14;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
//        Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//                add 4 elements to each hashmap
//        try methods  put/replace/remove/get/foreach
        Map<String, String> fullName = new HashMap<>();
        fullName.put("Smith","Laura");
        fullName.put("White","Bryce");
        fullName.put("Jonson","Jack");
        fullName.forEach((l, n)->System.out.println(l+" "+n));
        fullName.replace("Smith","Alex");
        boolean c = fullName.containsKey("Smith");
        System.out.println(c);
        fullName.forEach((l,n)-> System.out.println(l+" "+n));
        System.out.println("Map ->");

        Map<Integer, String> lots = new HashMap<>();
        lots.put(1,"Clock");
        lots.put(2,"Mirror");
        lots.put(3,"Camera");
        lots.put(4,"Umbrella");
        lots.forEach((l,n)-> System.out.println(l+" "+n));
        System.out.println("3 element - "+lots.get(3));

        String r = lots.remove(3);
        System.out.println(r+" -  was removed");

        for (Map.Entry<Integer, String> entry : lots.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        System.out.println("Map <Class1,Class2> ->");

        Map<Names,Position> doctors = new HashMap<>();
        doctors.put(Names.ANNA, Position.DENTIST);
        doctors.put(Names.BILL,Position.CHIROPRACTOR);
        doctors.put(Names.JOHN,Position.OPTOMETRIST);
        doctors.put(Names.LEILA,Position.PHYSICIAN);

        for (Map.Entry<Names, Position> entry : doctors.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
