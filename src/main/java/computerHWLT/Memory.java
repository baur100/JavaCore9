package computerHWLT;

public class Memory {
    protected String name;
    protected int size;

    public Memory(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public Memory(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", size: " + size + "gB"
                ;
    }
}
