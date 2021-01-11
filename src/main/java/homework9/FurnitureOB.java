package homework9;

public class FurnitureOB {
    private String material;
    private String name;
    private double price;
    private int amount;
    private String color;


    public FurnitureOB(){
    }

    public FurnitureOB(String color,String material,String name,double price,int amount){
        this.material=material;
        this.amount=amount;
        this.name=name;
        this.price=price;
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public int getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void printFurniture(){
        System.out.println("Name: "+this.name+
                "\n Color: "+this.color+
                "\n Material: "+this.material+
                "\n Amount: "+this.amount+
                "\n Price: "+this.price);
    }
}
