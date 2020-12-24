package homeworkInterfaceLT2;

import javax.sound.sampled.spi.AudioFileReader;

public class App {
    public static void main(String[] args) {
        Lion africanLion = new Lion("African Lion", "Panthera lio");
        Wolf greyWolf = new Wolf("Grey Wolf ", "Canis lupus");
        BlueWhale blueWhale = new BlueWhale("Blue Whale", "Balaenoptera musculus");

        Mammals[] all = {africanLion, greyWolf, blueWhale};

        for (Mammals zz: all){
            zz.info();
            zz.physicalCharacteristics();
            zz.getSize();
            zz.getHabitat();
            zz.getLifeSpan();
            zz.getDiet();
            zz.getProcreation();
            zz.rearingYoung();
            System.out.println("++++++++++++++++++++++++++++++++");


        }
    }
}
