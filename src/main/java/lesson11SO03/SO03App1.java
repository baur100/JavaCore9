package lesson11SO03;

public class SO03App1 {
    public static void main(String[] args) {
        SO03Address myAddress = new SO03Address("123 Elm street","Gotham City",SO03State.FL, 99999);
        System.out.println(myAddress);

        SO03Subjects[] alanSubs = {SO03Subjects.CS,SO03Subjects.ENGLISH,SO03Subjects.MATH};
        SO03Student alan = new SO03Student(alanSubs,"Alan Gore",SO03Subjects.MATH);

    }
}
