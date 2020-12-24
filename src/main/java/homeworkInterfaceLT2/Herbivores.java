package homeworkInterfaceLT2;

public abstract class Herbivores extends Carnivores implements Mammals{

    public Herbivores(String name, String scientificName) {
        super(name, scientificName);
    }

    @Override
    public void rearingYoung() {
        super.rearingYoung();
    }

    @Override
    public void physicalCharacteristics() {
        super.physicalCharacteristics();
    }

    @Override
    public void getHabitat() {
        super.getHabitat();
    }

    @Override
    public void info() {
        super.info();
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
}
