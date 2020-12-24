package homework17;

public class HW17 {
    public static void main(String[] args) {
        Lion myLion = new Lion();
        myLion.eat();
        myLion.grow();
        myLion.breathe();
        myLion.fur();
        myLion.reproduction();
        myLion.breed();
        myLion.die();

        Wolf myWolf= new Wolf();
        myWolf.breathe();
        myWolf.breed();
        myWolf.die();
        myWolf.eat();
        myWolf.fur();
        myWolf.grow();
        myWolf.reproduction();

        Whale whale= new Whale();
        whale.breathe();
        whale.breed();
        whale.die();
        whale.eat();
        whale.fur();
        whale.grow();
        whale.reproduction();
    }
}
