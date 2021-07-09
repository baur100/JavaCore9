package zhm12;

public class App {
    //    Create 2 computers + do 10-11 lesson homework
    public static void main(String[] args) {
        Computer macBook = new Computer(new Keyboard("Logitech", "x90") ,new Monitor("Asuz",24),
                new Mouse("logitech", "e90"),new SystemBlock(
                        new Motherboard("Intel","X",new Memory("Microsoft",8),new Processor(
                                "Apple","Coolest one")),new Disk(512)));
        System.out.println(macBook.toString());
}
}
