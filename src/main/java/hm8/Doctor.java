package hm8;

public class Doctor {
    String doctorName;
    String insurance;
    int coPay;
    boolean appointment;

    public void printDoctor(){
        System.out.println("Dr."+doctorName+" is available for appointment:"+appointment+", with "
                +insurance+" insurance ("+coPay+"%) CoPay");
    }
}
