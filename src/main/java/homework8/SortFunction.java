package homework8;

public class SortFunction {

    public static void main(String[] args) {

        int array[] = new int[]{3, 9, 1, 8, 4, 8, 5};
        System.out.println( "Print array");
        sort(array);
    }
    public static int detMin (int[]arr){
        int min = arr[0];
        for (int m=1; m<arr.length; m++){
            if(m<min){
                min =arr[m];
            }
        }
        return min;
    }

    public static void sort(int[] arr) {
        int x;
        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0; i--) {
                if (arr[j] < arr[j - 1]) {
                    x = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = x;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}