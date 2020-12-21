package homeworkHashMapLT;

import java.util.HashMap;
import java.util.Map;

public class GradeScale {
    public static void main(String[] args) {
        Map<Integer,String> gradeNamingConventions = new HashMap<>();

        gradeNamingConventions.put(100, "Outstanding");
        gradeNamingConventions.put(99, "Outstanding");
        gradeNamingConventions.put(95, "Excellent");
        gradeNamingConventions.put(85, "Very Good");
        gradeNamingConventions.put(80, "Good");
        gradeNamingConventions.put(79, "Good");
        gradeNamingConventions.put(60, "Passing");

        System.out.println(gradeNamingConventions);

        gradeNamingConventions.put(59, "Unsatisfactory");

        System.out.println(gradeNamingConventions);

        gradeNamingConventions.replace(99, "Excellent");
        System.out.println(gradeNamingConventions);
        gradeNamingConventions.remove(79);
        System.out.println(gradeNamingConventions);

        System.out.println(gradeNamingConventions.get(100));

        for (Map.Entry<Integer, String> grade: gradeNamingConventions.entrySet()
        ){
            System.out.println(grade.getKey()+" is equivalent to "+grade.getValue());
        }

    }
}
