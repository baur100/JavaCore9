package zFLlesson11;

public class App1 {
    public static void main(String[] args) {
        Address myAddress = new Address("123 Elm street", "Gotham",State.FL,99999);
        System.out.println(myAddress.toString());

        Subjects[] alanSubs ={Subjects.CS, Subjects.ENGLISH, Subjects.MATH};

        Student alan = new Student(alanSubs, "Alan Gore", Subjects.MATH);
        System.out.println(alan.toString());
    }
}
