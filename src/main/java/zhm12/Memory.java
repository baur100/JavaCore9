package zhm12;

public class Memory {
    private String brand;
    private int memorySize;

    public Memory(String brand, int memorySize) {
        this.brand = brand;
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "brand='" + brand + '\'' +
                ", memorySize=" + memorySize +
                '}';
    }
}
