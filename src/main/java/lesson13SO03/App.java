package lesson13SO03;

public class App {
    public static void main(String[] args) {
//        String str = "Hi - hello";
//
//        System.out.println(str.length());
//        System.out.println(str.charAt(1));
//        AmericanPowerPlug vv = new AmericanPowerPlug();



        DesktopLight xx = new DesktopLight();
        LaserPrinter printer = new LaserPrinter();

        AmericanPowerPlug device = new DesktopLight();
        AmericanPowerPlug dev2 = new LaserPrinter();

        AmericanPowerPlug[] devices = {xx, printer, device, dev2, dev2};

        for (AmericanPowerPlug d: devices){
            d.americanPowerPlug();
        }
    }
}
