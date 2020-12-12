package homeWork8SO03;

public class SO03HW8AppMin {
    public static void main(String[] args) {
        int[] arr = new int[] {3,9,1,8,4,8,5};
        int min = printMin(arr);
        System.out.println("Min value is "+min);
    }
    public static int printMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
