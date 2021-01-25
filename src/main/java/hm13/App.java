package hm13;

public class App {
    public static void main(String[] args) {
        Person adult1 = new Person("Anna");
        adult1.drive();

        UnderAge teen1 = new UnderAge("Alex",16);
        teen1.drive();
        teen1.permit();

        Person adult2 = new UnderAge("John",18);
        adult2.drive();

        UnderAge teen2 = new UnderAge("Teen 2", 17);
        teen2.drive();
        teen2.permit();

    }
}
