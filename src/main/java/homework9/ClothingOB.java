package homework9;

public class ClothingOB {

    private String brand;
    private String type;
    private int amount;
    private int price;

    public ClothingOB(){

    }


    public ClothingOB (String type,String brand,int amount, int price){
        this.brand=brand;
        this.type=type;
        this.amount=amount;
        this.price=price;
        }
        public void setAmount(int amount){
        this.amount=amount;
        }
    public void setPrice(int price){
        this.price=price;
    }

    public int getAmount() {
        return amount;
    }
    public int getPrice(){
        return price;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }

    public void printClothing(){
        System.out.println(" Brand: "+this.brand+
                "\n Type: "+this.type+
                "\n Amount: "+this.amount+
                "\n Price: "+this.price);
    }

}

