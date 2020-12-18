package lesson13SO03;

public class Square extends Rectangle{
    public Square(double length) {
        super(length, length);
    }
    @Override
    public void draw(){
        System.out.println("I draw a square with side = " + length);
    }
}
