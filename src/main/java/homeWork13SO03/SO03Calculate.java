package homeWork13SO03;

public class SO03Calculate implements SO03HW13Distance{
    protected double speed;
    protected double time;

    public SO03Calculate(double speed, double time) {
        this.speed = speed;
        this.time = time;
    }

    @Override
    public void calculate() {
        System.out.println("If you go with " + this.speed + " MpH " + "for " + this.time + " hours." + " Then you will cover distance = " +getDistance());
    }

    @Override
    public double getDistance() {
        return this.speed*this.time;
    }
}
