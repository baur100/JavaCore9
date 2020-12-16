package computerHWLT;

public class Disk {
    protected String name;
    protected String type;
    protected int size;

    public Disk(String name, String type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }
    public Disk(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
                ", type: " + type + '\'' +
                ", size: " + size +"tB"
                ;
    }
}
