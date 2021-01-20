package hm11;

import java.util.Arrays;

public class Fish extends Animal{
    private Color[] color;
    private TypeOfWater waterType;

    public Fish(String animalName, Breed animalBreed, int animalAge, FoodBrands animalFood, Color[] color, TypeOfWater waterType) {
        super(animalName, animalBreed, animalAge, animalFood);
        this.color = color;
        this.waterType = waterType;
    }


    @Override
    public String toString() {
        return "Fish{" +
                "color=" + Arrays.toString(color) +
                ", waterType=" + waterType +
                ", animalName='" + animalName + '\'' +
                ", animalBreed=" + animalBreed +
                ", animalAge=" + animalAge +
                ", animalFood=" + animalFood +
                '}';
    }
}
