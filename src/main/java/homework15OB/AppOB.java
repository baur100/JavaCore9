package homework15OB;

import java.util.HashMap;
import java.util.Map;
//Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//add 4 elements to each hashmap
//try methods  put/replace/remove/get/foreach

public class AppOB {
    public static void main(String[] args) {


        //1

        Map<String,String> books = new HashMap<>();
        books.put("Game of Thrones","G.R.R. Martin");
        books.put("The Lord of the Rings","J.R.R. Tolkien");
        books.put("War and Peace","Leo Tolstoy");
        books.put("Dead Souls", "Nikolay Gogol");

        books.remove("Game of Thrones");
        System.out.println(books);




        //2
        Map<Integer,String> bookList = new HashMap<>();
        bookList.put(0,"G.R.R. Martin");
        bookList.put(1,"J.R.R. Tolkien");
        bookList.put(2,"Leo Tolstoy");
        bookList.put(3,"Nikolay Gogol");
        bookList.replace(0,"Max Frey");
        System.out.println(bookList);


        //3
        Map<Author,BookName> books1 = new HashMap<>();
        books1.put(Author.TOLSTOY,BookName.WARANDPEACE);
        books1.put(Author.GOGOL,BookName.DEADSOULS);
        books1.put(Author.MARTIN,BookName.GOT);
        books1.put(Author.TOLKIEN, BookName.LOR);


        for (Map.Entry<Author,BookName> entry:books1.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }



    }
}
