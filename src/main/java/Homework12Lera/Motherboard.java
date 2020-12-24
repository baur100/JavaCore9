package Homework12Lera;

public class Motherboard {
    private String brand;
    private String model;
    private Proccessor processor;
            private Memory memory;

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

    public Proccessor getProcessor() {
        return processor;
    }

    public void setProcessor(Proccessor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Motherboard(String brand, String model, Proccessor processor, Memory memory) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.memory = memory;


    }
}
