package homeWorkArrayListOB;

import java.util.ArrayList;

public class HWArraylistOB {
    public static void main(String[] args)
        {
        ArrayList<ColorsOB> colors = new ArrayList();
        colors.add(ColorsOB.BLUE);
        colors.add(ColorsOB.MAGENTA);
        colors.add(ColorsOB.CYAN);
        System.out.println(colors);


        ArrayList <String> clothing = new ArrayList<>();
        clothing.add("Shirt");
        clothing.add("Pants");
        clothing.add("Socks");
        clothing.add("Belt");
        clothing.add("Coat");
        System.out.println(clothing);

        clothing.remove("Pants");
        clothing.add("Skirt");
        System.out.println(clothing);


        ArrayList<Integer> numbs= new ArrayList<>();
        numbs.add(24);
        numbs.add(18);
        numbs.add(0);
        numbs.add(3);
        numbs.add(9);
        System.out.println(numbs);
        System.out.println(numbs.size());
        // How we can substitute?
            //Can we create arraylist of different data type or arrlist containing enum and String or Integer;


    }
}
