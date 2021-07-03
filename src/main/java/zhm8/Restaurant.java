package zhm8;

public class Restaurant {
    public String restaurant;
    public String food;
    public double price;

    public void receipt(){
        System.out.println("I had at "+restaurant+" today "+food+". It was "+price+" $");
    }
}
