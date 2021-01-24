package hm12;

public class Monitor {
    private String brandMonitor;
    private double diagonal;

    public Monitor(String brandMonitor, double diagonal) {
        this.brandMonitor = brandMonitor;
        this.diagonal = diagonal;
    }

    public String getBrandMonitor() {
        return brandMonitor;
    }

    public void setBrandMonitor(String brandMonitor) {
        this.brandMonitor = brandMonitor;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brandMonitor + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }
}
