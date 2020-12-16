package computerHWLT;

public class Computer {
    private String name;
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private SystemBlock systemBlock;

    public Computer(String name, Keyboard keyboard, Mouse mouse, Monitor monitor, SystemBlock systemBlock) {
        this.name = name;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.systemBlock = systemBlock;
    }

    public Computer(){}

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
    public void setName(String name){
        this.name = name;
    }

    public void specInfo(){
        System.out.println("Name = "+name+
                "\nKeyboard = "+keyboard.toString()+
                "\nMouse = "+mouse.toString()+
                "\nMonitor = "+monitor.toString()+
                "\nSystem Block: "+'\n'+systemBlock.toString()+
                "\nNow on Sale!");
    }



}
