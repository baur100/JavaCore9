package homework11OB;

public class Memory {
    private String model;
    private String size;

    public Memory(String model, String size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String toString(){
        return "\nMemory Model: "+model+"    "+"Memory Size: "+size;
    }
}
