package zhm13;

public class CocaColaFactory implements Price{
    private int regularPrice;

    public CocaColaFactory(int regularPrice) {
        this.regularPrice = regularPrice;
    }

    @Override
    public void printInfo() {
        System.out.println("We don't have any offers today. Regular price is "+regularPrice);

    }

    @Override
    public double getHolidayPrice() {
        return regularPrice*1.5;
    }

    @Override
    public double get50offPrice() {
        return regularPrice*0.5;
    }
}
