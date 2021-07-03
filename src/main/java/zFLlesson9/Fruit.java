package zFLlesson9;

public class Fruit {
    private String fruitName;
    private String countryOfOrigin;

    public Fruit(String fruitName, String countryOfOrigin) {
        this.fruitName = fruitName;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void printMe(){
        System.out.println("Fruit name: "+fruitName+", country of origin: "+countryOfOrigin);
    }
}
