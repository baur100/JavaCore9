public class Person {
    public String name;
    public int age;
    public boolean sex;
public String lastName;
    public void printSex() {
        if (sex = true) {
            System.out.println("woman");
        } if (sex=false) {
            System.out.println("man");
        }

    }

    public void printPerson() {
        System.out.println("my name is "+ name + " my last name is "+lastName+" I am " + age+" years old.");
        printSex();
    }


}
