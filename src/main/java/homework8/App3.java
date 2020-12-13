package homework8;

public class App3 {
    public static void main(String[] args) {
        Clothing a = new Clothing();
        a.type = "Dress";
        a.color = "White";
        a.size = 6;

        Clothing b = new Clothing();
        b.type = "Pants";
        b.color = "Black";
        b.size = 8;

        printClothing(a);
        printClothing(b);


    }
    public static void printClothing(Clothing clothing){
        System.out.println(clothing.color+ " " +clothing.type+ " " + "size" + " " + clothing.size);
    }

}
