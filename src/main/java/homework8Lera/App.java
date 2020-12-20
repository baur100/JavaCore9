package homework8Lera;

import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {
       Chocolate milka = new Chocolate();
       milka.name = "Milka";
       milka.color = "White";
       milka.flavor = "Caramel";

       Chocolate snikers = new Chocolate();
       snikers.name = "Snicers";
       snikers.color = "Brown";
       snikers.flavor = "Peanut";

       printChocolate(snikers);
       printChocolate(milka);



       Jelly bears = new Jelly();
       bears.brand = "Haribo";
       bears.flavor = "Sour";
       bears.form = "Small bears";

       Jelly worms = new Jelly();
       worms.brand = "Smart";
       worms.flavor ="Apple";
       worms.form = "Worms";

       printJelly(bears);
       printJelly(worms);



        }
        public static void printJelly(Jelly Jelly){
            System.out.println("Brand="+Jelly.brand+"\nFlawor="+Jelly.flavor+"\nForm="+Jelly.form );
        }

    public static void printChocolate(Chocolate chocolate){
        System.out.println("Name="+chocolate.name+"\nColor="+chocolate.color+"\nFlavor="+chocolate.flavor);
    }

    }





