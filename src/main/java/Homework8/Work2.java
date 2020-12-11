package Homework8;

import java.util.Arrays;

public class Work2{
    public static void main(String [] args){
        int sum = sumOfSix(2,3,5,6,7,8);
        System.out.println(sum);


        int array[] = new int[] {3,9,1,8,4,8,5};
        int min = getMin (array);

        int[] arr= {3,9,1,8,4,8,5};
        Arrays.sort(arr);
        System.out.printf("Modified arr[]: %s", Arrays.toString(arr));

    }

    public static int sumOfSix (int a, int b, int c, int d, int e, int f ){
        return a+b+c+d+e+f;

    }
    public static int getMin (int[]arr){
        int min = arr[0];
        for (int m=1; m<arr.length;m++){
            if(m<min){
                min=arr[m];
            }
        }
        return min;
    }


}