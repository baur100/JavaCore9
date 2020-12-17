package homework10IP;

public class Dog extends Animal {
    private String breed;
    public Dog(String name, int age, String color, String breed){
        super(name, age, color);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("barking");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
