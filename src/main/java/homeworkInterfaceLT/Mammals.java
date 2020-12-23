package homeworkInterfaceLT;

public class Mammals extends Vertebrates {

    protected String numberOfOffSpring;


    public Mammals(String name, String scientificName, String lifeSpan, String procreation, String diet, String size, String habitat, String population, String numberOfOffSpring) {
        super(name, scientificName, lifeSpan, procreation, diet, size, habitat, population);
        this.numberOfOffSpring = numberOfOffSpring;
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

    public void getNumberOFoFSpring(){
        System.out.println("Offspring: They produce "+numberOfOffSpring+" per cycle");
    }



    @Override
    public void info() {
        super.info();
    }




}
