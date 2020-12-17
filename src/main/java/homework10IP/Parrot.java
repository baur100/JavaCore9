package homework10IP;

public class Parrot extends Animal {
    private String surface;
    public Parrot(String name, int age, String color, String surface){
        super(name, age, color);
        this.surface = surface;
    }
    public void makeSound() {
        System.out.println("chirik");
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }
}
