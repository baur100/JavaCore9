package homework8LT;

public class Apparel {

    public String name;
    public String producedIn;
    public int price;
    public String market;




    public void yesExpensive(){
        if (price>50){
            System.out.println(name+" at $"+price+" which is made in "+producedIn+" for "+market+" is expensive");
        }else {
            System.out.println(name+" at $"+price+" which is made in "+producedIn+" for "+market+" is reasonable");
        }
    }
}
