package homeWork12SO03;

public class SO03HW12SystemBlock {
    private SO03HW23Motherboard motherboard;
    private SOHW12Disk disk;

    public SO03HW12SystemBlock(SO03HW23Motherboard motherboard, SOHW12Disk disk) {
        this.motherboard = motherboard;
        this.disk = disk;
    }

    public SO03HW23Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(SO03HW23Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public SOHW12Disk getDisk() {
        return disk;
    }

    public void setDisk(SOHW12Disk disk) {
        this.disk = disk;
    }


    public String toString() {
        return "\nMotherboard - " + motherboard + " " + disk;
    }
}
