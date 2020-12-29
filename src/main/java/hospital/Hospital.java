package hospital;

import lesson12.Address;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private Address address;

    public Hospital(String metodist) {
    }
//    private List<Doctor> doctors;
//    private HashMap<Integer,String> rooms;
   // private ArrayList<InsuranseCompanies> acceptedInsurance;


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                '}';
    }

    public Hospital(String hospitalName, Address address) {
        this.hospitalName = hospitalName;
        this.address = address;




    }
}

