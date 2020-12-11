package homework8LT;

public class Athlete {
    public String name;
    public String lastName;
    public String sport;
    public int age;
    boolean olympic = true;
    boolean champion = true;

    public void yesOlympic() {
        if (olympic) {
            System.out.println(name + " " + lastName + " " + age + ", played " + sport + " in the Olympics.");

        } else {
            System.out.println(name + " " + lastName + " " + age + ", did not play " + sport + " in the Olympics.");
        }


    }

    public void yesChampion() {
        if (champion) {
            System.out.println(name + " " + lastName + " is a champion in the sport.");

        } else {
            System.out.println(name + " " + lastName + " is not a champion in the sport.");
        }
        {
            System.out.println("==============================================================");
        }

    }



}

