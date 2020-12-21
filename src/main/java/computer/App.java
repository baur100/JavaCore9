package computer;

public class App {
    public static void main(String[] args) {

            Keyboard dellKeyboard = new Keyboard("Has number pad",Colors.BLUE);
            Mouse dellMouse = new Mouse("logitech","wierless");
            Monitor dellMonitor = new Monitor(15,"1920x900");
            Processor dellProcessor = new Processor("intel","CORE i7");
            Memory dellMemory = new Memory(48,"GB");
        Motherboard dellMotherboard = new Motherboard("toshiba","DDD", dellProcessor,dellMemory);
            Disk dellDisk = new Disk("848GB","SSD");
        SystemBlock dellSystemBlock = new SystemBlock(dellMotherboard,dellDisk);
        Array dellArray = new Array();
        Computer dell = new Computer(dellKeyboard,dellMouse,dellMonitor,dellSystemBlock,dellArray);


        System.out.println(dellProcessor);
        System.out.println(dellDisk);
        System.out.println(dellKeyboard);
        System.out.println(dellMotherboard);
        System.out.println(dellArray);


    }

}

