package zhm14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {

        Address augusta1= new Address("123 Washington Rd","Augusta","GA",30808);
        Doctor doctor1 = new Doctor("Henry","Jonson",Position.DENTIST);
        Doctor doctor2 = new Doctor("Alex", "Gonzales",Position.PHARMACIST);
        List<Doctor> doctorsG1 = new ArrayList<>();
        doctorsG1.add(doctor1);
        doctorsG1.add(doctor2);

        Map<Integer, String> roomsG1= new HashMap<>();
        roomsG1.put(101,"Cleaning service");
        roomsG1.put(103,"Pharmacy");

        List<InsurancesCompanies> insurancesG1 = new ArrayList<>();
        insurancesG1.add(InsurancesCompanies.AETNA);
        insurancesG1.add(InsurancesCompanies.ANTHEM_INC);

        Hospital augustaUniversity = new Hospital("Augusta University",augusta1, doctorsG1, roomsG1, insurancesG1);

        augustaUniversity.printAllFields();
        augustaUniversity.printDoctors();
        augustaUniversity.printRooms();

    }
}
