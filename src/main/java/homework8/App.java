package homework8;

public class App {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "camry";
        myCar.color = "green";
        myCar.year = 2013;

        Car myFriendsCar = new Car();
        myFriendsCar.brand = "Honda";
        myFriendsCar.model = "Civic";
        myFriendsCar.color = "Black";

        printCar(myCar);
        printCar(myFriendsCar);

    }

    public static void printCar(Car car){
        System.out.println("Brand = "+car.brand+
                "\nModel = "+car.model +
                "\nColor = "+car.color+
                "\nYear = "+car.year);
    }


}
