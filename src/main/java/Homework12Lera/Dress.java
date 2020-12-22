package Homework12Lera;

public class Dress {
    private String brand;
    private String season;
    private Store store;

    public Dress(String brand, String season, Store store) {
        this.brand = brand;
        this.season = season;
        this.store = store;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Dress{" +
                "brand='" + brand + '\'' +
                ", season='" + season + '\'' +
                ", store=" + store +
                '}';
    }


}
