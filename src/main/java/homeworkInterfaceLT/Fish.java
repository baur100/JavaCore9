package homeworkInterfaceLT;

public class Fish extends Vertebrates{


    public Fish(String name, String scientificName, String lifeSpan, String procreation, String diet, String size, String habitat, String population) {
        super(name, scientificName, lifeSpan, procreation, diet, size, habitat, population);
    }

    @Override
    public void getLifeSpan() {
        super.getLifeSpan();
    }

    @Override
    public void getDiet() {
        super.getDiet();
    }

    @Override
    public void getProcreation() {
        super.getProcreation();
    }

    @Override
    public void getSize() {
        super.getSize();
    }

    @Override
    public void getHabitat() {
        super.getHabitat();
    }

    @Override
    public void getPopulation() {
        super.getPopulation();
    }

    @Override
    public void info() {
        super.info();
    }
}
