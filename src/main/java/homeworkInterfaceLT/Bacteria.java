package homeworkInterfaceLT;

public class Bacteria extends Fungi implements Life {


    public Bacteria(String name, String scientificName, String lifeSpan, String procreation, String diet, String size) {
        super(name, scientificName, lifeSpan, procreation, diet, size);
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
    public void info() {
        super.info();
    }

}
