package homeWork8SO03;

public class SO03HW8App {
    public static void main(String[] args) {
        SO03HW8Person thomas = new SO03HW8Person();
        thomas.name = "Thomas";
        thomas.lastName = "Anderson";
        thomas.nickName = "Neo";
        thomas.age = 35;

        SO03HW8Car thomasCar = new SO03HW8Car();
        thomasCar.brand = "Lincoln";
        thomasCar.model = "Continental";
        thomasCar.color = "Black";
        thomasCar.year = 1965;

        SO03HW8City thomasCity = new SO03HW8City();
        thomasCity.city = "Chicago";
        thomasCity.state = "Illinois";

        SO03HW8Meeting thomasMeeting = new SO03HW8Meeting();
        thomasMeeting.place = "Club Hel";

        printPerson(thomas);
        printCity(thomasCity);
        printCar(thomasCar);
        printMeeting(thomasMeeting);

    }
    public static void printPerson(SO03HW8Person person){
        System.out.println(person.name+" "+person.lastName+","+ person.age+" is real name of "+person.nickName);
    }
    public static void printCity(SO03HW8City city){
        System.out.println("He lives in "+city.city+", "+city.state);
    }
    public static void printCar(SO03HW8Car car){
        System.out.println("Drives "+car.year+" "+car.color+" "+car.brand+" "+car.model);
    }
    public static void printMeeting(SO03HW8Meeting place){
        System.out.println("He had very important meeting at "+place.place);
    }

}
