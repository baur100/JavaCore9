public class Person {
    public String name;
    public int age;
    public boolean sex;

    public void printSex() {
        if (sex = true) {
            System.out.println("woman");
        } if (sex=false) {
            System.out.println("man");
        }

    }

    public void printPerson() {
        System.out.println(name + " " + age);
        printSex();
    }


}
