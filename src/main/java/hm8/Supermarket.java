package hm8;

public class Supermarket {
    String name;
    double distance;
    boolean pickUpOrder;
    boolean driveUp;

    public void printSupermarket(){
        System.out.println("The closest "+name+" is within "+distance+" miles. Available options " +
                "for order: Pick Up - "+pickUpOrder+"  Drive Up - "+driveUp);
    }
}
