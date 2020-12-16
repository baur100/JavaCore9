package homeWork12SO03;

public class SO03HW12App {
    public static void main(String[] args) {

        SOHW12Disk disk = new SOHW12Disk("Western Digital");
        SO03HW12Memory memory = new SO03HW12Memory("Corsair");
        SO03HW12Monitor monitor = new SO03HW12Monitor("ASUS","VG247Q",24.0);
        SO03HW12Processor processor = new SO03HW12Processor("Intel","Core i7",4);
        SO03HW23Motherboard motherboard = new SO03HW23Motherboard("Gigabyte","H110M-S2H",new SO03HW12Processor("Intel","Core i7",4),new SO03HW12Memory("Corsair"));
        SO03HW12Keyboard keyboard = new SO03HW12Keyboard("Logitech","G915");
        SO03HW12Mouse mouse = new SO03HW12Mouse("Logitech","G403 Hero");


        SO03HW12SystemBlock systemBlock = new SO03HW12SystemBlock(motherboard,disk);
        SO03HW12Computer dell = new SO03HW12Computer(keyboard,mouse,monitor,systemBlock);

        System.out.println(dell);

    }
}
