package homework11OB;

public class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString(){
        return "\nProcessor model: "+model;
    }
}
