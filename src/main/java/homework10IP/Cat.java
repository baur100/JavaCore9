package homework10IP;

public class Cat extends Animal {
    private String breed;
    public Cat(String name, int age, String color, String breed){
        super(name, age, color);
        this.breed = breed;
    }
    public void makeSound() {
        System.out.println("meow");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
