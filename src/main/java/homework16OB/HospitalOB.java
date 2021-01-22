package homework16OB;

import java.util.ArrayList;
import java.util.HashMap;


public class HospitalOB {
    private String hospitalName;
    private AddressOB address;
    private Doctor doctors;
    private ArrayList<InsuranceCompanies> insurance;
    private HashMap<Integer,String> rooms;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public AddressOB getAddress() {
        return address;
    }

    public void setAddress(AddressOB address) {
        this.address = address;
    }

    public Doctor getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor doctors) {
        this.doctors = doctors;
    }

    public ArrayList<InsuranceCompanies> getInsurance() {
        return insurance;
    }

    public void setInsurance(ArrayList<InsuranceCompanies> insurance) {
        this.insurance = insurance;
    }

    public HashMap<Integer, String> getRooms() {
        return rooms;
    }

    public void setRooms(HashMap<Integer, String> rooms) {
        this.rooms = rooms;
    }

    public HospitalOB(String hospitalName, AddressOB address, Doctor doctors, ArrayList<InsuranceCompanies> insurance,
                      HashMap<Integer, String> rooms) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.insurance = insurance;
        this.rooms = rooms;

    }
}

