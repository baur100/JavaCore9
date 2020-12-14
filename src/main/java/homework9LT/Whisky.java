package homework9LT;

public class Whisky {
    private String name;
    private int age;
    private String region;
    private int price;
    private String type;

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public void setRegion(String region){
        this.region = region;

    }
    public String getRegion(){
        return region = region;

    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;

    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public Whisky(String name, String region, int age, int price, String type){
        this.name = name;
        this.region = region;
        this.age = age;
        this.type = type;
        this.price = price;

    }

    public Whisky(){}



    public void printInfo(){
        System.out.println("Name = "+name+
        "\nRegion = "+region+
        "\nType = "+type+
                "\nAge = "+age+"yrs"+
                "\nPrice = "+price+
        "\nSold in Costco Superstores");
    }



}
