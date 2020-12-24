package homework17;

public class Wolf extends Carnivores {

    @Override
    public void fur() {
        System.out.println("Fur is gray");
    }

    @Override
    public void reproduction() {
        System.out.println("Once each year");

    }

    @Override
    public void grow() {
        System.out.println("Grow from cell");

    }

    @Override
    public void breathe() {
        System.out.println("Breath");

    }

    @Override
    public void eat() {
        System.out.println("Eat meat");


    }

    @Override
    public void breed() {
        System.out.println("Breed once each year");

    }

    @Override
    public void die() {
        System.out.println("Live 13 years");

    }
}
