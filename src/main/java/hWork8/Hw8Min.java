package hWork8;

public class Hw8Min {
    public static void main(String[] args) {
        int[] numbers = {2,8,10,101,-15,13,48,55,200};
        int minNum = getMin(numbers);

        System.out.println(minNum);
    }
    public static int getMin(int[]arr){
        int min = arr[0];
        for (int v: arr){
            if(v<min){
                min=v;
            }

        }
        return min;
    }
}
