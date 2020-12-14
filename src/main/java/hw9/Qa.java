package hw9;

public class Qa extends TeamMember{
    private String country;
    private String teamName;

    public Qa(String name, String lastName, int birthYear, String country, String teamName) {
        super(name, lastName, birthYear);
        this.country = country;
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public String getTeamName() {
        return teamName;
    }
}
