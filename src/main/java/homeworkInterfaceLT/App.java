package homeworkInterfaceLT;

import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {
        Fungi mushroom = new Fungi("Mushroom", "Agaricus bisporus", "1 to 10 days", "Spore Production", " in damp and moist soil ", "1 to 3 inches in height and cap diameter of 1 to 4 inches ");
        Bacteria tuberculosis = new Bacteria("Tuberculosis", " Mycobacterium tuberculosis ", "Without treatment, Tuberculosis generally kills the patient within 5years","airborne transmission to an unsuspecting host", "in the pulmonary systems where it grows and feed on the cells around it, destroying the cells in the process", "a few micrometers in length "  );
        Plants rose = new Plants("French Rose","Rosa Gallica", "about 1 week", "pollination", "in water, sunlight and soil", "3 to 4 feet in height", "Flower" );
        Animals dog = new Animals("Dog", "Canis familiaris", "10 to 13 years", "opposite gender copulation", "on meat or dog food", "1 to 3.5 feet in height, weighing 10 to 130 lbs", "Domesticated by and shelters with humans");


        Life[] basic = {mushroom, tuberculosis, rose, dog};

        for (Life x : basic){
           x.info();
           x.getSize();
           x.getLifeSpan();
           x.getDiet();
           x.getProcreation();
            System.out.println("+++++++++++++++++++");

        }

        Reptiles snake = new Reptiles("King Corba", "Ophiophagus hannah", "15 to 20 years", "Sexual and asexual", "generally eat rodents", "7-10 feet long", "areas with heavy vegetation", "too many to count");
        Fish salmon = new Fish("Chinook Salmon", "Oncorhynchus tshawytcha", "9 years", "Spawning", "eat planktons and aquatic insects", "3 to 4 feet", "Pacific Ocean", "too many to count");
        Amphibians frog = new Amphibians("Leaf Tree Green Fron", "Ranoidea phyllochroa", "7 to 8 years", "Egg fertilisation", "mostly eat insects", "from 40mm to 13 inches in length", "anywhere with access to water", "too many to count");
        Birds dodo = new Birds("Dodo", "Raphus cucullatus", "17 to 21 years", "Egg fertilization", "lived on fruits, nuts and roots", "2 to 3 ft tall", "the island of Mauritius", "Extinct");
        Mammals cat = new Mammals("Cat", "Felis catus", "10-13 years", "copulation", "eat small rodents and cat food", "around 1 to 1.5 feet in length", "domesticated and shelters with humans", "too many to count", "3 to 5");

        Animals[] intermediate ={snake, salmon, frog, dodo, cat};

        for (Animals y : intermediate){
            y.info();
            y.getSize();
            y.getLifeSpan();
            y.getHabitat();
            y.getDiet();
            y.getProcreation();
            y.getPopulation();
            System.out.println("+++++++++++++++++++");

        }

        Lion africanLion = new Lion("African Lion", "Panthera leo", "15 to 20 years", "copulation", "eat any game available to the pride", "6 to 8 feet in length", "Central and South Africa", "less than 20,000", "3 to 5 cubs");
        Wolf greyWolf = new Wolf("Grey Wolf", "Canis lupus", "13 to 15 years", "copulations", "eat any game available to the pack", "3 to 4 feet in length", "North America", "50,000 to 60,0000", "6 to 8 pups");
        Whale blueWhale = new Whale("Blue Whale", "Balaenoptera musculus", "50 to 73 years", "copulation", "eat krills", " up to 120 feet in length", "mostly in the Pacific Ocean", "less than 15,000", "1 calf");

        Mammals[] animals = {africanLion, greyWolf, blueWhale};

        for (Mammals zz: animals){
            zz.info();
            zz.getSize();
            zz.getLifeSpan();
            zz.getHabitat();
            zz.getDiet();
            zz.getProcreation();
            zz.getPopulation();
            zz.getNumberOFoFSpring();

            System.out.println("++++++++++++++++++++++++++++++++++++");
        }












    }
}
