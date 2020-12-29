package hm8;

public class Device {
    String brand;
    String model;
    String OS;
    double version;
    int memory;

    public void printDevice(){
        System.out.println("I use "+brand+" "+model+" "+memory+"GB for testing with "
                +OS+" "+version+" OS");
    }
}
