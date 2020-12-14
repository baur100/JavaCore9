package homework9;

public class Movie {
    private String title;
    private String genre;
    private int year;

    public Movie(String title, String genre, int year){
        this.title = title;
        this.genre = genre;
        this.year = year;

    }

    public void setTitle (String t){
        this.title = title;

    }
    public void setGenre (String g){
        this.genre=genre;

    }
    public void setYear (int y){
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getYear(){
        return year;

    }
    public Movie(){

    }
    public void printClass(){
        System.out.println("Title="+ this.title + "\nGenre="+ this.genre + "\nYear= "+ this.year);
    }
}



