package zFLlesson6and7;

public class App1 {
    public static void main(String[] args) {
        printSum(2,3);
        printSum("aa","bb");
        printSum(1,"1");
    }
        public static void printSum(int a, int b) {
            System.out.println(a+b);
        }
        public static void printSum(String a, String b){
            System.out.println(a+b);
        }
        public static void printSum(double a, double b) {
            System.out.println(a+b);
        }
        public static void printSum(int a, String b){
            System.out.println(a+b);
        }
}
