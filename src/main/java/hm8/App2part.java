package hm8;

import java.util.Arrays;

public class App2part {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 7, 8};
        printSumArray(a);

        int[] f = {3,9,1,8,4,8,5};
        printSortArray(f);

        int[] b = {3, 9, 1, 8, 4, 8, 5};
        printMin(b);
    }

//        1. Create function `sum` - which takes int[] as a param and returns sum of all elements of the array.
//        invoke it from main() - pass {2,3,5,6,7,8} as a param and print out result
    public static void printSumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("1 -"+sum);
    }

    //        2. Create function sort - which takes  int[] as a param and print out sorted array invoke it from main()
//        - pass {3,9,1,8,4,8,5} as a param (this will be void func)

    public static void printSortArray(int [] arr0){
        Arrays.sort(arr0);
        for(int v: arr0) {
            System.out.print(v + " ");
        }
        System.out.println("");
    }

    //    3. Create a function  which takes int[] as a param and returns min of the array invoke it from main()
    //    - pass {3,9,1,8,4,8,5} as a param
    public static void printMin(int[] arr1) {
        int min = arr1[0];
        for (int v : arr1) {
            if (v < min) {
                min = v;
            }
        }
        System.out.println("3 - "+min);
    }


}
