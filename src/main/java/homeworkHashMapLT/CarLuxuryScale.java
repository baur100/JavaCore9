package homeworkHashMapLT;



public class CarLuxuryScale {
    private String level;
    private String price;
    private  String production;

    public CarLuxuryScale(String level, String price, String production) {
        this.level = level;
        this.price = price;
        this.production = production;
    }

    @Override
    public String toString() {
        return
                 level +
                ", price: " + price +
                ", production: " + production
               ;
    }
}
