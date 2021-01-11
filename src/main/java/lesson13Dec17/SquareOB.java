package lesson13Dec17;

public class SquareOB extends RectangleOB {

    public SquareOB(double length) {
        super(length, length);
    }
    @Override
    public void draw (){
        System.out.println("I draw a square with side = "+length);
    }
}
