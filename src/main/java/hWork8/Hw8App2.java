package hWork8;

import homework8.Clothing;

public class Hw8App2 {
    public static void main(String[] args) {
        Hw8Animal cat = new Hw8Animal();
        cat.whichAnimal = "cat";
        cat.breed = "Scottish";
        cat.color = "gray";
        cat.shape = "very fat";
        cat.characteristic = "very lazy";

        printAnimal(cat);

        printLine();

        Hw8Animal dog = new Hw8Animal();
        dog.whichAnimal = "dog";
        dog.breed = "Frenchie";
        dog.color = "black";
        dog.shape = "fat";
        dog.characteristic = "stupid";

        printAnimal(dog);

    }

    public static void printAnimal (Hw8Animal animal){
        System.out.println("This "+animal.color+" "+animal.breed+" "+animal.whichAnimal+" is "+animal.shape
                +" and "+animal.characteristic+".");
    }
    public static void printLine(){
        System.out.println("------------------------------------");
    }
}
