package hw8lera;

public class App11 {
    public static void main(String[] args) {
        TelephoneHw iphone = new TelephoneHw();
        iphone.model = "X";
        iphone.color = "Blue";
        iphone.price = 1000;

        TelephoneHw nokia = new TelephoneHw();
        nokia.model = "Old school";
        nokia.color = " Grey";
        nokia.price = 10;

        printTelephone(iphone);
        printTelephone(nokia);

    }
    public static void printTelephone(TelephoneHw iphone){
        System.out.println("Model = "+ TelephoneHw.model+
                "\nColor = "+ TelephoneHw.color+
                "\nPrice = "+ TelephoneHw.price);
    }
}
