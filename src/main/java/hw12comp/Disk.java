package hw12comp;

public class Disk {

    private int speed;
    private String size;

    public Disk(int speed, String size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "\nspeed=" + speed +
                "\nsize=" + size + '\''+ "}";
    }
}
