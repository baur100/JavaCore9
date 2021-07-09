package zhm12;

public class Disk {
    private int ram;

    public Disk(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "ram=" + ram +
                '}';
    }
}
