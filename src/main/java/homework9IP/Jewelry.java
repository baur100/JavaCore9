package homework9IP;

public class Jewelry {
    private String type;
    private String metal;
    private String  price;

    public Jewelry(String type, String metal, String  price) {
        this.type = type;
        this.metal = metal;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String  price) {
        this.price = price;
    }

    public void printJewelryInfo(){
        System.out.println("Jewelry: " +
                "\nType:" + type +
                "\nMetal:" + metal +
                "\nPrice:" + price);
    }

    public void printJewelryType(){
        System.out.println("Gold " +type+ " looks beautiful");
    }
}
