package homework13;

import org.w3c.dom.ls.LSOutput;

public class Giraffe implements Animal {
    public String eat;
    public String sound;


    @Override
    public void eat() {
        System.out.println("Giraffe eats leaves");

    }

    @Override
    public void sound() {
        System.out.println("Giraffe sounds hum");

    }

}
