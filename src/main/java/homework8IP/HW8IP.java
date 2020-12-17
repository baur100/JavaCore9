package homework8IP;

import java.util.Arrays;

public class HW8IP {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 7, 8};
        System.out.println("sum of 2, 3, 5, 6, 7, 8 =" + sum(arr));

        int[] arrForSort = {3, 9, 1, 8, 4, 8, 5};
        sort(arrForSort);

        int[] arrForMin = {3, 9, 1, 8, 4, 8, 5};
        System.out.println("Min of 3,9,1,8,4,8,5 is " + findMin(arrForMin));

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted Array:" + Arrays.toString(array));
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
