package zFLlesson4;

public class hm4 {
    public static void main(String[] args) {
        int[] arr = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};
        int max = arr[0];
        int min = arr[0];
//       a. print all values
        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();
//        b. print only even (use if inside the loop)
        for (int v : arr) {
            if (v % 2 == 0) {
                System.out.print(v + " ");
            }
        }
        System.out.println();
//        c. printout values which divide, without remainder by 3 (use if inside the loop)
        for (int v : arr) {
            if (v % 3 == 0) {
                System.out.print(v + " ");
            }
        }
        System.out.println();
//        d. print out max value
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
        }
        System.out.println("Max = " + max);
//        e. print out min value
        for (int v : arr) {
            if (v < min) {
                min = v;
            }
        }
        System.out.println("Min = " + min);
//        f. print out only odd numbes
        for (int v : arr) {
            if ((v % 2 == 1) || (v % 2 == -1)) {
                System.out.print(v + " ");
            }
        }
        System.out.println();
//        2. Create a new array of int and assign it by:
//        {10,15,12,7,88,10,6,17,23,10,10,16}
//        print out INDEXES of values which equal to 10
        int[] arrIndx = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        int index = 0;
        for (int v : arrIndx) {
            if (v == 10) {
                System.out.print(index + " ");
            }
            index++;
        }
    }
}
