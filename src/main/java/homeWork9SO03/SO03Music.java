package homeWork9SO03;

public class SO03Music {
    private String artistName;
    private String songName;
    private String albumName;
    private int year;

    public SO03Music(String artistName, String songName, String albumName, int year){
        this.artistName = artistName;
        this.songName = songName;
        this.albumName = albumName;
        this.year = year;
    }
    public SO03Music(){}

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
    public String getArtistName(){
        return artistName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getSongName(){
        return songName;
    }
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    public String getAlbumName(){
        return albumName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void printInfoMusic(){
        System.out.println("SO03Music: " +
                "\nArtistName = " + artistName +
                "\nSongName = " + songName +
                "\nAlbumeName = " + albumName +
                "\nYear = " + year);
    }
}
