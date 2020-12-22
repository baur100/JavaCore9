package functions;

public class App {
    public static void main(String[] args) {
//        func1();
//        func1();
//        func1();
        double xx = getPix25x25();
        System.out.println(xx);
    }
    public static void func1(){
        System.out.println("hi");
        System.out.println("Today is a good weather");
        System.out.println("Today is a good weather in LA");
        System.out.println("Today is a good weather in NY");
    }
    public static double getPix25x25(){
        return Math.PI*25*25;
    }



}
