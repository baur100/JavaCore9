package hw14;


import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {

        List<Integer> dimensions = new ArrayList<>();
        dimensions.add(5);
        dimensions.add (3);
        dimensions.add (8);
        dimensions.add (10);

        System.out.println(dimensions);
        System.out.println(dimensions.get(3));
        System.out.println(dimensions.set(3,15));
        System.out.println(dimensions);
        System.out.println(dimensions.remove(0));
        System.out.println(dimensions);
        dimensions.add(0,74);
        System.out.println(dimensions);
        System.out.println(dimensions.get(2));
        //for (int zx:dimensions
        //   ) {
        // System.out.println(zx);
        System.out.println(dimensions.size()-1);
    }
}
