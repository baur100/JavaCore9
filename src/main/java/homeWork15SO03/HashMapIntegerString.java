package homeWork15SO03;

import java.util.HashMap;

public class HashMapIntegerString {
    public static void main(String[] args) {

        HashMap<Integer, String> items = new HashMap<>();
        items.put(1, "Pencil");
        items.put(2, "Pen");
        items.put(3, "Notebook");
        items.put(4, "Folder");
        items.put(5, "Cellphone");
        items.put(6, "Book");
        items.put(7, "Backpack");

        System.out.println(items);
        System.out.println(items.get(2));
        System.out.println(items.replace(6,"Book","Album"));
        System.out.println(items.remove(7));

        for (int i: items.keySet()){
            System.out.println(i);
        }
    }
}
