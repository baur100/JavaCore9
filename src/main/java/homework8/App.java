package homework8;


public class App {
    public static void main (String[] args) {
        Cat myCat = new Cat();
        myCat.name = "Cleo";
        myCat.breed = "Scottish";
        myCat.color = "Tabby";
        myCat.age = 15;
        myCat.gender = "female";


        Cat kitten = new Cat();
        kitten.name = "Taco";
        kitten.breed = "Main Coon";
        kitten.color = "Ginger";
        kitten.age = 5;
        kitten.gender = "male";

       printCat(myCat);
       printCat(kitten);

       kitten.adopt();

       ///////////////////////////////////////////////////////////////

       Vacuum zina = new Vacuum();
       zina.brand = "iRobot";
       zina.model = "Rumba";
       zina.series = 9;
       zina.color = "Black";

       Vacuum tolik = new Vacuum();
       tolik.brand = "Shark";
       tolik.model = "VacMop";
       tolik.series = 'R';
       tolik.color = "Grey";

       zina.startVacuum();
       tolik.startVacuum();

       zina.stopVacuum();
       tolik.stopVacuum();

       ////////////////////////////////////////////////////////////////////////////////////

        Movie fridayMovie = new Movie();
        fridayMovie.name = "The Aviator";
        fridayMovie.genre = "Drama";
        fridayMovie.director = "Martin Scorsese";
        fridayMovie.year = 2004;
        fridayMovie.time = 2.8;

        Movie favMovie = new Movie();
        favMovie.name = "Gone girl";
        favMovie.genre = "thriller";
        favMovie.director = "David Fincher";
        favMovie.year = 2014;
        favMovie.time = 2.3;


        favMovie.download();

        ////////////////////////////////////////////////////////////////////////

        Software mySoft = new Software();
        mySoft.name = "iOS";
        mySoft.version = 14.2;

        mySoft.update();



    }




    public static void printCat(Cat cat){
        System.out.println("Name = "+cat.name+
                "\nBreed = "+cat.breed+
                "\nColor = "+cat.color+
                "\nAge = "+cat.age+" months"+
                "\nGender = "+cat.gender);
    }

}
