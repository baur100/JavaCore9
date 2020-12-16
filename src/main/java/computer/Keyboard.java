package computer;

public class Keyboard {
    private String numberPad;
    private String lit;

    public Keyboard(String numberPad, String lit) {
        this.numberPad = numberPad;
        this.lit = lit;
    }

    public String getNumberPad() {
        return numberPad;
    }

    public void setNumberPad(String numberPad) {
        this.numberPad = numberPad;
    }

    public String getLit() {
        return lit;
    }

    public void setLit(String lit) {
        this.lit = lit;
    }
}

