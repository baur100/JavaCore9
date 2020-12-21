package computer;
public class Computer {



    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private SystemBlock systemBlock;
    private Array array;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor, SystemBlock systemBlock,Array array) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.systemBlock = systemBlock;
        this.array = array;
    }



    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }


    public void printInfo() {
        System.out.println("Computer{" +
                "keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", monitor=" + monitor +
                ", systemBlock=" + systemBlock +
                '}');

    }
    }