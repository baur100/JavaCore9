package Homework11Lera;

public class App {
    public static void main(String[] args) {
        Brand luxe = Brand.BALENCIAGA;


        Store saksFifthAvenue = new Store("Bag",Bag.TOTE);
        Store NM = new Store("Shoes",Shoes.BOOTS);
        System.out.println(NM.getItem());

    }
}
