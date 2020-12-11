package homework8LT;

public class App2LT71 {
    public static void main(String[] args) {
        int[] sum = {2, 3, 5, 6, 7, 8};
        printSum(sum);

        int[] sort = {3, 9, 1, 8, 4, 8, 5};
        printSum(sort);
        printSort(sort);
        printMin(sort);


    }


    public static void printSum(int[] arr) {
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];


        }
        System.out.println(" The sum is " + sum);
    }

    public static void printSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }


        }
        System.out.println("In ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void printMin(int[] arr) {
        int min = arr[0];

        for (int v : arr) {
            if (v < min) {
                min = v;
            }

        }
        System.out.println("The minimum Value of the Array is " + min);

    }
}
