package homeWork12SO03;

public class SO03HW12Computer {
    private SO03HW12Keyboard keyboard;
    private SO03HW12Mouse mouse;
    private SO03HW12Monitor monitor;
    private SO03HW12SystemBlock systemBlock;

    public SO03HW12Computer(SO03HW12Keyboard keyboard, SO03HW12Mouse mouse, SO03HW12Monitor monitor, SO03HW12SystemBlock systemBlock) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.systemBlock = systemBlock;
    }

    public SO03HW12Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(SO03HW12Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public SO03HW12Mouse getMouse() {
        return mouse;
    }

    public void setMouse(SO03HW12Mouse mouse) {
        this.mouse = mouse;
    }

    public SO03HW12Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(SO03HW12Monitor monitor) {
        this.monitor = monitor;
    }

    public SO03HW12SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SO03HW12SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }


    public String toString() {
        return "Computer: " + "\nKeyboard - " + keyboard +
                "\nMouse - " + mouse +
                "\nMonitor - " + monitor +
                "\nSystemBlock: " + systemBlock;
    }
}
