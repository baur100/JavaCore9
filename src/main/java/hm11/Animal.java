package hm11;

public class Animal {
    protected String animalName;
    protected Breed animalBreed;
    protected int animalAge;
    protected FoodBrands animalFood;

    public Animal(String animalName, Breed animalBreed, int animalAge, FoodBrands animalFood) {
        this.animalName = animalName;
        this.animalBreed = animalBreed;
        this.animalAge = animalAge;
        this.animalFood=animalFood;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Breed getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(Breed animalBreed) {
        this.animalBreed = animalBreed;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public FoodBrands getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(FoodBrands animalFood) {
        this.animalFood = animalFood;
    }
}
