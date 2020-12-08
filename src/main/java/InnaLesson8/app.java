package InnaLesson8;

public class app {
    import InnaLesson8.Person;

        public static void main(String[] args){
            Person mary = new Person();
            mary.name = "Mary";
            mary.LastName = "Hudson";
            mary.age = 25;

            Person jake = new Person();
            mary.name = "Jake";
            mary.LastName = "Dubson";
            mary.age = 18;

            Person steve = new Person();
            steve.age = 26;
            steve.lastName = "petersp";
            steve,name = "Steve";


        }

    @public static <Person> void printPerson(Person person){
            System.out.println("Name = "+person.name +
                    "\nLatst name = "+person.lastName+
                    "\nage = "+person.age)
        }
    }

}
