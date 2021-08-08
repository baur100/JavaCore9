package interviewFL;

public class App2GetRemainder {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        int way1 = getReminder1(a, b);
        System.out.println(way1);

        int way2 = getReminder(a, b);
        System.out.println(way2);
    }

    // way1
    private static int getReminder1(int a, int b){
        int way1 = a / b;
        return a - b * way1;
    }

    // way2
    private static int getReminder(int a, int b) {
        int i = a;
        if (a < b) {
            return a;
        } else {
            while (i >= b) {
                i = i - b;
            }
            return i;
        }
    }
}
