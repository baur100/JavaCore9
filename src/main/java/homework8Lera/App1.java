package homework8Lera;

public class App1 {
    public static void main(String[] args) {
        Gum orbit = new Gum();
        orbit.brand = "Orbit";
        orbit.ingridients = "Organic ingridients";
        orbit.calories = 2;
        orbit.flavor = "Mint";

        orbit.selling();

        Gum mentos = new Gum();
        mentos.brand = "Mentos";
        mentos.ingridients = "Very bad ingridiens";
        mentos.calories = 3;
        mentos.flavor = "Strawberry";

        mentos.selling();

    }
}
