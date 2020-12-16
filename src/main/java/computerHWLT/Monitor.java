package computerHWLT;

public class Monitor {
    private String name;
    private String display;
    private int size;

    public Monitor(String name, String display, int size) {
        this.name = name;
        this.display = display;
        this.size = size;
    }
    public Monitor(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "name: " + name +
                ", display: " + display +
                ", size: " + size+" in"
                ;
    }
}
