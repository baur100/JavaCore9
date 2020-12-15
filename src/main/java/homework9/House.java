package homework9;

public class House {
    private String city;
    private String state;
    private int year;

    public House(String city, String state, int year) {
        this.city = city;
        this.state = state;
        this.year = year;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getYear() {
        return year;
    }

    public House() {
    }
    public void printInfo(){
        System.out.println("City= "+ this.city + "\nState = "+ this.state + "\nYear= "+ this.year);
    }

}
