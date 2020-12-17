package hWork8;

public class Hw8App4 {
    public static void main(String[] args) {
   Hw8Tableware fork = new Hw8Tableware();
   fork.amount = 2;
   fork.color = "Silver";
   fork.material = "Metal";
   fork.price = 2;
   fork.name = "Fork";
   printTableware(fork);
   printLine();

   Hw8Tableware cup = new Hw8Tableware();
   cup.name = "Cup";
   cup.price= 15;
   cup.material=  "Porcelain";
   cup.amount= 8;
   cup.color="Multicolor";
   printTableware(cup);


    }

    public static void printTableware(Hw8Tableware tableware){
        System.out.println("Name of the item: " + tableware.name+ "\nColor of the item: " + tableware.color
                + "\nMaterial: "+ tableware.material
        +"\nAmount: " + tableware.amount
        +"\nPrice: " + tableware.price);
    }
    public  static void printLine (){
        System.out.println("--------------------------------------------");
    }
}
