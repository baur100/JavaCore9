package interviewFL;

public class App4LuckyString {
    public static void main(String[] args) {
        // Check iof number or String is Lucky
        String str = "1tyuiuyt";

        if (isLucky(str)){
            System.out.println("Lucky - "+str);
        }else {
            System.out.println("NO");
        }
    }

    private static boolean isLucky(String str) {
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse=reverse+str.charAt(i);
        }
        for (int i=0; i<str.length();i++) {
            if (str.charAt(i) != reverse.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
