package homeWork15SO03;

import java.util.HashMap;

public class HashMapClassClass {
    public static void main(String[] args) {

        HashMap<Hero, RealName> superHero= new HashMap<>();
        superHero.put(new Hero("Batman"),new RealName("Bruce", "Wayne"));
        System.out.println(superHero);


    }
}
