package computer;

import java.util.Arrays;

public class Keyboard {
    private String numberPad;
    private Colors colors;

    public Keyboard(String numberPad, Colors colors) {
        this.numberPad = numberPad;
        this.colors = colors;
    }

    public String getNumberPad() {
        return numberPad;
    }

    public void setNumberPad(String numberPad) {
        this.numberPad = numberPad;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "numberPad='" + numberPad + '\'' +
                ", colors=" + colors +
                '}';
    }
}



