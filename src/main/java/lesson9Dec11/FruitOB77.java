package lesson9Dec11;

public class FruitOB77 {
    private String fruitName;
    private String countryOfOrigin;

    public FruitOB77 (String fruitName, String countryOfOrigin){
        this.fruitName = fruitName;
        this.countryOfOrigin = countryOfOrigin;
    }
    public String getFruitName(){
        return fruitName;
    }
    public void setFruitName(String fruitName){
        this.fruitName = fruitName;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    public void setCountryOfOrigin(String countryOfOrigin){
        this.countryOfOrigin = countryOfOrigin;
    }
    public void printMe(){
        System.out.println("This is "+this.fruitName + " from " + this.countryOfOrigin); // or may be
        // System.out.println("This is "+ fruitName + " from" + countryOfOrigin); both are correct
    }
}
