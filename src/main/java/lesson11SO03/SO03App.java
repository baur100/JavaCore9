package lesson11SO03;

public class SO03App {
    public static void main(String[] args) {
        SO03Colors pants = SO03Colors.GREEN;
        String pantsColor = "Green";
        // "GREEN", "green", "Green"

        SO03School newDorpHighSchool = new SO03School("New Dorp HighSchool", SO03SchoolType.PUBLIC);
        SO03School xx = new SO03School("St.Peter Catholic School",SO03SchoolType.PRIVATE);

        System.out.println(xx.getName());
        System.out.println(xx.getType());
        System.out.println(newDorpHighSchool.getName());
        System.out.println(newDorpHighSchool.getType());
        xx.setType(SO03SchoolType.CHARTER);
        System.out.println(xx.getType());

    }
}
