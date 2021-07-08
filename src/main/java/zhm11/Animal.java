package zhm11;

public class Animal {
    protected String kind;
    protected Color color;
    protected int age;
    protected AnimalFood animalFood;

    public Animal(String kind, Color color, int age, AnimalFood animalFood) {
        this.kind = kind;
        this.color = color;
        this.age = age;
        this.animalFood=animalFood;
    }
    public void setAnimalFood(AnimalFood animalFood){
        this.animalFood=animalFood;
    }

    public AnimalFood getAnimalFood(){
        return animalFood;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "kind='" + kind + '\'' +
                ", color=" + color +
                ", age=" + age +
                ", animalFood=" + animalFood +
                '}';
    }
}
