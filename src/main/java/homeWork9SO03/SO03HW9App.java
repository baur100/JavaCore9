package homeWork9SO03;

import javax.sound.midi.Soundbank;

public class SO03HW9App {
    public static void main(String[] args) {

        SO03Movie titanic = new SO03Movie("Titanic", "James" ,"Cameron", 1997);
        printMovieInfo(titanic);

        SO03Game doom = new SO03Game("DOOM", "action", "iD Software", "iD Software",1993);
        printGameInfo(doom);

        SO03Music yesterday = new SO03Music("The Beatles", "Yesterday","Help!", 1965);
        printMusicInfo(yesterday);

        SO03Car bmw = new SO03Car("BMW", "Z3","Blue", 1995);
        printCarInfo(bmw);

    }

    public static void printMovieInfo(SO03Movie titanic) {
        System.out.println(titanic.getMovieTitle());
        System.out.println(titanic.getDirectorName());
        System.out.println(titanic.getDirectorLastName());
        System.out.println(titanic.getYear());
    }
    public static void printGameInfo(SO03Game doom){
        System.out.println(doom.getGameTitle());
        System.out.println(doom.getGenre());
        System.out.println(doom.getDeveloper());
        System.out.println(doom.getPublisher());
        System.out.println(doom.getYear());
    }
    public static void printMusicInfo(SO03Music yesterday){
        System.out.println(yesterday.getArtistName());
        System.out.println(yesterday.getSongName());
        System.out.println(yesterday.getAlbumName());
        System.out.println(yesterday.getYear());
    }
    public static void printCarInfo(SO03Car bmw){
        System.out.println(bmw.getBrand());
        System.out.println(bmw.getModel());
        System.out.println(bmw.getColor());
        System.out.println(bmw.getYear());
    }


}
