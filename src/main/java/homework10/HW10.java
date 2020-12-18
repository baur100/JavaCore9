package homework10;

public class HW10 {
    public static void main(String[] args) {
        Student mary = new Student("Mary","Hudson",1990,
                "Eagle Ridge Academy","First");
//        System.out.println(mary.getSchool());

        Teacher msThomas = new Teacher("Lindsey","Thomas",
                1986,"Art","Eagle Ridge Academy");
//        System.out.println(msThomas.getSubject());

        Nurse paula = new Nurse("Paula","Kofman", 1973,
                "Nurse", 8);
        System.out.println(paula.getWorkHours());



    }

}
