package homeworkInterfaceLT;

public class Vertebrates extends Animals {
    protected String population;


    public Vertebrates(String name, String scientificName, String lifeSpan, String procreation, String diet, String size, String habitat, String population) {
        super(name, scientificName, lifeSpan, procreation, diet, size, habitat);
        this.population = population;
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
    public void getPopulation(){
        System.out.println("Population: "+population);
    }

    @Override
    public void info() {
        super.info();
    }
}
