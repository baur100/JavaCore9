package computer;

public class Memory {
    private int memorySize;
    private String type;

    public Memory(int memorySize, String type) {
        this.memorySize = memorySize;
        this.type = type;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
