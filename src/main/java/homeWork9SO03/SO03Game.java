package homeWork9SO03;

public class SO03Game {
    private String gameTitle;
    private String genre;
    private String developer;
    private String publisher;
    private int year;

    public SO03Game(String gameTitle, String genre, String developer, String publisher, int year){
        this.gameTitle = gameTitle;
        this.genre = genre;
        this.developer = developer;
        this.publisher = publisher;
        this.year = year;
    }
    public SO03Game(){}

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }
    public String getGameTitle(){
        return gameTitle;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setDeveloper(String developer) {
        this.developer = developer;
    }
    public String getDeveloper(){
        return developer;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void printInfoGame(){
        System.out.println("SO03Game: " +
                "\nGameTitle = " + gameTitle +
                "\nGenre = " + genre +
                "\nDeveloper = " + developer +
                "\nPublisher = " + publisher +
                "\nYear = " + year);
    }

}
