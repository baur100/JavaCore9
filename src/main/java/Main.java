import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        for (int i = 50; i >= -20; i = i - 3) {
            System.out.println(i);

        }
        System.out.println("************");
        int x = 50;
        while (x >= -20) {
            System.out.println(x);
            x = x - 3;
        }
        int y = 45;
        do {
            System.out.println(y);
            y = y - 1; //y--
        } while (y >= -10);


        String[] colors = {"yellow", "red", "pink", "orange", "green", "blue", "grey"};
        for (int i = 0; i <= 6; i = i + 2) {
            System.out.println(colors[i] + i); //show index
        }
        System.out.println("*******");

        for (String color : colors) {
            System.out.println(color);
        }

        int[] temp = {58, 59, 60, 61, 62};
        int x1 = 0;
        System.out.println(averageTemp(temp));
        for (int i = 0; i < temp.length; i = i + 1) {
            System.out.println(temp[i] + " index " + i);
            x1 = (x1 + temp[i]);
            System.out.println(x1);
        }
        for (int z : temp) {
            x = x + z;
            System.out.println(x);
        }


        String[] color = new String[5];
        color[0] = "red";
        color[1] = "blue";
        color[3] = "black";
        color[4] = "grey";


        color[2] = "pink";


        Arrays.sort(color);


    }
    public static int averageTemp ( int[] arr){
        int sum = 0;
        for (int z : arr) {
            sum = sum + z;
        }
        return sum / arr.length;
    }



}

