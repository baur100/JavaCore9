package homework9IP;

public class Wine {
    private String category;
    private String foodPairing;
    private String glassType;
    private String  year;

    public Wine(String category, String foodPairing, String glassType, String year) {
        this.category = category;
        this.foodPairing = foodPairing;
        this.glassType = glassType;
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFoodPairing() {
        return foodPairing;
    }

    public void setFoodPairing(String foodPairing) {
        this.foodPairing = foodPairing;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public void printWineInfo() {
        System.out.println("Wine: " +
                "category: " + category +
                "\nFoodPairing: " + foodPairing +
                "\nGlassType:" + glassType +
                "\nYear=" + year);
    }
}
