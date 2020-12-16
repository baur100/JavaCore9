package computerHWLT;

public class App {
    public static void main(String[] args) {

        Keyboard apex = new Keyboard("Apex", "cable");
        Monitor dell = new Monitor("Dell", "HDR", 32 );
        Mouse razor = new Mouse("Razor", "wireless");
        Disk seagate = new Disk("Sea Gate", "SSD", 1);
        Processor intel = new Processor("Intel", "Core i8", 2.3);
        Memory kingston = new Memory("Kingston", 64);
        Motherboard asus = new Motherboard("Asus", "ROG Strix B450-F", intel, kingston);
        SystemBlock xx = new SystemBlock(asus, seagate);

       Computer alienware = new Computer("Alienware", apex, razor, dell, xx);

       alienware.specInfo();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

       Keyboard logitech = new Keyboard("Logitech", "wireless");
       Monitor hp = new Monitor("HP", "UHD", 24 );
       Mouse basic = new Mouse("Basic", "cable");
       Disk westernDigital = new Disk("Western Digital", "HDD", 2);
       Processor amd = new Processor("AMD", "Ryzen 5 2600", 3.9 );
       Memory corsair = new Memory("Corsair", 32);
       Motherboard msi = new Motherboard("MSI", "B550 Gaming Plus", amd, corsair);
       SystemBlock zz = new SystemBlock(msi, westernDigital);

       Computer lenovo = new Computer("Lenovo", logitech, basic, hp, zz);

       lenovo.specInfo();




        }






    }

