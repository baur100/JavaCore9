package zhm12;

public class SystemBlock {
    private Motherboard motherboard;
    private Disk disk;

    public SystemBlock(Motherboard motherboard, Disk disk) {
        this.motherboard = motherboard;
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "motherboard=" + motherboard +
                ", disk=" + disk +
                '}';
    }
}
