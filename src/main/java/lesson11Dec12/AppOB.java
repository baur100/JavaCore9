package lesson11Dec12;

public class AppOB {
    public static void main(String[] args) {
        ColorsOB77 pants = ColorsOB77.GREEN;
        String pantsColor = "Green";
        SchoolOB newDorpHighSchool = new SchoolOB("New Dorp High School", SchoolTypeOB.PUBLIC);
        SchoolOB xx = new SchoolOB("St. Peter High School", SchoolTypeOB.PRIVATE);

        System.out.println(xx.getName());
        System.out.println(xx.getType());
    }
}
