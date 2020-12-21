package lesson10Dec12;
/*Classes start with capitals;
variables start with lowercase letters;
functions start with lowercase letters;
final variables (constants), enum numbers - capitals only;
 */



/* To make a Person OB Parent class we have to make some changes: Change private to protected.
was:
public class PersonOB {
    private String name;
    private String lastName;
    private int yearOfBirth;
became:
public class PersonOB {
    protected String name;
    protected String lastName;
    protected int yearOfBirth;


 */

public class PersonOB {
    protected String name;
    protected String lastName;
    protected int yearOfBirth;
    //How to create constructor very quickly: Code-Generate(or Alt+Insert)

    public PersonOB(String name, String lastName, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    public PersonOB() {
    }

    public PersonOB(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
