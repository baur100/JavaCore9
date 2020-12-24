package homework14;

import java.util.ArrayList;

public class App1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(8);
        System.out.println(numbers);
        numbers.add(10);
        System.out.println(numbers);

        System.out.println(numbers.get(0));

        numbers.set(0,88);
        System.out.println(numbers);
        numbers.add(2,100);
        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(numbers.size()-1));

        numbers.remove(1);
        System.out.println(numbers);

        for(Integer i : numbers){
            System.out.println(i);
        }

    }
}
