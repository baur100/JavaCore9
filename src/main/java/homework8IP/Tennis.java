package homework8IP;

public class Tennis {
    public static String name;
    public static String color;
    public static int quantity;
    public static String extraBalls;


    public static void printTennis() {
        System.out.println("My hobby is Tennis and i use " + name + " to play it and its " + color + ". I have only " + quantity +
                "\ncompare to another players");

        System.out.println("My friend plays with " + color + " " + name + " and she has " + quantity + " just like me");

        System.out.println("My friend plays with " + color + " " + name + " and he has " + quantity + " rackets" +
                "\n and " + extraBalls + ".");
    }
}
