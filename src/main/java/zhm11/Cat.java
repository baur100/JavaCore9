package zhm11;

public class Cat extends Animal{
    private String catFavoriteToy;

    public Cat(String kind, Color color, int age, String catFavoriteToy, AnimalFood animalFood){
        super(kind, color, age, animalFood);
        this.catFavoriteToy=catFavoriteToy;
    }

    public void setCatFavoriteToy(String catFavoriteToy){
        this.catFavoriteToy=catFavoriteToy;
    }

    public String getCatFavoriteToy(){
        return catFavoriteToy;
    }
    @Override
    public String toString() {
        return "I have a "+color+" "+kind+" cat, "+age+" months old. "+ catFavoriteToy+" is a favorite toy. Favorite food - "+animalFood;
    }
}
