package homework9;

public class Cat {
    private String name;
    private String breed;
    private String color;
    private int age;

    public Cat(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void meow(){
        System.out.println("A cat named " + name + " says MEOW");
    }

    public void printCat(){
        System.out.println(" Cat name = "+ name +
                "\n Cat breed = "+ breed +
                "\n Cat color = "+ color+
                "\n Cat age = "+ age + " months");
    }
}
