package lesson11;

public class App {
    public static void main(String[] args) {
        Colors pants = Colors.YELLOW;
        String pantsColor = "Green";
        // "GREEN", "green"

        School newDorpHighSchool = new School("New Dorp High School",SchoolType.PUBLIC);
        School xx = new School("St.Peter Catholic School",SchoolType.PRIVATE);

        System.out.println(xx.getName());
        System.out.println(xx.getType());
        System.out.println(newDorpHighSchool.getName());
        System.out.println(newDorpHighSchool.getType());
        xx.setType(SchoolType.CHARTER);
        System.out.println(xx.getType());


        System.out.println(xx);
    }
}
