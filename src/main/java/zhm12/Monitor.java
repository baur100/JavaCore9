package zhm12;

public class Monitor {
    private String brand;
    private int diagonal;

    public Monitor(String brand, int diagonal) {
        this.brand = brand;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }
}
