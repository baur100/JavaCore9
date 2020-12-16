package lesson9SO03;

import java.util.Calendar;

public class SO03L9Person {
    private String name;
    private String lastName;
    private int year;

    public SO03L9Person(String name, String lastName, int year){
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }
    public SO03L9Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public SO03L9Person(){

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setYear(int year){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        if(year>currentYear || year<1890){
            throw new IllegalArgumentException("Age is wrong");
        }
        this.year = year;
    }
    public int getYear(){
        return year;
    }

}
