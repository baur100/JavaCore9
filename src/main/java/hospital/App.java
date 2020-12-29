package hospital;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<Integer,String> rooms = new HashMap<>();
        rooms.put(1,"Radiology");
        rooms.put(2,"Gastroenterology");
        rooms.put(3,"Endocrinology");
        rooms.put(4,"Pulmonology");
        System.out.println(rooms);

    }
}
