package homeworkArrayListLT;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNumbers {
    public static void main(String[] args) {
        List<Integer> surveyScore = new ArrayList<>();

        surveyScore.add(10);
        surveyScore.add(5);
        surveyScore.add(8);
        surveyScore.add(10);
        surveyScore.add(9);

        System.out.println(surveyScore);

        surveyScore.add(9);
        surveyScore.add(10);
        System.out.println(surveyScore);

        surveyScore.remove(1);
        System.out.println(surveyScore);

        surveyScore.set(1, 7);
        System.out.println(surveyScore);

        double sum = 0;
        for (Integer x: surveyScore){
            sum += x;


        }
        System.out.println("Average survey score = "+sum/surveyScore.size());

        int index = 0;
        for (Integer x: surveyScore){
            if(x==10){
                System.out.println(index);
            }
            index ++;
        }
        System.out.println(surveyScore.get(4));


    }

}
