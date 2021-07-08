package zhm11;

public class App {
    public static void main(String[] args) {
        Animal myDog = new Dog("pomeranian",Color.BLACK,7,"red",
                new AnimalFood((new Flavors[]{Flavors.CHICKEN, Flavors.BISON}), 16));
        System.out.println(myDog.toString());

        Cat catNextDoor = new Cat("american",Color.BLACK,24,"grass",
                new AnimalFood((new Flavors[]{Flavors.SALMON,Flavors.TUNA}),16));
        System.out.println(catNextDoor.toString());

        Fish iWish = new Fish("Golden Fish",Color.GOLD,2,
                new AnimalFood((new Flavors[]{Flavors.CHICKEN}),1),"Salty");
        System.out.println(iWish.toString());

        Animal testAnimal = new Animal("animal",Color.WHITE,0,
                new AnimalFood((new Flavors[]{Flavors.BISON}),16));
        System.out.println(testAnimal.toString());
    }
}
