package InterfaceHomeWork;

public class TV implements TVRemote{
    private String color;
            private int price;

    @Override
    public void tvremote() {
        System.out.println("Remote is implemented");


    }

    public void setColor(String color) {
        this.color = color;
    }
}
