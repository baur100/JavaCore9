package zhm9;

public class Supermarket {
    private String supermarket;
    private String item;
    private double price;

    public Supermarket(){}

    public Supermarket(String supermarket, String item, double price){
        this.supermarket=supermarket;
        this.item=item;
        this.price=price;
    }

    public void setSupermarket(String supermarket){
        this.supermarket=supermarket;
    }
    public String getSupermarket(){
        return supermarket;
    }

    public void setItem(String item){
        this.item=item;
    }
    public String getItem(){
        return item;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    private String printInfo(){
        return "Please grab some "+item+" from "+supermarket+". It should be $"+price+". Thanks!";
    }
    public void printClass(){
        System.out.println(printInfo());
    }
}
