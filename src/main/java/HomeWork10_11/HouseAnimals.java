package HomeWork10_11;

public class HouseAnimals extends  Animals {
    private String nickname;
    private  int age;

    public HouseAnimals(String bread, String habitat, String diet, String nickname, int age) {
        super(bread, habitat, diet);
        this.nickname = nickname;
        this.age = age;
    }


    public HouseAnimals(String bread, String habitat, String nickname, int age) {
        super(bread, habitat);
        this.nickname = nickname;
        this.age = age;
    }

    public HouseAnimals(String pudel, String home, String meat, String sharik, Toys[] shariktoys, Toys bone) {
        super();
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


