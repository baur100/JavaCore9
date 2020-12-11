package homework8;

public class Min {
    public static void main(String[] args) {

        int[] numbers = {3, 9, 1, 8, 4, 8, 5};

        int minNumber = getMin(numbers);

        System.out.println(minNumber);
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int v : arr) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }
}

