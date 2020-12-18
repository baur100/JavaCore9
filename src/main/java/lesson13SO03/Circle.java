package lesson13SO03;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I draw a circle with radius = "+ this.radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
}
