package computerHWLT;

public class Processor {
    protected String name;
    protected String model;
    protected double speed;

    public Processor(String name, String model, double speed) {
        this.name = name;
        this.model = model;
        this.speed = speed;
    }
    public Processor(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return
                "name: " + name +
                ", model: " + model +
                ", speed: " + speed +"gHz"
                ;
    }
}
