package Homework8;

public class HW8 {
    public static void main(String[] args) {
        Person kate = new Person();
        kate.name = "Kate";
        kate.lastName = "Jonson";
        kate.eyeColor = "Blue";
        kate.age = 19;

        Person alex = new Person();
        alex.name = "Alexander";
        alex.lastName = "Pushkin";
        alex.eyeColor = "Brown";
        alex.age = 37;

        printPerson(kate);
        printPerson(alex);

        Vehicle8 myCar= new Vehicle8();
        myCar.brand = "Mersedes";
        myCar.model = "CLA250";
        myCar.color = "Silver";
        myCar.year = 2018;

        Vehicle8 myFriendsCar = new Vehicle8();
        myFriendsCar.brand = "Infinity";
        myFriendsCar.model = "QX60";
        myFriendsCar.color = "White";
        myFriendsCar.year = 2018;

        printVehicle8(myCar);
        printVehicle8(myFriendsCar);

        Library book = new Library();
        book.author ="Leo Tolstoy";
        book.title = "War and Peace";
        book.genre = "Novel";
        book.year = 1867;

        Library myBook = new Library();
        myBook.author = "Stephen King";
        myBook.title = "Rita Hayworth and Shawshank Redemption";
        myBook.genre = "Crime fiction";
        myBook.year = 1982;

        printLibrary(book);
        printLibrary(myBook);

        Building home = new Building();
        home.city = "Bloomington";
        home.state = "MN";
        home.type = "House";
        home.year = 2003;

        Building home1 = new Building();
        home1.city = "Austin";
        home1.state = "TX";
        home1.type = "Townhome";
        home1.year = 1996;

        printBuilding(home);
        printBuilding(home1);

    }

    public static void printPerson(Person person) {
        System.out.println("Name=" + person.name + "\nLastname=" + person.lastName
                + "\nAge=" + person.age + "\nEyeColor=" + person.eyeColor);
    }
    public static void printVehicle8(Vehicle8 vehicle8){
        System.out.println("Brand=" + vehicle8.brand +"\nModel=" + vehicle8.model+
                "\nColor=" + vehicle8.color + "\nYear= "+ vehicle8.year);
    }
    public static void printLibrary(Library library){
        System.out.println( "Author=" + library.author +"\nTitle=" + library.title
        +"\nGenre=" + library.genre + "\nYear=" + library.year);
    }
    public static void printBuilding(Building building){
        System.out.println("City=" + building.city + "\nState=" + building.state +
                "\nType =" + building.type + "\nYear=" + building.year);
    }


}

    