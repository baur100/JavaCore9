package floreslesson13;

public class DesktopLight implements AmericanPowerPlug,E27Bulb {
    private String color;
    private int price;

    @Override
    public void americanPowerPlug() {
        System.out.println("Plug is implemented");
    }

    @Override
    public void useE27bulb() {
        System.out.println("E27Bulb");
    }
}
