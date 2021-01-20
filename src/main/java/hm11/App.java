package hm11;

public class App {
    public static void main(String[] args) {
        int lives = 7;
        Cat barsik = new Cat("Barsik",Breed.KORAT,8,FoodBrands.PURINA,lives);
        System.out.println(barsik);

        Dog lola = new Dog("Lola",Breed.POMERANIAN,1,FoodBrands.CANIDAE,ServiceDog.NO,"Lamb Chop");
        System.out.println(lola);

        Color[] debraColor = {Color.GREY,Color.BLUE};
        Fish debra = new Fish("Debra", Breed.CATFISH,2,FoodBrands.TETRA,debraColor,TypeOfWater.FRESH);
        System.out.println(debra);
    }
}
