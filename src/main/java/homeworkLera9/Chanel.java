package homeworkLera9;

public class Chanel {
    private String item;
    private String collection;
    private int price;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Chanel(String item, String collection, int price) {
        this.item = item;
        this.collection = collection;
        this.price = price;

    }

}
