package homework13OB;

public class DogOB implements AnimalOB {

    private String eat;

    public DogOB(String eat) {
        this.eat = eat;
    }

    @Override
    public void draw() {
        System.out.println("I draw a dog that eats: "+eat);

    }

    @Override
    public String eat() {
        return this.eat;
    }
}
