package floreslesson11;

public class App {
    public static void main(String[] args) {
        Colors pants = Colors.YELLOW;
        String pantsColor = "Green";

        School newDorpHighSchool = new School("New Dorp HighSchool",SchoolType.PUBLIC);
        School xx = new School("St.Peter School",SchoolType.PRIVATE);
        System.out.println(newDorpHighSchool.getName()+" "+newDorpHighSchool.getType());

        System.out.println(xx);
    }
}
