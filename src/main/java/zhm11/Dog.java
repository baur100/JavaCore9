package zhm11;

public class Dog extends Animal{
    private String collar;

    public Dog(String kind, Color color, int age, String collar, AnimalFood animalFood) {
        super(kind, color, age, animalFood);
        this.collar = collar;
    }

    public String getCollar() {
        return "has a "+collar+" collar";
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }

    @Override
    public String toString() {
        return "I have a "+color+" "+kind+" dog, "+age+" months old. It has "+ collar+" collar. Favorite food - "+animalFood;
    }
}
