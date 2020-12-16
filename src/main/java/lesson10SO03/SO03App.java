package lesson10SO03;

public class SO03App {
    public static void main(String[] args) {
        final int XX = 5;
//        XX = 99;

        SO03Student anna = new SO03Student("Anna", "Smith",2001,"MIT","Acient Art");
        System.out.println(anna.getLastName());

        SO03Teacher mrJones = new SO03Teacher("Alan", "Jones",1990,"Math");

        SO03Teacher msDole = new SO03TempTeacher("Lisa","Dole",1998,"History","January");

        String str = new String("Hello world");

        SO03Person xx = new SO03TempTeacher("Dana","Seymur",1999,"Poetry","June");



    }
}
