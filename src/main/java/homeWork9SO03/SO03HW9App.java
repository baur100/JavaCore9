package homeWork9SO03;

import javax.sound.midi.Soundbank;

public class SO03HW9App {
    public static void main(String[] args) {

        SO03Movie titanic = new SO03Movie("Titanic", "James" ,"Cameron", 1997);
        titanic.printInfoMovie();
        System.out.println("----------");

        SO03Game doom = new SO03Game("DOOM", "action", "iD Software", "iD Software",1993);
        doom.printInfoGame();
        System.out.println("----------");

        SO03Music yesterday = new SO03Music("The Beatles", "Yesterday","Help!", 1965);
        yesterday.printInfoMusic();
        System.out.println("----------");

        SO03Car bmw = new SO03Car("BMW", "Z3","Blue", 1995);
        bmw.printInfoCar();
        System.out.println("----------");

    }
}
