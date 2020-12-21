package hw14;

import java.util.HashMap;

public class Map2 {
    public static void main(String[] args) {
        HashMap<Integer,String> room = new HashMap<>();
        room.put(1,"Maria");
        room.put(2,"Maria");
        room.put(3, "Dan");
        room.put(4,"David");

        System.out.println(room);
        System.out.println(room.replace(2,"Sasha"));
        System.out.println(room);
        System.out.println(room.remove(1));
        System.out.println(room);
        System.out.println(room.get(4));
        for (String ss:room.values()
             ) {
            System.out.println(ss);


        }


    }
}
