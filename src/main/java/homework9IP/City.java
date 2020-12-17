package homework9IP;

public class City {
    private String name;
    private String state;
    private String zipCode;

    public City(String name, String state, String zipCode) {
        this.name = name;
        this.state = state;
        this.zipCode = zipCode;
    }

    public City(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void printCityInfo() {
        System.out.println("City:" +
                "\nName='" + name +
                "\nState='" + state +
                "\nZipCode='" + zipCode);
    }



}
