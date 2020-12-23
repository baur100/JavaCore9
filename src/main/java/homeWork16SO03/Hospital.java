package homeWork16SO03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private List<InsuranceCompanies> companies;
    private HashMap<Integer, Position> rooms;


    public Hospital(String hospitalName, Address address, List<Doctor> doctors, ArrayList<InsuranceCompanies> companies, HashMap<Integer, Position> rooms) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.companies = companies;
        this.rooms = rooms;
    }


    public void printHospitalInfo(){
        System.out.println("Hospital name: " + hospitalName + ", address = " + address);
        for (Doctor d: doctors){
            System.out.println(d);
        }
        for (InsuranceCompanies i: companies){
            System.out.println(i);
        }
        rooms.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });
    }
}
