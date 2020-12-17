package lesson8;

public class App11 {
    public static void main(String[] args) {
        Telephone iphone = new Telephone();
        iphone.model = "X";
        iphone.color = "Blue";
        iphone.price = 1000;

        Telephone nokia = new Telephone();
        nokia.model = "Old school";
        nokia.color = " Grey";
        nokia.price = 10;

        printTelephone(iphone);
        printTelephone(nokia);

    }
    public static void printTelephone(Telephone iphone){
        System.out.println("Model = "+Telephone.model+
                "\nColor = "+Telephone.color+
                "\nPrice = "+ Telephone.price);
    }
}
