package interview;

public class App {
    public static void main(String[] args) {
        //Find a remainder without using "%'

//        int a = 10;
//        int b = 3;
//        System.out.println(a-(b*(a/b)));

        System.out.println(getRemainder2(100,33));
    }

    public static int getRemainder1(int a, int b){
        while (a>=b){
            a=a-b;
        }
        return a;
    }
    public static int getRemainder2(int a, int b){
        return  a-((int)a/b)*b;
    }
}
