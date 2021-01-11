package lesson13Dec17;

import lesson13.AmericanPowerPlug;

public class AppOB {
    public static void main(String[] args) {
     //   String str ="Hi-hello";
     //   System.out.println(str.length());
     //   System.out.println(str.charAt(1));
        //WebDriver Is an interface

        DesktopLightOB xx = new DesktopLightOB();
        LaserPrinterOB printer = new LaserPrinterOB();
        AmericanPowerPlugOB device = new DesktopLightOB();
        AmericanPowerPlugOB device2 = new LaserPrinterOB();

        AmericanPowerPlugOB[] devices = {xx,printer,device,device2,device};
        for (AmericanPowerPlugOB d:devices){
            d.americanPowerPlug();
        }
    }
}
