package hWork8;

public class Hw8App1 {
    public static void main(String[] args) {
        Hw8Accesories bag = new Hw8Accesories();
        bag.brand ="MJ";
        bag.color="black";
        bag.material="leather";
        bag.model="MJ2707";
        bag.type = "bag";
        bag.price=300;
        bag.year=2019;
        printAccessory(bag);

        printDoubleLine();


        Hw8Accesories earrings = new Hw8Accesories();
        earrings.brand ="Marni";
        earrings.color="white";
        earrings.material="gold";
        earrings.type="earrings";
        earrings.model="M2017/001";
        earrings.price=560;
        earrings.year=2017;
        printAccessory(earrings);
    }
    public static void printAccessory(Hw8Accesories accessory){
        System.out.println( accessory.brand +" "+accessory.color+ " "+ accessory.material+", "+accessory.type + " model # "
                +accessory.model + " from "+accessory.year
                +" collection "+", sold for "+accessory.price+" USD.");
    }
    public static void printDoubleLine(){
        System.out.println("===========================================");
    }

}
