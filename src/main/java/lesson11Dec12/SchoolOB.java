package lesson11Dec12;

public class SchoolOB {
    private String name;
    SchoolTypeOB type;

    public SchoolOB(String name, SchoolTypeOB type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchoolTypeOB getType() {
        return type;
    }

    public void setType(SchoolTypeOB type) {
        this.type = type;
    }
}
