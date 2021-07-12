package zFLlesson16;

public class App {
    public static void main(String[] args) {
        int[] numbers = {1,1};

//        int b = numbers[8];
//        int xx = 5%0;
//        throw new NegativeArraySizeException("You did wrong");

        System.out.println("1. Before try/catch block");
        try {
            System.out.println("2. Before potential blow out");
            int xx = 5/1;
            int b = numbers[1];
            System.out.println("3. After potential blow out");
            throw new MyException();
        } catch (ArithmeticException error){
            System.out.println("4. In teh catch block: "+error.getMessage());
        } catch (ArrayIndexOutOfBoundsException error){
            System.out.println("5. Second catch block: "+error.getMessage());
        } catch (MyException error){
            System.out.println("My exception!!!");
        }finally {
            System.out.println("Finally block will run in anyway");
        }
        System.out.println("6. After try/catch block");


    }
}
