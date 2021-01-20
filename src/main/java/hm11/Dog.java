package hm11;

public class Dog extends Animal {
    private ServiceDog serviceDog;
    private String favoriteToy;

    public Dog(String animalName, Breed animalBreed, int animalAge, FoodBrands animalFood, ServiceDog serviceDog, String favoriteToy) {
        super(animalName, animalBreed, animalAge, animalFood);
        this.serviceDog = serviceDog;
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "serviceDog=" + serviceDog +
                ", favoriteToy='" + favoriteToy + '\'' +
                ", animalName='" + animalName + '\'' +
                ", animalBreed=" + animalBreed +
                ", animalAge=" + animalAge +
                ", animalFood=" + animalFood +
                '}';
    }
}
