package homework13;

public class App {
    public static void main(String[] args) {
        Circle crl = new Circle(3.5);
        Shape shape1 = new Circle(2.1);
        Square sqr = new Square(5);
        Shape shape2 = new Square(6);

        Shape[] shapes = {crl,shape1,sqr,shape2};

        for (Shape sh:shapes){
           sh.draw();

        }
    }
}
