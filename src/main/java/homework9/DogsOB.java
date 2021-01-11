package homework9;

public class DogsOB {
    private String breed;
    private String color;
    private int height;
    private int weight;

    public DogsOB(){
    }
    public DogsOB(String breed, String color, int height, int weight){
        this.breed=breed;
        this.color=color;
        this.height=height;
        this.weight=weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setColor (String color){
        this.color=color;
    }
    public void setHeight (int height){
        this.height=height;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
    public void printDog(){
        System.out.println(" Breed: "+this.breed+
                "\nColor: "+this.color+
                "\nHeight: "+this.height+
                "\nWeight: "+this.weight);
    }

}
