package homeworkArrayListLT;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJobs {


    public static void main(String[] args) {
        List <String> jobs = new ArrayList<>();
        jobs.add("Doctor");
        jobs.add("Policeman");
        jobs.add("Teacher");
        jobs.add("Accountant");
        jobs.add("Researcher");


        System.out.println(jobs);

        jobs.add("Professional Athlete");
        System.out.println(jobs);

        jobs.remove(0);
        System.out.println(jobs);

        System.out.println(jobs.get(2));

        boolean jobOut = jobs.remove("Accountant");
        System.out.println(jobOut);
        System.out.println(jobs);

        jobs.set(0, "Priest");
        System.out.println(jobs);

       for(String x : jobs){
           System.out.println(x);
       }
       jobs.add("Policeman");
       jobs.add("Accountant");
        System.out.println(jobs);





    }

}
