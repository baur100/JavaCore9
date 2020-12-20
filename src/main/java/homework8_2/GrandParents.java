package homework8_2;

public class GrandParents implements Info{
    private String name;
    private String lastName;
    private int age;
    private String profession;

    public GrandParents(String name, String lastName, int age, String profession) {
       this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
    }
    public GrandParents(){ }
    public void setName(String newName){
        name = newName; }
    public void setLastName(String newLastName){
        lastName = newLastName; }
    public void setProfession(String profession){
        this.profession = profession;
    }public String getProfession(){
        return profession;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void printInfo() {
        System.out.println(name + " "+ lastName+" "+ age+" "+profession );
    }
}

