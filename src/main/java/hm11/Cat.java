package hm11;

public class Cat extends Animal{
    private int lives;

    public Cat(String animalName, Breed animalBreed, int animalAge, FoodBrands foodBrand, int lives) {
        super(animalName, animalBreed, animalAge,foodBrand);
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "lives=" + lives +
                ", animalName='" + animalName + '\'' +
                ", animalBreed=" + animalBreed +
                ", animalAge=" + animalAge +
                ", animalFood=" + animalFood +
                '}';
    }
}
