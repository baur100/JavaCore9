package zFLlesson8;

public class App1 {
    public static void main(String[] args) {
        Vehicle firstCar = new Vehicle();
        firstCar.brand="Toyota";
        firstCar.model="Prius";
        firstCar.color="Pink";
        firstCar.year=1989;

        firstCar.printCarInfo();
        firstCar.stopCar(); 
    }

}
