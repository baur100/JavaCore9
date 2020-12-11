package hw8;

import java.util.Arrays;

public class Myhw8b<myArray> {
    public static void main(String[] args) {
        sum();
        getMin ();
        sort();
    }

    public static void sum() {
        int[] a = {2, 3, 5, 6, 7, 8};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);


    }

    public static void getMin () {
        int[] number = {3, 9, 1, 8, 4, 8, 5};
        int min = number[0];
        for (int v : number) {
            if (min > v) {
                min = v;
            }
        }
        System.out.println(min);

    }
    public static void sort (){
        int[] myArray = {3,9,1,8,4,8,5};
        Arrays.sort(myArray);{
            System.out.println(Arrays.toString(myArray));
        }

    }

}





