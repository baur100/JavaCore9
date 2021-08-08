package interviewFL;

import java.util.ArrayList;
import java.util.List;

public class App6PrintIfRepeated {
    public static void main (String[] args){
        int[] array = {5,5,6,7,8,9,6,0,5,9,2,3,1};
        printRepeated(array);

    }

    private static void printRepeated(int[] array) {
        List repeated = new ArrayList<Integer>();
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]==array[j]){
                    if (!repeated.contains(array[i])){
                        repeated.add(array[i]);
                    }
                }
            }
        }
        repeated.forEach(x-> System.out.println(x));
    }
}
