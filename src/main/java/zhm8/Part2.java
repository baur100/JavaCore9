package zhm8;

import java.util.Arrays;
import java.util.Random;

public class Part2 {
    public static void main(String[] args) {
        int[] arr1={2,3,5,6,7,8};
        System.out.println("Sum of array: "+sumOfArray(arr1));

        int[] arr2={3,9,1,8,4,8,5};
        sortArray(arr2);

        System.out.println("Min form array: "+minFromArray(arr2));
    }
    public static int sumOfArray(int[] arr){
        int sum = arr[0];
        for (int v:arr){
            sum = sum +v;
        }
        return sum-arr[0];
    }
    public static void sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
        Arrays.sort(arr);
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
    public static int minFromArray(int[] arr){
        int min = arr[0];
        for (int v:arr){
            if (v<min){
                min = v;
            }
        }
        return min;
    }

}
