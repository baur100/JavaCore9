package hm12;

public class Computer {
    private String keyboard;
    private String mouse;
    private Monitor monitor;
    private SystemBlock systemBlock;

    public Computer(String keyboard, String mouse, Monitor monitor, SystemBlock systemBlock) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.systemBlock = systemBlock;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
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

    @Override
    public String toString() {
        return "Computer: \n" +
                "Keyboard='" + keyboard + '\'' +
                "\nMouse='" + mouse + '\'' +
                "\n"+ monitor +
                "\n" + systemBlock ;
    }
}
