package hw12comp;

public class Motherboard {
    private String brand;
    private String model;
    private Processor processor;
    private Memory memory;

    public Motherboard(String brand, String model, Processor processor, Memory memory) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "\nbrand='" + brand + '\'' +
                "\nmodel='" + model + '\'' +
                "\nprocessor=" + processor +
                "\nmemory=" + memory;
    }
}
