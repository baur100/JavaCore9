package zhm8;

public class Supermarket {
    public String supermarket;
    public String item;
    public double price;

    public void print_supermarketList(){
        System.out.println("Please grab some "+item+" from "+supermarket+". It should be $"+price+". Thanks!");
    }

}
