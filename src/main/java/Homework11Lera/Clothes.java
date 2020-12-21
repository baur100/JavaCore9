package Homework11Lera;

public class Clothes {
    private String name;
    private String brand;
    private String material;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public Clothes(String name, String brand, String material, Colors red) {
        this.name = name;
        this.brand = brand;
        this.material = material;




    }
}
