package HomeWork9;

public class Chair {
    private int tall;
    private int wide;

    public Chair(int tall){
        this.tall =tall;
    }
    public Chair(){}

    public void setTall(int tall){
        this.tall = tall;
    }
    public void setWide(int wide){
        this.wide = wide;
    }

    public int getTall() {
        return tall;
    }
    public int getWide() {
        return this.wide;
    }
    public void printMe(){
        System.out.println("Chair tall = "+ this.tall);
    }
}
