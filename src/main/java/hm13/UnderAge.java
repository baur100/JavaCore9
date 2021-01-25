package hm13;

public class UnderAge extends Person implements Permit,DriversLicence{
    private int age;

    public UnderAge(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void permit() {
        System.out.println(" when you will be eligible. Come back in "+yearsNeed()+" years");
    }

    @Override
    public int yearsNeed() {
        return 18-this.age;
    }
}
