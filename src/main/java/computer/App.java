package computer;

public class App {
    public static void main(String[] args) {

            Keyboard dellKeyboard = new Keyboard("Has number pad","lit");
            Mouse dellMouse = new Mouse("logitech","wierless");
            Monitor dellMonitor = new Monitor(15,"1920x900");
            Processor dellProcessor = new Processor("intel","CORE i7");
            Memory dellMemory = new Memory(48,"GB");
        Motherboard dellMotherboard = new Motherboard("toshiba","DDD", dellProcessor,dellMemory);
            Disk dellDisk = new Disk("848GB","SSD");
        SystemBlock dellSystemBlock = new SystemBlock(dellMotherboard,dellDisk);
        Computer dell = new Computer(dellKeyboard,dellMouse,dellMonitor,dellSystemBlock);



        System.out.println(dell);

    }
}
