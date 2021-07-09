package zFLlesson13;

public class Square extends Rectangle implements Shape{
// implements Shape - just an example. Actually we don't have to use it, since Rectangle already has it (implements it)

    public Square(double length) {
        super(length, length);
    }

    @Override
    public void draw(){
        System.out.println("I draw a square with side - "+length);
    }
}
