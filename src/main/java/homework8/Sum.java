package homework8;
public class Sum {


    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7, 8};

        System.out.println(sum(numbers));
    }

    public static int sum(int [] arr){
        int sum=0;
        for(int x: arr) {
            sum = sum +x;
        }
        return sum;

    }

}