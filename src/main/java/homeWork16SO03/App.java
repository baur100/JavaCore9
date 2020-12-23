package homeWork16SO03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {


       Doctor house = new Doctor("Gregory","House",Position.NEPHROLOGIST);
       Doctor wilson = new Doctor("James","Wilson",Position.ONCOLOGIST);

       List <Doctor> doctors = new ArrayList<>();
       doctors.add(house);
       doctors.add(wilson);


        HashMap<Integer, Position > rooms = new HashMap<>();
        rooms.put(1, Position.ALLERGIST);
        rooms.put(4, Position.ENDOCRINOLOGIST);
        rooms.put(23, Position.NEPHROLOGIST);

        ArrayList<InsuranceCompanies> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add(InsuranceCompanies.AETNA);
        acceptedInsurances.add(InsuranceCompanies.UNITEDHEALTHCARE);
        acceptedInsurances.add(InsuranceCompanies.GUARDIAN);

        System.out.println(doctors);
        System.out.println(rooms);

        Address address = new Address("1 Plainsboro Rd","Princeton","NJ",8536);
        Hospital princetonPlainsboro = new Hospital("Princeton-Plainsboro Teaching Hospital",address ,doctors, acceptedInsurances, rooms);

        System.out.println(acceptedInsurances);
        princetonPlainsboro.printHospitalInfo();

    }
}
