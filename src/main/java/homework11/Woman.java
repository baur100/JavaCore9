package homework11;

import java.util.Arrays;

public class Woman {
    private Clothing[] clothing;
    private String name;
    private String city;

    @Override
    public String toString() {
        return "Woman{" +
                "clothing=" + Arrays.toString(clothing) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Clothing[] getClothing() {
        return clothing;
    }

    public void setClothing(Clothing[] clothing) {
        this.clothing = clothing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Woman(Clothing[] clothing, String name, String city) {
        this.clothing = clothing;
        this.name = name;
        this.city = city;



    }
}
