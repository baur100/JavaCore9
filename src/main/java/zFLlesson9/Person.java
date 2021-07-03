package zFLlesson9;

import java.time.Year;
import java.util.SplittableRandom;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public Person(String name, String lastName, int year){
        this.name=name;
        this.lastName=lastName;
        this.year=year;
    }
    public Person(){}

    public Person(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setYear(int y) {
        int year = Year.now().getValue();
        if (y > year || y < 1890) {
            throw new IllegalArgumentException("Age is not correct! Entered " + y + ", but current year is " + year);
        }
        year = y;
    }
    public int getYear() {
        return year;
    }
}
