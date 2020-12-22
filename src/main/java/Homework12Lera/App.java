package Homework12Lera;

public class App {
    public static void main(String[] args) {

        Store SAKS = new Store("Dress","small","Black",1000,State.CALIFORNIA);
        Dress DG = new Dress("DG","Summer",SAKS);
        String itemName = DG.getBrand();

        System.out.println(itemName);
        String itemSeason = DG.getSeason();
        System.out.println(itemSeason);
        String itemAdress = DG.getStore().getState();

    }
}
