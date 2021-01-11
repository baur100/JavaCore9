package homework8;

public class Sum {
    public static void main(String[] args) {
        int[] arr={23,45,233,67,89};
        int sum = sumOfSix(arr);

        System.out.println(sum);
    }
    public static int sumOfSix(int[] arr){
        int x=0;
        for (int i=0;i<arr.length;i++){
            x=x+x;
        }
        return x;
    }

}
