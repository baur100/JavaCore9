package homeworkInterfaceLT;

import java.security.spec.RSAOtherPrimeInfo;

public class Fungi implements Life {
    protected String name;
    protected String scientificName;
    protected String lifeSpan;
    protected String procreation;
    protected String diet;
    protected String size;

    public Fungi(String name, String scientificName, String lifeSpan, String procreation, String diet, String size) {
        this.name = name;
        this.scientificName = scientificName;
        this.lifeSpan = lifeSpan;
        this.procreation = procreation;
        this.diet = diet;
        this.size = size;
    }

    @Override
    public void getLifeSpan() {
        System.out.println("Life Span: They can live from "+lifeSpan);

    }

    @Override
    public void getDiet() {
        System.out.println("Diet: They thrive "+diet );

    }

    @Override
    public void getProcreation() {
        System.out.println("Reproduction: They reproduce by "+procreation);

    }

    @Override
    public void getSize() {
        System.out.println("Size: They can grow "+size);

    }
    public void info(){
        System.out.println("Name: "+name+", "+scientificName
                );



    }
}
