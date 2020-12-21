package homeWork14SO03;


import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> years = new ArrayList<>();
        years.add(1492);
        years.add(1812);
        years.add(1912);
        years.add(2000);
        years.add(2012);
        years.add(2020);
        years.add(1703);
        System.out.println(years);
        System.out.println(years.get(4));
        years.set(0,1945);
        System.out.println(years);
        for (int y: years){
            System.out.println(y);
        }









    }
}
