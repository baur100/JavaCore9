package floreslesson16;

public class App {
    public static void main(String[] args) {
        int[]numbers ={1,1};

//        throw new NegativeArraySizeException("You did wrong");
        System.out.println("Before try/catch block");
    try{
        System.out.println("Before potential blow up");
        int xx = 5/1;
        int b = numbers[1];
        System.out.println("After potential problem"); //never reaches that if the exception occurs (on the line 12)
        throw new MyException();
    }catch (ArithmeticException error) {
        System.out.println("Dividing by zero!");
    }catch (ArrayIndexOutOfBoundsException error){
        System.out.println("Inside of second try/catch block!");
    }catch (MyException error){
        System.out.println("My exception happens!");
    }finally {
        System.out.println("Finally block - will run in any case");
    }
        System.out.println("After catch block");
    }
}
