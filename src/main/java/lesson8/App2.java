package lesson8;

public class App2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Tundra";
        myCar.brand = "Toyota";
        myCar.color = "Silver";
        myCar.year = 2007;

        myCar.startEngine();

        Car bb = new Car();
        bb.year = 1999;
        bb.brand = "BMW";
        bb.model = "X5";

        bb.startEngine();
        bb.stopCar();

        Car xx = new Car();
        xx.brand = "Lincoln";
        xx.stopCar();

    }
}
