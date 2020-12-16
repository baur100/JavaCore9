package HomeWork10_11;

import java.sql.SQLOutput;

public class APPforEnum {
    public static void main(String[] args) {
        HouseCats murzik = new HouseCats("Simis","people home","Can food",
                "Murzhik",5,"No bread", TypeOfAnimal.EATMEAT);

        System.out.println(murzik.getCatBread());

        Toys [] shariktoys = { Toys.BONE, Toys.BONE};
        HouseAnimals sharik = new HouseAnimals("Pudel","Home","Meat","Sharik",
                shariktoys, Toys.BONE);
        System.out.println(sharik.getNickname());
        System.out.println(sharik.getHabitat());
        System.out.println(shariktoys);
    }
}
