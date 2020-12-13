package lesson8Dec7;

public class App2OB77 {
    public static void main(String[] args) {
        CarOB77 myCar = new CarOB77();
        myCar.brand = "Toyota";
        myCar.model = "Tundra";
        myCar.color = "Silver";
        myCar.year = 2007;
        myCar.startEngine();
        myCar.stopCar();



        CarOB77 bb = new CarOB77();
        bb.brand = "BMW";
        bb.model = "X5";
        bb.year = 1999;
        bb.startEngine();
        bb.stopCar();
        // In the class we describe an object; It may have fields and methods only.
        // Fields explain some values and Methods explain some actions.
    }
}
