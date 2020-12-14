package hw9;

public class TV {
    private String make;
    private String model;
    private int serialNumber;

    public TV (String make, String model, int serialNumber ) {
        this.make = make;
        this.model = model;
        this.serialNumber = serialNumber; }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber () {return serialNumber;}

    public void setSerialNumber (int serialNumber) {this.serialNumber = serialNumber;}

    public void printIt ()
    {
        System.out.println("This is " + make + " TV," + " model #" + model + ", serial number is: " + serialNumber);

    }

}
