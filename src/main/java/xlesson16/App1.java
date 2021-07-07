package xlesson16;

public class App1 {
    public static void main(String[] args) {
        int rem = getRemainder(5,6);
        System.out.println(rem);
    }

//    private static int getRemainder(int a, int b) {
//        int c= a/b;
//        return a-b*c;
//    }

    private static int getRemainder(int a, int b) {
        if(b>a){
            return a;
        }
        while(a>b){
            a = a-b;
            if(a<b){
                return a;
            }
        }
        return 0;
    }

}
