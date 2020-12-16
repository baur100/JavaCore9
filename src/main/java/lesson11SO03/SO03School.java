package lesson11SO03;

public class SO03School {
    private String name;
    SO03SchoolType type;

    public SO03School(String name, SO03SchoolType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SO03SchoolType getType() {
        return type;
    }

    public void setType(SO03SchoolType type) {
        this.type = type;
    }
}
