package zhm12;

public class Mouse extends Keyboard{

    public Mouse(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
