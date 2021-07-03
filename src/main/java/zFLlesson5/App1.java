package zFLlesson5;

public class App1 {
    public static void main(String[] args) {
        function_one();
        function_two();
        fn3("Irina");
        weather("Atlanta",80);
        perimeter(3,7);
        perimeter(5,5);

        int[] numbers ={2,4,6,7,1,2,1,89,5,121};
        printMax(numbers);
    }

    public static void printMax(int[] arr) {
        int max = arr[0];
        for (int v:arr){
            if (v>max){
                max =v;
            }
        }
        System.out.println("Max = "+max);
    }

    private static void function_one() {
        System.out.println("function 1");
    }
    private static void function_two(){
        System.out.println("function 2");
    }

    public static void fn3(String name){
        System.out.println("Hi "+name);
    }
    public static void weather(String city, int temperature){
        System.out.println("Today in "+city+" is "+temperature+"F");
    }
    public static void perimeter(int height, int width){
        int per = 2*(height+width);
        System.out.println("Perimeter of rectangle with height("+height+") and width("+width+") = "+per);
    }
}
