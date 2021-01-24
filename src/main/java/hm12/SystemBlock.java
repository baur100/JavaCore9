package hm12;

public class SystemBlock {
    protected MotherBoard motherBoard;
    protected String disk;

    public SystemBlock(MotherBoard motherBoard, String disk) {
        this.motherBoard = motherBoard;
        this.disk = disk;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "SystemBlock {" +
                motherBoard +
                ", disk='" + disk + '\'' +
                '}';
    }
}
