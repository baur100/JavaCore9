package computer;

public class SystemBlock {
    private Motherboard motherboard;
    private Disk disk;

    public SystemBlock(Motherboard motherboard, Disk disk) {
        this.motherboard = motherboard;
        this.disk = disk;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }
}

