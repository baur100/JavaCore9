package lesson12Dec14;

public class App2 {
    public static void main(String[] args) {
Person1 david = new Person1("David");
        //System.out.println(david.getName());


        Person1 anna = new StudentOB("Anna","Math");
        System.out.println(anna.getName());

        Person1[] people = {david,anna};
        for(Person1 p: people){
            System.out.println(p.getName());
        }

        Person1 cary = new StudentOB("Cary","Math");
        Person1 maggie = new Person1("Maggie");
        StudentOB arwen = new StudentOB("Arwen","Architecture");

        Person1[] people1 = {cary,maggie,arwen};
        for (Person1 b: people1){
            System.out.println(b.getName());
        }
        //1:01 - homework explanation
    }
}
