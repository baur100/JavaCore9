package hw14;

import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        List<Boolean> poligraf = new ArrayList<>();

        poligraf.add(true);
        poligraf.add(false);
        poligraf.add (1<0);
        poligraf.add (3==9);

        System.out.println(poligraf);
        poligraf.add ("sun"=="sun");
        System.out.println(poligraf);
        poligraf.set(1,0==0);
        System.out.println(poligraf);
        poligraf.remove(0);
        System.out.println(poligraf);
        System.out.println(poligraf.get(2));
        //for (boolean cc:poligraf
        //     ) {
        //    System.out.println(cc);
       // }
}
}
