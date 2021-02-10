package hwHospitalOB;

import java.util.ArrayList;
import java.util.List;

public class HospitalOB {
    private String hospitalName;
    private AdressOB address;
    private List<Doctor> doctors;
    //private HashMap <Integer,String> rooms;
    private ArrayList<InsuranceCompanies> acceptedInsurances;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public AdressOB getAddress() {
        return address;
    }

    public void setAddress(AdressOB address) {
        this.address = address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<InsuranceCompanies> getAcceptedInsurances() {
        return acceptedInsurances;
    }

    public void setAcceptedInsurances(ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.acceptedInsurances = acceptedInsurances;
    }

    public HospitalOB(String hospitalName, AdressOB address, List<Doctor> doctors, ArrayList<InsuranceCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.acceptedInsurances = acceptedInsurances;

    }

    public HospitalOB(String hospitalName, AdressOB address, List<Doctor> doctors) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;

    }
}
