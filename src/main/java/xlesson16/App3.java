package xlesson16;

public class App3 {
    public static void main(String[] args) {
        fibonachi(10);
    }

    //    1 1 2 3 5 8 13 21
    private static void fibonachi(int i) {
        int num1 = 0, num2 = 1;
        int counter = 0;

        while (counter < i) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }

    }
}
