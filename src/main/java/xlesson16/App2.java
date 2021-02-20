package xlesson16;


import java.util.Date;

public class App2 {
    public static void main(String[] args) {
        Date xx = new Date();
        String rand = xx.getTime()+"";
        System.out.println(rand.substring(9));
    }
}
