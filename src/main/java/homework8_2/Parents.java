package homework8_2;

public class Parents extends GrandParents {
    private Kids kids;

    public Parents(String name, String lastName, int age, String profession, Kids kids) {
        super(name, lastName, age, profession);
        this.kids = kids;
    }

    public Kids getKids() {
        return kids;
    }

    public void setKids(Kids kids) {
        this.kids = kids;
    }

    @Override
    public void printInfo() {
        super.printInfo();

    }
}
