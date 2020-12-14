package homework1011LT;

import java.util.Arrays;

public class Pizza {
    private String name;
    private String size;
    private Meats[] type;
    private Cheese[] additional;

    public Pizza(String name, String size, Meats[] type, Cheese[] additional) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.additional = additional;
    }
    public Pizza(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Meats[] getType() {
        return type;
    }

    public void setType(Meats[] type) {
        this.type = type;
    }

    public Cheese[] getAdditional() {
        return additional;
    }

    public void setAdditional(Cheese[] additional) {
        this.additional = additional;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", type=" + Arrays.toString(type) +
                ", additional=" + Arrays.toString(additional) +
                '}';
    }
}
