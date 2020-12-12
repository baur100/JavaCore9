package homeWork8SO03;

public class SO03HW8AppSort {
    public static void main(String[] args) {

        int[] arr = new int[] {3,9,1,8,4,8,5};
        int a = 0;

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println("\nArray sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
