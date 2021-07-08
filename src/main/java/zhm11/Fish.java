package zhm11;

public class Fish extends Animal{
    private String waterType;

    public Fish(String kind, Color color, int age, AnimalFood animalFood, String waterType){
        super(kind, color, age,animalFood);
        this.waterType=waterType;
    }

    public void setWaterType(String waterType){
        this.waterType=waterType;
    }

    public String getWaterType(){
        return waterType;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "waterType='" + waterType + '\'' +
                ", kind='" + kind + '\'' +
                ", color=" + color +
                ", age=" + age +
                ", animalFood=" + animalFood +
                '}';
    }
}
