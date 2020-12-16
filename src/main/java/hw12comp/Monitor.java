package hw12comp;

public class Monitor {

    private int diagonal;
    private String brand;

    public Monitor(int diagonal, String brand) {
        this.diagonal = diagonal;
        this.brand = brand;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "\ndiagonal=" + diagonal +
                "\nbrand='" + brand + '\'';
    }
}
