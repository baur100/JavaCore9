package hw9;

public class Animal {
    private String name;
    private String color;
    private String countryOfOrigin;

    public  Animal(String name, String color, String countryOfOrigin) {
        this.name = name;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;}

            public void setName(String name) {

            }
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){

    }

    public String getCountryOfOrigin (){
        return countryOfOrigin;

    }
    public void setCountryOfOrigin (String countryOfOrigin){

    }
    public void print (){
        System.out.println("Animal name = " + name + ", It's color = " + color + ", Country of origin = " + countryOfOrigin);
    }
}
