package zhm12;

public class Motherboard extends Keyboard{
    private Memory Memory;
    private Processor Processor;

    public Motherboard(String brand, String model, zhm12.Memory memory, zhm12.Processor processor) {
       super(brand,model);
        this.Memory = memory;
        this.Processor = processor;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", Memory=" + Memory +
                ", Processor=" + Processor +
                '}';
    }
}
