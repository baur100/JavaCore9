package hWork8;
public class Hw8App {
    public static void main(String[] args) {
        Hw8Person anna = new Hw8Person();
        anna.name ="Anna";
        anna.lastName = "Lee";
        anna.age = 26;
        anna.heightNumber= 170;
        anna.height = "cm tall";
        anna.hairColor = "brown";
        printPerson(anna);

        printLine();



        Hw8Person noah = new Hw8Person();
        noah.name = "Noah";
        noah.lastName= "Lee";
        noah.age =28;
        noah.heightNumber = 180;
        noah.height = "cm tall";
        noah.hairColor = "brown";
        printPerson(noah);

    }
    public static void printPerson(Hw8Person person){
        System.out.println("Name  "+person.name+"\nLast name " + person.lastName + "\nAge is " + person.age+ " "
                + "years, she is "
                + person.heightNumber+" "+person.height+ ".Her hair is "+ person.hairColor);

    }
    public static void printLine(){
        System.out.println("------------------------------------");
    }
}
