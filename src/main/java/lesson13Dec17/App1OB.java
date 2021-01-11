package lesson13Dec17;

public class App1OB {
    public static void main(String[] args) {
        CircleOB crl = new CircleOB(2.2);
        ShapeOB shape1 = new CircleOB(2.3);
        RectangleOB rec1 = new RectangleOB(2, 3.1);
        SquareOB sqr1 = new SquareOB(5);
        RectangleOB rec2 = new SquareOB(2.2);
        ShapeOB shape2 = new SquareOB(4.1);

        ShapeOB[] shape = {crl, shape1, rec1, sqr1, rec2, shape2};
        for (ShapeOB sh : shape) {
          //  sh.draw();
            System.out.println(sh.getArea());
        }
    }
}
//1:02 hw explanation
