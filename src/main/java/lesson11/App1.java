package lesson11;

public class App1 {
    public static void main(String[] args) {
        Address myAddress = new Address("123 Elm street", "Gotham city",State.FL,99999);
        System.out.println(myAddress);

        Subjects[] alanSubs = {Subjects.CS,Subjects.ENGLISH,Subjects.MATH};

        Student alan = new Student("Alan","Gore",alanSubs,Subjects.MATH);
    }
}
