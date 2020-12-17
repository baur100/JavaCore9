package lesson9Dec11;

public class VehicleOB77 {
    private String brand;
    private String model;
    private int year;

    public void setYear(int year){
        //year=year (one from private int year, another from setYear(int year),
        //to distinguish them we write it down:
        this.year = year;     //here this.year is used for class variable (private int year)
    }
    public void setBrand (String brand){
        this.brand = brand;
    }
    public void setModel (String model){
        this.model = model;
    }

    public int getYear() {
        return year; // if don't want to expose year, getter may be removed or modified: return:"This is secret info";
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
}
