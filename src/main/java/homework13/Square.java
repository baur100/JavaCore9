package homework13;

public class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Draw a square with side = " + length) ;

    }

    @Override
    public double getPerimeter() {
        return (length*4);
    }
}
