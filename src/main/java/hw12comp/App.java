package hw12comp;

public class App {
    public static void main(String[] args) {

    Mouse dimaMouse = new Mouse ("Logitech", "Wireless XX1");
    Keyboard dimaKeyboard = new Keyboard ("Apple", "black");
    Monitor dimaMonitor = new Monitor (27, "BENQ");
    Processor dimaProcessor = new Processor ("Intel",2.8);
    Memory dimaMemory = new Memory (16, "DDR5");
    Disk dimaDisk = new Disk (7200, "1 TB");
    Motherboard dimaMotherboard = new Motherboard ("Asus","X470", dimaProcessor,dimaMemory);
    SystemBlock dimaSystemBlock = new SystemBlock (dimaMotherboard, dimaDisk);
    Computer dimaComputer = new Computer (dimaKeyboard,dimaMouse, dimaMonitor, dimaSystemBlock);

    String processorName = dimaProcessor.getName();
        System.out.println(processorName);

    int memoryCapacity = dimaComputer.getSystemBlock().getMotherboard().getMemory().getCapacity();
        System.out.println(memoryCapacity);

    String diskSize = dimaComputer.getSystemBlock().getDisk().getSize();
        System.out.println(diskSize);

    String motherboardBrand = dimaSystemBlock.getMotherboard().getBrand();
        System.out.println(motherboardBrand);

        System.out.println(dimaComputer.toString());
    }
}
