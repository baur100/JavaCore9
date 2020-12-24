package homework17;

public class Lion extends Carnivores {

    @Override
    public void fur() {
        System.out.println("Fur");
    }

    @Override
    public void reproduction() {
        System.out.println("Once a year ");

    }

    @Override
    public void grow() {
        System.out.println("From cell");

    }

    @Override
    public void breathe() {
        System.out.println("Breath");

    }

    @Override
    public void eat() {
        System.out.println("Eat meat or smaller animals");

    }

    @Override
    public void breed() {
        System.out.println("Every year");

    }

    @Override
    public void die() {
        System.out.println("At age 15");

    }
}
