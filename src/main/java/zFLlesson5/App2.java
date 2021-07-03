package zFLlesson5;

public class App2 {
    public static void main(String[] args) {
        int sum = sumOfFive(2,2,3,4,4);
        int sum1 = sumOfFive(sum, sum, 1,1,1);

        System.out.println("Sum ="+sum1);

        double length = getCirclePerimeter(3.2);
        System.out.println("length =x"+length);

        int[]numbers ={2,4,6,7,1,2,1,89,5,121};
        int[]temps={67,32,79,90,44};
        int[]years={1967,1932,1979,1990,1944,2001};

        int maxNumber = getMax(numbers);
        int maxTemp = getMax(temps);
        int maxYear = getMax(years);
        System.out.println(maxNumber+" "+maxTemp+" "+maxYear);
    }

    public static double getCirclePerimeter(double radius) {
        return 2*radius*Math.PI;
    }

    public static int sumOfFive(int a, int b, int c, int d, int e){
        return a+b+c+d+e;
    }

    public static int getMax(int[] arr){
        int max =arr[0];
        for (int v:arr){
            if (v>max){
                max =v;
            }
        }
        return max;
    }
}
