package homeWork12SO03;

public class SO03HW23Motherboard {
    private String brand;
    private String model;
    private SO03HW12Processor processor;
    private SO03HW12Memory memory;

    public SO03HW23Motherboard(String brand, String model, SO03HW12Processor processor, SO03HW12Memory memory) {
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

    public SO03HW12Processor getProcessor() {
        return processor;
    }

    public void setProcessor(SO03HW12Processor processor) {
        this.processor = processor;
    }

    public SO03HW12Memory getMemory() {
        return memory;
    }

    public void setMemory(SO03HW12Memory memory) {
        this.memory = memory;
    }


    public String toString() {
        return brand + " " + model+ " " + "\nProcessor - " + processor + " " + "\nMemory - " +memory;
    }
}
