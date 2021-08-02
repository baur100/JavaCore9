package interview;

public class App3 {
    public static void main(String[] args) {
        // print instead numbers: if %3 =0 - fizz, if %5 =0 - buzz, if %3 and %5 =0 - FizzBuzz
        fizzbuzz(50);
    }

    public static void fizzbuzz(int bound){
        for (int i=1; i<=bound; i++){
            if (i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3==0){
                System.out.println("Fizz");
                continue;
            }
            if (i%5==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
