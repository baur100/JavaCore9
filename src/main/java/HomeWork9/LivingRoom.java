package HomeWork9;



public class LivingRoom {
    private  String name;
    private  int numberOfGuest;
    private String color;

    public LivingRoom(String name, String color, int numberOfGuest){
        this.name = name;
        this.color = color;
        this.numberOfGuest   = numberOfGuest;

    }
    public LivingRoom(){}

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return this.name;
    }
    public void setNumberOfGuest(int numberOfGuest){
        this.numberOfGuest = numberOfGuest;

}
    public int getNumberOfGuest(){
        return this.numberOfGuest;

    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
