package homework11OB;

public class Disk {
    private String model;

    public Disk(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString(){
        return "\nDisk model: "+model;
    }
}
