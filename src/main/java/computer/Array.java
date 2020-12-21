package computer;

import java.util.Arrays;

public class Array {
    private String[] arr = {"comp", "comp1","comp3"};

    public Array(String[] arr) {
        this.arr = arr;
    }

    public Array() {

    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Array{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

