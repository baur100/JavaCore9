package homework9LT;

public class Coffee {
    private String name;
    private String brand;
    private String size;
    private double price;

    public Coffee() { //default constructor

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }


    public Coffee(String name, String size, String brand, double price){ // full constructor
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.price = price;

    }

    public void printInfo(){
        System.out.println("Name = "+name+
                "\nBrand = "+brand+
                "\nSize = "+size+
                "\nPrice = $"+price+
                "\nOnly sold at selected locations.");
    }


}
