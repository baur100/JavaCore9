package homeWork9SO03;

public class SO03Movie {
    private String movieTitle;
    private String directorName;
    private String directorLastName;
    private int year;

    public SO03Movie(String movieTitle, String directorName, String directorLastName, int year){
        this.movieTitle = movieTitle;
        this.directorName = directorName;
        this.directorLastName = directorLastName;
        this.year = year;
    }
    public SO03Movie(String movieTitle, String directorLastName, int year){
        this.movieTitle = movieTitle;
        this.directorLastName = directorLastName;
        this.year = year;
    }
    public SO03Movie(){}

    public void setMovieTitle(String movieTitle){
        this.movieTitle = movieTitle;
    }
    public String getMovieTitle(){
        return movieTitle;
    }
    public void setDirectorName(String directorName){
        this.directorName = directorName;
    }
    public String getDirectorName(){
        return directorName;
    }
    public void setDirectorLastName(String directorLastName){
        this.directorLastName = directorLastName;
    }
    public String getDirectorLastName(){
        return directorLastName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}
