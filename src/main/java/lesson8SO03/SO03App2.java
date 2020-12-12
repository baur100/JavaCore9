package lesson8SO03;

public class SO03App2 {
    public static void main(String[] args) {
        SO03Car myCar = new SO03Car();
        myCar.model = "Tundra";
        myCar.brand = "Toyota";
        myCar.color = "Silver";
        myCar.year = 2007;
        myCar.startEngine();

        SO03Car bb = new SO03Car();
        myCar.model = "X5";
        myCar.brand = "BMW";
        myCar.color = "Black";
        myCar.year = 2015;
        myCar.startEngine();
        myCar.stopCar();

    }
}
