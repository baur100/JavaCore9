package homework9LT;

import javax.swing.*;
import java.util.concurrent.Callable;

public class AppLT71 {
    public static void main(String[] args) {
        Shoes loafers = new Shoes();
        loafers.setName("Loafers");
        loafers.setBrand("Zegna");
        loafers.setType("Casual");
        loafers.setPrice(500);
        loafers.printInfo();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        Shoes jordan = new Shoes("Jordan", "Nike", "Sports", "Red", 150);
        jordan.printInfo();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        Pizza veggie = new Pizza();
        veggie.setName("Veggie");
        veggie.setSize("Medium");
        veggie.setSauce("White");
        veggie.setTypeOfCrust("Thin");
        veggie.setPrice(15);
        veggie.printInfo();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        Pizza special = new Pizza("Special","large","Thick", "Tomato", 25 );
        special.printInfo();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Coffee breakfast = new Coffee();
        breakfast.setName("Breakfast");
        breakfast.setSize("Medium");
        breakfast.setBrand("Dunkin");
        breakfast.setPrice(0.75);
        breakfast.printInfo();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Coffee verona = new Coffee("Verona", "Small", "Starbucks", 1.50);
        verona.printInfo();


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");


        Whisky glenfiddich = new Whisky();
        glenfiddich.setName("Glenfiddich");
        glenfiddich.setAge(18);
        glenfiddich.setRegion("Speyside");
        glenfiddich.setPrice(150);
        glenfiddich.setType("Single Malt");
        glenfiddich.printInfo();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");




        Whisky lagavulin = new Whisky("Lagavulin", "Islay", 16, 65, "Single Malt");
        lagavulin.printInfo();




    }


}
