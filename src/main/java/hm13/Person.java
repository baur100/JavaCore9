package hm13;

public class Person implements DriversLicence {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.print("\n"+this.name+", you can get a Driver's license");
    }

}
