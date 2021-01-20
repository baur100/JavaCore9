package floreslesson11;

public class School {
    private String name;
    SchoolType type;

    public School (String name, SchoolType type){
        this.name=name;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchoolType getType() {
        return type;
    }

    public void setType(SchoolType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
