package zhm14;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        part 1
//        Create 3 ArrayList - String, Integer and some Custom class
//        Add 4+ elements to each List
//        exercise methods add/set/remove/get/foreach and etc

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.set(0,"white");
        colors.add("gray");
        System.out.println(colors.get(1));
        for (String v: colors) {
            System.out.println(v);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(78);
        numbers.add(0,22);
        numbers.add(2,33);
        int x = numbers.get(1);
        System.out.println(x);
        for (int i:numbers){
            System.out.println(i);
        }
        System.out.println("------------------");

        List<Library> books = new ArrayList<>();
        books.add(new Library(33,"Math"));
        books.add(0,new Library(46,"History"));
        books.add(new Library(90,"English"));
        System.out.println(books);
//        for (Library l: books) {
//            System.out.println(l);
//        }
        books.forEach(b-> System.out.println(b));
        boolean isEmpty = books.isEmpty();
        System.out.println(isEmpty);
        books.set(2,new Library(77,"Spanish"));
        System.out.println(books.get(2));
    }
}
