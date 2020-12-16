package homework8;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] arr = {3,9,1,8,4,8,5};

        Arrays.sort(arr);
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}
