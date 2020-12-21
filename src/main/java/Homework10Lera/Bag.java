package Homework10Lera;

public final class Bag extends Saks {

    private int waitList;

    public Bag(String item, String color, String collection, int waitList, int price) {
        super(item,color,collection,price);

        this.waitList = price;
    }


    public int getPrice() {
        return waitList;
    }

    public void setPrice(int price) {
        this.waitList = price;
    }
}
