package hm8;

public class Computer {
    String brand;
    String model;
    int memory;
    int graphics;

    public void printComputerInfo(){
        System.out.println("I have "+brand+model+" with "+memory+
                "GB memory and "+graphics+"MB graphics");
    }
}
