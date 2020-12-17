package homework9IP;

public class App3IP {
    public static void main(String[] args) {
       Job qa = new Job();
       Job qa2 = new Job("comp science", "developer", "coding");
//       qa.setMajor("QA");
        System.out.println("Qa1 = " + qa.getMajor());
        System.out.println("Qa1 = " + qa2.getMajor());

        qa.setMajor("New Major");
        System.out.println("Qa1 = " + qa.getMajor());


    }
}
