package hm15;

import java.util.ArrayList;
import java.util.List;

public class App0 {
    public static void main(String[] args) {
//        Create 3 ArrayList - String, Integer and some Custom class
//        Add 4+ elements to each List
//        excersize methods add/set/remove/get/foreach and etc
        List<String> strng = new ArrayList<>();
        strng.add("Water");
        strng.add("Beer");
        strng.add("Coffee");
        System.out.println(strng);
        strng.add(0,"Coke");
        System.out.println(strng);
        strng.set(1,"Dr. Pepper");
        System.out.println(strng);
        System.out.print("Remove 'Beer'="+strng.remove("Beer")+" ");
        System.out.print(strng);
        System.out.println(" size:"+strng.size());
        System.out.println("The last element: "+strng.get(strng.size()-1));
        System.out.println(strng.remove(1)+"=removed");
        strng.forEach(y-> System.out.println(y+" "));
        boolean xx = strng.contains("Coke");
        System.out.println("Coke in the list="+xx);
        System.out.println("==================");

        List<Integer> scnd = new ArrayList<>();
        scnd.add(0);
        scnd.add(1);
        scnd.add(2);
        scnd.add(4);
        scnd.add(3,3);
        System.out.println(scnd);
        scnd.set(4,55);
        System.out.println(scnd);
        boolean a = scnd.remove("66");
        System.out.println("Remove 66="+a);
        int result = scnd.remove(4);
        System.out.println(scnd+" | removed+"+result);
        System.out.println("The last element="+scnd.get(scnd.size()-1));
        scnd.forEach(y-> System.out.println(y));
        System.out.println("===========================");

        List<Flowers> flowerStore = new ArrayList<>();
        flowerStore.add(new Flowers("Rose"));
        flowerStore.add(new Flowers("Daisy"));
        flowerStore.add(new Flowers("Sunflower"));
        System.out.println(flowerStore);
        flowerStore.add(2, new Flowers("Carnations"));
        System.out.println(flowerStore);
        flowerStore.set(0,new Flowers("New Flower"));
        System.out.println(flowerStore);
        flowerStore.remove(flowerStore.size()-1);
        System.out.println(flowerStore);
    }
}
