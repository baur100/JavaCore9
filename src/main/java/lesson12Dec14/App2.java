package lesson12Dec14;

public class App2 {
    public static void main(String[] args) {
Person1 david = new Person1("David");
        System.out.println(david.getName());


        Person1 anna = new StudentOB("Anna","Math");
        // Idea of polymorphism: when we save parent object inside the child class
        System.out.println(anna.getName());

        //Person1[] people = {david,anna};
        //for(Person1 people)
        //1:01 - homework explanation
    }
}
