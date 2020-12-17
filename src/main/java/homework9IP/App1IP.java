package homework9IP;

public class App1IP {
    public static void main(String[] args) {
        Wine redPinotNoir = new Wine("Red, Pinot Noir", "White Meat", "Big Bowl Glass", "2015");
       redPinotNoir.printWineInfo();

        Wine whiteChardonnay = new Wine("White, Chardonnay", "Creamy Cheese", "Tall Suitable Glass", "2017" );
        whiteChardonnay.printWineInfo();
//        whiteChardonnay.printCategory();
    }
}
