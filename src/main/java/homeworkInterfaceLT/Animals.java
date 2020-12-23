package homeworkInterfaceLT;

public class Animals extends Bacteria {

     protected String habitat;


    public Animals(String name, String scientificName, String lifeSpan, String procreation, String diet, String size, String habitat) {
        super(name, scientificName, lifeSpan, procreation, diet, size);
        this.habitat = habitat;
    }

    @Override
    public void getLifeSpan() {
        super.getLifeSpan();
    }

    @Override
    public void getDiet() {
        System.out.println("Diet: They "+diet);
    }

    @Override
    public void getProcreation() {
        super.getProcreation();
    }

    @Override
    public void getSize() {
        super.getSize();
    }
    public void getPopulation(){

    }

    public void getHabitat(){
        System.out.println("Habitat: They can be found "+habitat);
    }

    @Override
    public void info() {
        System.out.println("Name: "+name+", "+scientificName
                );
    }
}
