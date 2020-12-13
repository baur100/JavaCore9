package homework8;

public class App2 {
    public static void main(String[] args) {
        Fruit a = new Fruit();
        a.name = "Apple";
        a.color = "Red";

        Fruit b = new Fruit();
        b.name = "Grape";
        b.color = "Green";

printFruit(a);
printFruit(b);

    }

    public static void printFruit(Fruit fruit){
        System.out.println(fruit.color+ " " +  fruit.name);
    }
}
