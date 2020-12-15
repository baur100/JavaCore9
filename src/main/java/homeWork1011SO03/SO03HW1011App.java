package homeWork1011SO03;

public class SO03HW1011App {
    public static void main(String[] args) {

        SO03HW1011Staff james = new SO03HW1011Staff("James","Smith","Perfume");
        System.out.println(james.getLastName());

        SO03HW1011Department jack = new SO03HW1011Department("Jack","Johnson","Perfume","Cashier",03,8,2006);
        System.out.println(jack.getJobTitle());

        SO03HW1011Contacts mary = new SO03HW1011Contacts("Mary","Adams","Kitchen","mary.adams@gmail.com","123 5 Ave","New York","NY",11111);
        System.out.println(mary.getEmail());

        SO03HW1011Furniture newTable = new SO03HW1011Furniture("Table",SO03HW1011Woods.OAK);
        System.out.println(newTable.getWoods());

        SO03HW1011Grapes[] whiteWine = {SO03HW1011Grapes.CHARDONNAY,SO03HW1011Grapes.MERLOT,SO03HW1011Grapes.RIESLING};
        SO03HW1011Wine wine = new SO03HW1011Wine(whiteWine,"Best white wine",2007,SO03HW1011Grapes.CHARDONNAY);








    }
}
