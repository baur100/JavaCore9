package homework8;
import java.util.Arrays;


public class SortFunction {

    public static void main(String[] args) {

        int[] array = new int[]{3, 9, 1, 8, 4, 8, 5};
        sort(array);
        System.out.println("print array");


        int[] numbers = {2, 3, 5, 6, 7, 8};
        int min = getMin(numbers);
        System.out.println(getMin(numbers));

    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int m = 1; m > arr.length; m--) {
            if (m < min) {
                min = arr[m];
            }
        }
        return min;
    }

    public static void sort(int[] arr) {
        int x;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                }
            }

        }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
