package homework9;

public class PersonOB {
    private String name;
    private String lastName;
    private int age;
    private String gender;


   public PersonOB(String name,String lastName,int age,String gender){
       this.name=name;
       this.lastName=lastName;
       this.age=age;
       this.gender=gender;
   }

    public PersonOB(String name,int age){
        this.name=name;
        this.age=age;
   }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PersonOB(){
    }
    public void printInfo(){
        System.out.println("Name: "+this.name+" "+
                "\n Last Name: "+this.lastName+" "+
                "\n Age: "+this.age+" "+
                "\n Gender: "+this.gender);
    }
}
