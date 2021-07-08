package zhm11;

import java.util.Arrays;

public class AnimalFood {
    private Flavors[] flavors;
    private int size;

    public AnimalFood(Flavors[] flavors, int size) {
        this.flavors = flavors;
        this.size = size;
    }

    public Flavors[] getFlavors() {
        return flavors;
    }

    public void setFlavors(Flavors[] flavors) {
        this.flavors = flavors;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AnimalFood{" +
                "flavors=" + Arrays.toString(flavors) +
                ", size=" + size +
                '}';
    }
}
