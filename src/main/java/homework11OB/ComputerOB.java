package homework11OB;
// computer=>keyboard,monitor,mouse,systemblock=>disk,motherboard=>memory, processor
public class ComputerOB {
    private Keyboard keyboard;
    private Mouse mouse;
    private SystemBlock systemBlock;
    private Monitor monitor;

    public ComputerOB (Keyboard keyboard, Mouse mouse, SystemBlock systemBlock, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systemBlock = systemBlock;
        this.monitor = monitor;
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

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }


    public String toString(){
        return "System Block:\n"+systemBlock+" "+
                "\n Monitor: "+monitor+" "+
                "\n Keyboard: "+keyboard+" "+
                "\n Mouse: "+mouse;
    }
}
