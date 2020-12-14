package homework9LT;

import java.awt.*;

public class Shoes{
    private String name;
    private String brand;
    private String type;
    private String color;
    private int price;

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setType (String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setColor (String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setPrice (int price){
        this.price = price;
    }
    public int getPrice() {
        if (price < 20){
            throw new IllegalArgumentException(price+ "is too low");
        }
        return price;
    }
    public Shoes(String name, String brand, String type, String color, int price){
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public Shoes(){}

    public void printInfo(){
        System.out.println("Name = "+name+
                "\nBrand = "+brand+
                "\nType = "+type+
                "\nColor = "+color+
                "\nPrice = $"+price+
                "\nAvailable in all sizes.");
    }






}
