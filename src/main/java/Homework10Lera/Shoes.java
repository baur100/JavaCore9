package Homework10Lera;

public class Shoes extends Saks {
    private int size;


    public Shoes(String item, String color, String collection, int price, int size) {
        super(item,color,collection,price);

        this.size = size;

    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
