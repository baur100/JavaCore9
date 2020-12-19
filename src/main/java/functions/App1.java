package functions;

public class App1 {
    public static void main(String[] args) {
        sayMyName("Jake");
        sayMyName("Mary");
        String[] colors = {"red","green","pink","blue"};
        System.out.println(colors[0]);
        for(int i=3; i>=0 ;i--){
            System.out.println(colors[i]);
        }
    }
    public static void sayMyName(String name){
        System.out.println("Hello dear "+name);
    }





}
