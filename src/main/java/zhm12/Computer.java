package zhm12;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private SystemBlock systemBlock;

    public Computer(Keyboard keyboard, Monitor monitor, Mouse mouse, SystemBlock systemBlock) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
        this.systemBlock = systemBlock;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "keyboard=" + keyboard +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                ", systemBlock=" + systemBlock +
                '}';
    }
}
