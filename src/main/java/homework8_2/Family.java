package homework8_2;

public class Family implements Info {
    private GrandParents[] grandParents;
    private Parents parents;
    private Kids kids;

    public Family(GrandParents[] grandParents, Parents parents, Kids kids) {
        this.grandParents = grandParents;
        this.parents = parents;
        this.kids = kids;
    }

    @Override
    public void printInfo() {
        for (GrandParents gp:grandParents) {
            gp.printInfo();
        }
        parents.printInfo();
        kids.printInfo();
    }
}
