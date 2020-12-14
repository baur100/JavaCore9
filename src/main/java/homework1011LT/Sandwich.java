package homework1011LT;

public class Sandwich {
    private String name;
    Meats type;
    Cheese additional;

    public Sandwich(String name, Meats type, Cheese additional){
        this.name = name;
        this.type = type;
        this.additional = additional;
    }
    public Sandwich(){}

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public  void setType(Meats type){
        this.type = type;
    }
    public Meats getType(){
        return type;
    }
    public void setAdditional(Cheese additional){
        this.additional = additional;
    }
    public Cheese getAdditional(){
        return additional;
    }

    public void mySandwich(){
        System.out.println("Sandwich = "+name+
                "\nMeat = "+type+
                "\nCheese = "+additional);


    }
}
