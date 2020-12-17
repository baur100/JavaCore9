package lesson9Dec11;

import java.util.Calendar;

public class PersonOB077 {
    private String name; // encapsulation (private instead public)
    private String lastName;
    private int year;

    //CONSTRUCTOR:
    public PersonOB077(String n,String l, int y){
        name = n;
        lastName=l;
        year=y;
    }


    public void setName(String nam) {
        // special method. It's public, but we set values from private (look above)
        name = nam;
    }

    public String getName() {
        return (name);
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
            throw new IllegalArgumentException("Age is wrong");// here we make sure that the year is correct, not -1500
            //so if user put -1500 it will show an error:"Age is wrong"
        }
        year=y;
    }
    public int getYear(){
        return year;
    }


    }




   /* public PersonOB077 (String name, String lastName, int year){
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
}*/
