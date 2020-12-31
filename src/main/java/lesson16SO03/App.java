package lesson16SO03;

public class App {
    public static void main(String[] args) {
        final int xx = 7;
        int[] numbers = {1, 1};

//        int xx = 5/0;
//        int b = numbers [8];
//        throw new NegativeArraySizeException("You did wrong");

        System.out.println("Before try/catch block");
        try {
            System.out.println("Before potential blow up");
            int xx1 = 5/1;
            int b = numbers [1];
            System.out.println("After potential problem");
            throw new MyException();
        } catch (ArithmeticException error) {
            System.out.println("In the catch block");
        } catch (ArrayIndexOutOfBoundsException error){
            System.out.println(error.getMessage());
        }
        catch (MyException error){
            System.out.println("My exception happens");
        } finally {
            System.out.println("Finally block will run in any case");
        }
        System.out.println("After catch block");


    }

}
