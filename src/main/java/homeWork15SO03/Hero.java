package homeWork15SO03;

public class Hero {
    String hero;

    public Hero(String hero) {
        this.hero = hero;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    @Override
    public String toString() {
        return hero + "'s ";
    }
}
