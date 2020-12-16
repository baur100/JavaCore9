package HomeWork10_11;

public class WildAnimals extends Animals {
    private int speed;

    public WildAnimals(String bread, String habitat, String diet, int speed) {
        super(bread, habitat, diet);
        this.speed = speed;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}









