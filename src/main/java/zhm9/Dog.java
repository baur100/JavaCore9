package zhm9;

public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    private String printInfo() {
        return ("The dog's name is " + name + ". She is " + breed + ", " + age + " months old. She is so cute. Everyone loves her!");
    }

    public void printClass(){
        System.out.println(printInfo());
    }
}