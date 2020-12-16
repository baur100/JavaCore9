package HomeWork10_11;
//          1. Create a super class and 3 child classes
//        create 2 object of each class (including superclass - don't make it abstract)
//
//        2
//        Create 2 Enums, Create 2 classes. First using Enum, Second Array of Enums as a Field

public class Animals {
    protected  String bread;
    protected  String habitat;
    protected String diet;

    public Animals(String bread, String habitat, String diet) {
        this.bread = bread;
        this.habitat = habitat;
        this.diet = diet;
    }

    public Animals(String bread, String habitat) {
        this.bread = bread;
        this.habitat = habitat;
    }

    public Animals() {

    }

    public String getBread() {
        return bread;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
