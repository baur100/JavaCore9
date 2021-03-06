package xlesson16;

import java.util.Random;

public class App5 {
    public static void main(String[] args) {

        int[] dices = throw5Dices();
        int steps = calculateSteps(dices);
        System.out.println("Steps = "+steps);
    }

    private static int calculateSteps(int[] dices) {
        int steps=0;
        for (int v:dices){
            if(v==1){
                steps+=2; //steps=steps+2
                continue;
            }
            if(v==6){
                continue;
            }
            steps++;
        }
        return steps;
    }

    private static int[] throw5Dices() {
        Random random = new Random();
        int[]arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=random.nextInt(6)+1;
            System.out.println(arr[i]);
        }
        return arr;
    }
}
