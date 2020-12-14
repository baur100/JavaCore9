package HomeWork9;

public class Bedroom {
    private String name;
    private int size;
    private int numberOfBathrooms;


    public void setName(String n){
name = n;
    }
    public String getName(){
        return name;
    }
    public void setSize(int sz){
        if(sz>10000 || sz <300 ){
            throw new IllegalArgumentException("Select legal size");
        }
        size = sz;
    }
    public int getSize(){
        return size;
    }
    public void setNumberOfBathrooms(int number){
        numberOfBathrooms = number;
    }
    public int getNumberOfBathrooms(){
        return numberOfBathrooms;
    }
}
