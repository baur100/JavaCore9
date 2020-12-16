package homework10;

public class Dog {

    protected String name;
    protected String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
