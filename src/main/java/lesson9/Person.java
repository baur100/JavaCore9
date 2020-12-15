package lesson9;

import java.util.Calendar;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public Person(String name, String lastName, int year){
        this.name = name;
        this.lastName = lastName;
        this.year=year;
    }
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public Person(){}

    public void setName(String name){

        this.name = name;
    }
    public String getName(){

        return name;
    }

    public void setLastName(String ln){

        lastName = ln;
    }
    public String getLastName(){

        return lastName;
    }

    public void setYear(int y){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        if(y>currentYear || y<1890){
            throw new IllegalArgumentException("Age is wrong");
        }
        year=y;
    }
    public int getYear(){
        return year;
    }
}
