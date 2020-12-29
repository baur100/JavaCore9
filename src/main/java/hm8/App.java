package hm8;

public class App {
    public static void main(String[] args) {
//        1. Create 4 classes with fields and methods
//        2. In the App class create main() and create 2 instances of each class, fill all fields
//        invoke methods

        Computer mycomputer = new Computer();
        mycomputer.brand = "Mac";
        mycomputer.model = "Book Pro";
        mycomputer.memory = 8;
        mycomputer.graphics = 1536;

        mycomputer.printComputerInfo();

        Doctor mydoctor = new Doctor();
        mydoctor.doctorName = "Smit";
        mydoctor.appointment = true;
        mydoctor.insurance = "Blue cross";
        mydoctor.coPay = 50;

        mydoctor.printDoctor();

        Device myPhone = new Device();
        myPhone.brand = "Apple";
        myPhone.model = "iPhone XR";
        myPhone.OS = "iOS";
        myPhone.version = 12.3;
        myPhone.memory = 128;

        myPhone.printDevice();

        Supermarket target = new Supermarket();
        target.name = "Target";
        target.distance = 3;
        target.driveUp = false;
        target.pickUpOrder = true;

        target.printSupermarket();
    }
}
