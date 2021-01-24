package hm12;

public class App {
    public static void main(String[] args) {
        Processor pr1 = new Processor("Standart");
        MotherBoard motherboard1 = new MotherBoard("Intel", "First", pr1, Memory.STANDART);
        SystemBlock sb1 = new SystemBlock(motherboard1, "HD Disk");
        Monitor mn1 = new Monitor("Acer", 21.0);
        Computer homeComputer = new Computer("Apple", "Logitech", mn1, sb1);
        System.out.println("Home " + homeComputer);

        Computer workComputer = new Computer("Microsoft", "Anker", new Monitor("Dell", 24.0),
                new SystemBlock(motherboard1, "SSD disk"));
        pr1.setProcessor("Best available");
        motherboard1.setMemory(Memory.SUPERFAST);
        System.out.println("\nWork " + workComputer);

      System.out.println("\nI like the most "+homeComputer.getMonitor().getBrandMonitor()+" monitor and " +
              workComputer.getMouse()+" mouse.");
    }
}
