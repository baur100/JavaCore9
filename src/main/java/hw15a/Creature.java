package hw15a;

public class Creature implements Life, Fungi{
    @Override
    public void proteinIncluded() {
        System.out.println("It's body build from protein");
    }

    @Override
    public void reproducible() {
        System.out.println("It is able to reproduce itself");
    }

    @Override
    public void mortality() {
        System.out.println("It has ending existance");
    }

    @Override
    public void dnaContains() {
        System.out.println("It's cells have inheritance container - DNA");
    }

    @Override
    public void reproBySpores() {
        System.out.println("It is reproducible by spores");
    }
}
