package zhm13;

public class App {
    public static void main(String[] args) {
        BaseCalculation opt1 = new GeorgiaAquarium(18,39);
        GeorgiaAquarium opt2 = new GeorgiaAquarium(0,24);
        opt1.printInfo();
        opt2.printInfo();

        CocaColaFactory opt4 = new CocaColaFactory(25);
        opt4.printInfo();
        CocaColaFactory opt5 = new CocaColaFactory(25);
        System.out.println("Today is 50% off, price is "+opt5.get50offPrice());

        Price pr1 = new GeorgiaAquarium(80, 39);
        pr1.printInfo();
    }
}
