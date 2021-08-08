package interviewFL;

public class App1FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(50);
    }

    public static void fizzBuzz(int range){
        for ( int v=1; v<=range; v++){
            if (v%3==0 && v%5==0){
                System.out.println(v +" FizzBuzz");
                continue;
            }
            if (v%3==0){
                System.out.println(v+ " Fizz");
                continue;
            }
            if (v%5==0){
                System.out.println(v+" Buzz");
                continue;
            }
            System.out.println(v);;
        }

    }
}
