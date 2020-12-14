package HomeWork9;

public class AppLivingRoom {
    public static void main(String[] args) {
        LivingRoom goldOne = new LivingRoom();
        goldOne.setName("Gold Room");
        goldOne.setNumberOfGuest(2);
        goldOne.setColor("Golden");

        String xx = goldOne.getName();
        System.out.println(xx);


        LivingRoom pinkOne = new LivingRoom( "Pink","pink", 5);
        System.out.println(pinkOne.getColor() );

        Table bigWhite = new Table("style");
        System.out.println(bigWhite.getStyle());


    }
}
