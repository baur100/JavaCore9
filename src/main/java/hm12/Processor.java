package hm12;

public class Processor {
    private String processor;

    public Processor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "processor=" +
                "'" + processor + '\'';
    }
}
