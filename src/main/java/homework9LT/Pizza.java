package homework9LT;

public class Pizza {
    private String name;
    private String size;
    private String typeOfCrust;
    private String sauce;
    private int price;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setTypeOfCrust(String typeOfCrust){
        this.typeOfCrust = typeOfCrust;
    }
    public String getTypeOfCrust(){
        return typeOfCrust;

    }
    public void setSauce(String sauce){
        this.sauce = sauce;
    }
    public String getSauce(){
        return sauce;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public Pizza(String name, String size, String typeOfCrust, String sauce, int price){
        this.name = name;
        this.size = size;
        this.typeOfCrust = typeOfCrust;
        this.sauce = sauce;
        this.price = price;

    }
    public Pizza(){}

    public void printInfo(){
        System.out.println("Name = "+name+
                "\nSize = "+size+
                "\nType of Crust = "+typeOfCrust+
                "\nSauce = "+sauce+
                "\nPrice = $"+price+
                "\nAvailable throughout the day.");
    }


}
