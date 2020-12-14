package homework9;

public class PersonI {
    private String name;
    private String lastName;
    private int year;

    public PersonI (String name, String lastName, int year){
        this.name=name;
        this.lastName=lastName;
        this.year = year;
    }

    public void setName (String n){
        this.name= name;

    }
    public String getName(){
        return name;

    }
    public void setLastName (String ln){
        this.lastName = lastName;
    }
    public String getLastName(String ln){
        return lastName;

    }
    public void setYear (int y){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public String getLastName(){
        return lastName;
    }
    public PersonI(){

    }
    public void printInfo(){
        System.out.println("Name="+ this.name +"\nLastName="+ this.lastName+
                "\nYear="+ this.year);
    }
}
