package homeworkInterfaceLT2;

public class BlueWhale extends Herbivores{
    public BlueWhale(String name, String scientificName) {
        super(name, scientificName);
    }

    @Override
    public void rearingYoung() {
        System.out.println("Blue whale cows will nurse their calf for about 7 months  ");
    }

    @Override
    public void physicalCharacteristics() {
        System.out.println("Blue whales are the biggest Mammals in the animal kingdom ");
    }

    @Override
    public void getHabitat() {
        System.out.println("Blue whales have a migration patter that will take them across the entire Pacific Ocean");
    }

    @Override
    public void info() {
        System.out.println("Name: "+name+
                "\nScientific Name: "+scientificName);
    }

    @Override
    public void getLifeSpan() {
        System.out.println("Blue whales can live up to 73 years");
    }

    @Override
    public void getDiet() {
        System.out.println("Blue whales main food are sea insects called krills");
    }

    @Override
    public void getProcreation() {
        System.out.println("Blue whales are monogamous and females give birth to only 1 calf per cycle");
    }

    @Override
    public void getSize() {
        System.out.println("Blue whales can grow up to 300 feet in length");
    }
}
