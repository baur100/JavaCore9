package homeworkInterfaceLT2;

import javax.sound.midi.Soundbank;

public class Lion extends Carnivores{
    public Lion(String name, String scientificName) {
        super(name, scientificName);
    }

    @Override
    public void rearingYoung() {
        System.out.println("Lion cubs are pack-reared so that the cubs will related to all lionesses in the pride");
    }

    @Override
    public void physicalCharacteristics() {
        System.out.println("Lions are one of the largest cats in the animal kingdom");
    }

    @Override
    public void getHabitat() {
        System.out.println("Lions are mostly located in Central and Southern Africa");
    }

    @Override
    public void info() {
        System.out.println("Name: "+name+
        "\nScientific Name: "+scientificName);
    }

    @Override
    public void getLifeSpan() {
        System.out.println("Lions generally live from 15 to 20 years");
    }

    @Override
    public void getDiet() {
        System.out.println("Lions have a heavy meat diet and will look at all game available to the pride");
    }

    @Override
    public void getProcreation() {
        System.out.println("Male lions with fight between themselves to determine who will mate with the lionesses");
    }

    @Override
    public void getSize() {
        System.out.println("Lions can grow from 6 to 8 feet in length");
    }
}
