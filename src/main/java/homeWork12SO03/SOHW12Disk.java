package homeWork12SO03;

public class SOHW12Disk {
    private String brand;

    public SOHW12Disk(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String toString() {
        return "\nDisk - " + brand;
    }

}
