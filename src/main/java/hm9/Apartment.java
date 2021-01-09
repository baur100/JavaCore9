package hm9;

public class Apartment {
    private String typeOfApartment;
    private int bedrooms;
    private int costRent;

    public Apartment(String typeOfApartment, int bedrooms, int costRent) {
        this.typeOfApartment = typeOfApartment;
        this.bedrooms = bedrooms;
        this.costRent = costRent;
    }

    public Apartment() {
    }

    public void setTypeOfApartment(String typeOfApartment) {
        this.typeOfApartment = typeOfApartment;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setCostRent(int costRent) {
        this.costRent = costRent;
    }

    public String getTypeOfApartment() {
        return this.typeOfApartment;
    }

    public int getBedrooms() {
        return this.bedrooms;
    }

    public int getCostRent() {
        return this.costRent;
    }

    public void printApartment() {
        System.out.println("Apartment type:" + getTypeOfApartment() + " Bedrooms:" + getBedrooms() + " Renting cost:" + getCostRent());
    }
}
