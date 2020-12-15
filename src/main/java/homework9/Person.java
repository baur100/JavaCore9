package homework9;

public class Person {
    private  String name;
    private String lastName;
    private int year;

//    public void setName(String n){
//        name = n;
//    }
//    public String getName(){
//   return name;
//    }
//
//    public void setLastName(String ln){
//        lastName = ln;
//    }
//    public String getLastName(){
//        return lastName;
//    }
//    public void setYear(int y){
//        year = y;
//    }
//    public int getYear(){
//        return year;
//    }
//    public Person(String n, String l, int y){
//        name = n;
//        lastName = l;
//        year = y;
//    }
    public Person(){}

    public Person(String name, String lastName, int year){
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public int getYear(){
        return year;
    }
}
