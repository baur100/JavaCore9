package hw8;

public class MYHW8ab {
    public static void main(String[] args) {
        Vegetables carrot = new Vegetables();
        carrot.name = "carrot";
        carrot.color = "red";
        carrot.weight = 3;

        Vegetables cale = new Vegetables();
        cale.name = "Calicale";
        cale.color = "white";
        cale.weight = 5;

        printVegetables(carrot);
        printVegetables(cale);


    }

    private static void printVegetables(Vegetables vegetables) {
        System.out.println("Vegetable name = " + vegetables.name +
                "\nVegetable color = " + vegetables.color +
                "\nVegetable weight = " + " " + vegetables.weight + " lbs");
    }
}
