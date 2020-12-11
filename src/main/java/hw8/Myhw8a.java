package hw8;

public class Myhw8a {
    public static void main(String[] args) {
        Shoes sneakers = new Shoes();
        sneakers.style = "running shoes";
        sneakers.gender = " for men";
        sneakers.vendorCode = 16558935;
        sneakers.color = "blue";
        sneakers.size = 10;

        Shoes classic = new Shoes();
        classic.style = "boots";
        classic.gender = " for women";
        classic.vendorCode = 381141267;
        classic.color = "black";
        classic.size = 7;

        printShoes(sneakers);
        printShoes(classic);


    }

    public static void printShoes(Shoes shoes) {
        System.out.println("Style = " + shoes.style+
        "\nFor whom =" + shoes.gender+
                "\nStock number =" +" " + shoes.vendorCode+
                "\nColor = " + shoes.color+
                "\nSize = " +shoes.size);



    }
}
