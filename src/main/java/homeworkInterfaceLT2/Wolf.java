package homeworkInterfaceLT2;

public class Wolf extends Lion{
    public Wolf(String name, String scientificName) {
        super(name, scientificName);
    }

    @Override
    public void rearingYoung() {
        System.out.println("Wolf pups are reared together by the whole pack");
    }

    @Override
    public void physicalCharacteristics() {
        System.out.println("Wolves are the largest of the wild dogs");
    }

    @Override
    public void getHabitat() {
        System.out.println("Wolves live in the dense forested areas");
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void getLifeSpan() {
        System.out.println("Wolves can live up to 13 to 15 years");
    }

    @Override
    public void getDiet() {
        System.out.println("Lions have a heavy meat diet and will look at all game available to the pride");
    }

    @Override
    public void getProcreation() {
        System.out.println("Wolves have an alpha male who mates with the alpha female");
    }

    @Override
    public void getSize() {
        System.out.println("Wolves can grow up to 5 feet in length");
    }
}
