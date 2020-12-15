package homeWork1011SO03;

public class SO03HW1011Furniture {
    private String furniture;
    SO03HW1011Woods woods;

    public SO03HW1011Furniture(String furniture, SO03HW1011Woods woods) {
        this.furniture = furniture;
        this.woods = woods;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public SO03HW1011Woods getWoods() {
        return woods;
    }

    public void setWoods(SO03HW1011Woods woods) {
        this.woods = woods;
    }

    @Override
    public String toString() {
        return "SO03HW1011Furniture{" +
                "furniture='" + furniture + '\'' +
                ", woods=" + woods +
                '}';
    }
}
