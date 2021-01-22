package homework13OB;

public class CatOB implements AnimalOB {

    private String eat;

    public CatOB(String eat) {
        this.eat = eat;
    }

    @Override
    public void draw() {
        System.out.println("I draw a cat that eats: "+eat());

    }

    @Override
    public String eat() {
        return eat;
    }
}
