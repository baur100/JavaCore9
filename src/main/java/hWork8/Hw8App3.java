package hWork8;

public class Hw8App3 {
    public static void main(String[] args) {
        Hw8Vegetable tomato = new Hw8Vegetable();
        tomato.name = "tomato";
        tomato.color = "red";
        tomato.taste = "sour";

        Hw8Vegetable cucumber = new Hw8Vegetable();
        cucumber.name = "cucumber";
        cucumber.color = "green";
        cucumber.taste = "neutral";

        printVegetable(tomato);
        printVegetable(cucumber);

    }
    public static void printVegetable (Hw8Vegetable vegetable){
        System.out.println("I've purchased a " + vegetable.color+ " " + vegetable.name + " and it had a " + vegetable.taste+ " taste." );
    }
}
