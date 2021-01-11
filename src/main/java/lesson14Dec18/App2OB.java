package lesson14Dec18;

import java.util.ArrayList;

public class App2OB {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // ArrayLists can not be created for primitives, only for classes
        numbers.add(5);
        numbers.add(5);
        numbers.add(-4);
        System.out.println(numbers);
    }
}
