package hm15;

public class Flowers {
    private String flowerName;

    public Flowers(String flower) {
        this.flowerName = flower;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    @Override
    public String toString() {
        return flowerName;
    }
}
