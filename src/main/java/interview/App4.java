package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App4 {
    public static void main(String[] args) {
        //find the same numbers in Array
        Integer[] arr = {10,26,6,72,9,10,7,77,56,46,77,3,2,2};
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
        for (int v:set){
            int count =0;
            for (int n:arr){
                if (n==v){
                    count++;
                }
            }
            if (count>1){
                System.out.println(v);
            }
        }
    }
}
