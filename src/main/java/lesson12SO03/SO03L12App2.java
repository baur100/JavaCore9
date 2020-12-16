package lesson12SO03;

public class SO03L12App2 {
    public static void main(String[] args) {
        SO03L12Person1 david = new SO03L12Person1("David");
//        System.out.println(david.getName());

        SO03L12Person1 anna = new SO03L12Student("Anna","Math");
//        System.out.println(anna.getName());

        SO03L12Person1 jane = new SO03L12Person1("Jane");
        SO03L12Person1 mary = new SO03L12Student("Mary","History");
        SO03L12Student jake = new SO03L12Student("Jake","CS");

        SO03L12Person1[] people = {david,anna,jane,mary,jake};
        for (SO03L12Person1 p: people){
            System.out.println(p.getName());
        }

    }
}
