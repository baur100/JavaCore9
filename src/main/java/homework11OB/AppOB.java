package homework11OB;

public class AppOB {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core I 7");
        Memory memory = new Memory("Ballistix MAX","16 GB");
        Motherboard motherboard = new Motherboard("MSI","MEG Godlike Z490",processor,memory);
        Disk disk = new Disk("Seagate Nytro 3330");
        SystemBlock systemBlock = new SystemBlock(motherboard,disk);
        Keyboard keyboard = new Keyboard("Logitech","Wireless");
        Mouse mouse = new Mouse("Logitech","MX Master");
        Monitor monitor =new Monitor("34 in","Dell");



        ComputerOB myComputer = new ComputerOB (keyboard,mouse,systemBlock,monitor);
        System.out.println(myComputer);






    }
}
