package homework8IP;

public class App1IP {
    public static void main(String[] args) {
        Tennis myEquipment = new Tennis();
        myEquipment.name = "Racket";
        myEquipment.color = "Red";
        myEquipment.quantity = 1;

        myEquipment.printTennis();

        Tennis herEquipment = new Tennis();
        herEquipment.name = "Racket";
        herEquipment.color = "Blue";
        herEquipment.quantity = 1;

        herEquipment.printTennis();

        Tennis hisEquipment = new Tennis();
        hisEquipment.name = "Racket";
        hisEquipment.color = "White";
        hisEquipment.quantity = 3;
        hisEquipment.extraBalls = " He brings tennis balls to play";

        hisEquipment.printTennis();


    }
}
