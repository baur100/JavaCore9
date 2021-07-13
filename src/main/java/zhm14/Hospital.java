package zhm14;

import java.util.List;
import java.util.Map;

public class Hospital {
    private String hospitalName;
    private Address address;
    private List<Doctor> doctors;
    private Map<Integer, String> rooms;
    private List<InsurancesCompanies> acceptedInsurances;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsurancesCompanies> acceptedInsurances) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsurances = acceptedInsurances;
    }

    //    Printout hospital with ALL fields
    public void printAllFields() {
        System.out.println("Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", address=" + address +
                ", doctors=" + doctors +
                ", rooms=" + rooms +
                ", acceptedInsurances=" + acceptedInsurances +
                '}');
    }

//- Printout Doctors and their titles;
    public void printDoctors(){
        System.out.println(doctors.toString());
    }

//- Printout rooms
    public void printRooms(){
        System.out.println(rooms.toString());
    }
}
