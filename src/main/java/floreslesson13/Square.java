package floreslesson13;

public class Square extends Rectangle implements Shape{
    public Square(double length) {
        super(length,length);
    }
    @Override
    public void draw(){
        System.out.println("I draw a square with "+this.length+" side");
    }


}
