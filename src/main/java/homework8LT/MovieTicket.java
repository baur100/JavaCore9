package homework8LT;

public class MovieTicket {
    public String name;
    public int age;
    public String gender;

    public void moviePrice(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        if (age<5){
            System.out.println("Name = "+name+
                    "\nGender = "+gender+
                    "\nAge = "+age+
                    "\nQualifies for a free movie pass.");
        }else if (age<12){
            System.out.println("Name = "+name+
                    "\nGender = "+gender+
                    "\nAge = "+age+
                    "\nQualifies for a 50% discount movie pass.");


        }else {
            System.out.println("Name = " + name +
                    "\nGender = " + gender +
                    "\nAge = " + age +
                    "\nDoes not quality for any movie pass discount.");

        }
    }

}
