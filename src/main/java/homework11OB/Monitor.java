package homework11OB;

public class Monitor {
    private String diagonal;
    private String brand;

    public Monitor(String diagonal, String brand) {
        this.diagonal = diagonal;
        this.brand = brand;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String toString(){
        return "Brand: "+brand+"      "+
                "Diagonal:"+diagonal;
    }

}
