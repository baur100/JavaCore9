package zhm12;

public class Processor extends Keyboard{

    public Processor(String brand, String model) {
        super(brand,model);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
