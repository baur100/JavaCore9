package computer;

public class Disk {
 private String size;
 private String type;

    public Disk(String size, String type) {
        this.size = size;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Disk{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
