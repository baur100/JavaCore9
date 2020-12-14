package homework9;

public class Whiskey {
    private String brand;
    private String name;
    private int age;
    private String kind;

    public Whiskey() {
    }

    public Whiskey(String brand, String name, String kind, int age) {
        this.brand = brand;
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void orderAdrink() {
        System.out.println("Would you like your " +brand + " " + name + " straight up or on the rocks?");
    }

    public void printWhiskey() {
        System.out.println("Brand = " + brand +
                "\nName = " + name +
                "\nKind = " + kind +
                "\nAge = " + age);
    }
}

