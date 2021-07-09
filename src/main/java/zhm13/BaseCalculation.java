package zhm13;

public abstract class BaseCalculation implements Price{
    protected int age;
    protected double baseRate;

    public BaseCalculation(int age, double baseRate) {
        this.age = age;
        this.baseRate = baseRate;
    }

}
