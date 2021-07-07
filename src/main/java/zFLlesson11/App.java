package zFLlesson11;

public class App {
    public static void main(String[] args) {
        Colors pants = Colors.GREEN;
        String pantsColor = "Green";

        School newDorpHighSchool = new School("New Dorp High School",SchoolType.PUBLIC);
        School xx = new School("St.Peter Catholic School",SchoolType.PRIVATE);

        System.out.println(xx.getName());
        System.out.println(xx.getType());
        System.out.println(newDorpHighSchool.getName());
        System.out.println("Was: "+newDorpHighSchool.getType());
        newDorpHighSchool.setType(SchoolType.CHARTER);
        System.out.println("Became: "+newDorpHighSchool.getType());

        System.out.println(xx.toString());
    }
}
