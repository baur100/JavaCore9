package hm15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {
        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(new Doctor("Eric","Jones",Position.DENTIST));
        doctorList.add(1,new Doctor("James","Smith",Position.OPTOMETRIST));
        doctorList.add(new Doctor("Liam","Davis",Position.PHARMACIST));
        doctorList.add(new Doctor("Oliver", "Miller",Position.CHIROPRACTOR));
        doctorList.add(4,new Doctor("Benjamin","Wilson",Position.PHYSICIAN));

        HashMap<Integer,String> rooms = new HashMap<>();
        rooms.put(101,"Emergency room");
        rooms.put(120,"Pharmacy");
        rooms.put(212,"Cleaning");
        rooms.put(304,"Children");
        rooms.put(104,"Intensive care");

        ArrayList<InsuranceCompanies> insuranceCompanies = new ArrayList<>();
        insuranceCompanies.add(InsuranceCompanies.AETNA);
        insuranceCompanies.add(InsuranceCompanies.UNITEDHEALTHCARE);
        insuranceCompanies.add(InsuranceCompanies.ANTHEM_INC);
        insuranceCompanies.add(InsuranceCompanies.CVS);
        insuranceCompanies.add(InsuranceCompanies.HUMANA);
        insuranceCompanies.add(InsuranceCompanies.KAISER_FOUNDATION);

        Hospital piedmont_atlanta = new Hospital("Piedmont Atlanta Hospital",new Address("1968 Peachtree Rd NW","Atlanta","GA",30309),
                doctorList.get(4),rooms.get(304),insuranceCompanies.get(3));
        System.out.println(piedmont_atlanta);

        Title[] x = {doctorList.get(0),doctorList.get(1),doctorList.get(2),doctorList.get(3),doctorList.get(4)};
        for (Title title : x) {
            System.out.println(title);
        }

        for (Map.Entry<Integer,String> entry : rooms.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
