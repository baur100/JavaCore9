package HomeWork10_11;

public class HouseCats extends HouseAnimals {
    private String catBread;

    public HouseCats(String bread, String habitat, String diet, String nickname, int age, String catBread) {
        super(bread, habitat, diet, nickname, age);
        this.catBread = catBread;
    }

    public void setCatBread(String catBread) {
        this.catBread = catBread;
    }

    public String getCatBread() {
        return catBread;
    }
}



