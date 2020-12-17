package homework12;

public class Memory {
    private String type;
    private int volume;

    public Memory(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}
