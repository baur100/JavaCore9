package hm9;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String kind) {
        this.breed = kind;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return age;
    }

    public void printDog() {
        System.out.println("Name:" + getName() + " kind:" + getBreed() + " age:" + getAge());
    }
}
