package xlesson16;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App4 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9,3,4,4,6,7,1};

        Set<Integer> set = new HashSet<>();

        for (int v : arr){
            set.add(v);
        }
        System.out.println(set);
        for(int v : set) {
            int count = 0;
            for (int c : arr){
                if(v==c){
                    count++;
                }
            }
            if(count>1){
                System.out.println(v);
            }
        }


    }
}
