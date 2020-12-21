package homework13;

public class Frog implements Animal{
   public String eat;
   public String sound;

    @Override
    public void eat() {
        System.out.println("Frog eats fly");
    }

    @Override
    public void sound() {
        System.out.println("Frog croak");

    }
}


