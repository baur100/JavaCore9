package homeworkInterfaceLT;

public class Plants extends Bacteria {

    protected String type;


    public Plants(String name, String scientificName, String lifeSpan, String procreation, String diet, String size, String type) {
        super(name, scientificName, lifeSpan, procreation, diet, size);
        this.type = type;
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
        System.out.println("Name: "+name+", "+scientificName+
        "\nType: "+type);
    }
}



