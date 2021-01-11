package lesson13Dec17;

public class DesktopLightOB implements AmericanPowerPlugOB,E27BulbOB {
    private String color;
    private int price;

    @Override
    public void americanPowerPlug(){
        System.out.println("Plug is implemented");
    }
    @Override
    public void useE27Bulb(){
        System.out.println("");
    }
}
