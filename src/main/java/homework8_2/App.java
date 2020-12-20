package homework8_2;

public class App {
    public static void main(String[] args) {
        GrandParents grandma = new GrandParents("Emmma","Shir",80,"teacher");
        GrandParents granddad = new GrandParents("David","Shir",90,"Doctor");

        grandma.setName("Nina");
        grandma.setLastName("Konnova");
        System.out.println(granddad.getProfession());
        System.out.println(granddad.getAge()+grandma.getAge());

        GrandParents grandma_2 = new GrandParents();
        grandma_2.setName("Gala");
        grandma_2.setLastName("Dali");
        System.out.println(grandma_2.getProfession());

        GrandParents grandad_2 = new GrandParents();
        grandad_2.setName("Salvador");
        grandad_2.setLastName("Dali");

        grandma.printInfo();
        granddad.printInfo();
        grandad_2.printInfo();
        grandma_2.printInfo();
        Kids roma = new Kids("Roman","Shir",16,"Student");

        Parents dad = new Parents("Vadim", "Shir",50,"Counter",roma);


        System.out.println(dad.getProfession());
        System.out.println(roma.getProfession());
        dad.printInfo();
        GrandParents[]grandParents={grandad_2,granddad,grandma,grandma_2};
        System.out.println("**********family******");

        Family family = new Family(grandParents,dad,roma);
        family.printInfo();



    }

}
