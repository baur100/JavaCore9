package homework12;

public class App {
    public static void main(String[] args) {
        Memory acerMemory = new Memory("RAM", 8);
        Processor acerProcessor = new Processor("Intel", "Core i3");
        Disk acerDisk = new Disk(1);
        Motherboard acerMotherboard = new Motherboard("Acer", "Aspire TC-780", acerProcessor, acerMemory);
        SystemBlock acerSystemBlock = new SystemBlock(acerMotherboard, acerDisk);
        Monitor acerMonitor = new Monitor("HP", "U28", 28);
        Mouse acerMouse = new Mouse("Logitech", "M510");
        Keyboard acerKeyboard = new Keyboard("Logitech", "K380");
        Computer acerComputer = new Computer(acerKeyboard, acerMouse, acerMonitor, acerSystemBlock);

        String brand = acerComputer.getSystemBlock().getMotherboard().getProcessor().getBrand();
        String model = acerComputer.getSystemBlock().getMotherboard().getProcessor().getModel();
        System.out.println("Processor brand = " + brand + "\nProcessor model = " + model);


        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        Memory asusMemory = new Memory("RAM", 6);
        Processor asusProcessor = new Processor("AMD", "Ryzen AM4");
        Disk asusDisk = new Disk(1);
        Motherboard asusMotherboard = new Motherboard("Asus", "Prime X370-Pro", asusProcessor, asusMemory);
        SystemBlock asusSystemblock = new SystemBlock(asusMotherboard, asusDisk);
        Monitor asusMonitor = new Monitor("LG", "29WN600", 29);
        Mouse asusMouse = new Mouse("Razer", "Vyper");
        Keyboard asusKeyboard = new Keyboard("Microsoft", "L3V-00001");
        Computer asusComputer = new Computer(asusKeyboard, asusMouse, asusMonitor, asusSystemblock);

        String type = asusComputer.getSystemBlock().getMotherboard().getMemory().getType();
        int volume = asusComputer.getSystemBlock().getMotherboard().getMemory().getVolume();

        System.out.println("Asus memory " + type + " = " + volume + " Gb");

    }
}

