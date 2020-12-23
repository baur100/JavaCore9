package homeWork16SO03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {

       Hospital princetonPlainsboro = new Hospital("Princeton-Plainsboro Teaching Hospital",new Address("1 Plainsboro Rd","Princeton","NJ",8536));
       Doctor house = new Doctor("Gregory","House",Position.NEPHROLOGIST);
       Doctor wilson = new Doctor("James","Wilson",Position.ONCOLOGIST);

       List <Doctor> doctors = new ArrayList<>();
       doctors.add(house);
       doctors.add(wilson);


        HashMap<Integer,String > rooms = new HashMap<>();
        rooms.put(1, "Exam room");
        rooms.put(4, "Ophthalmology");
        rooms.put(23, "Oncology");

        ArrayList<InsuranceCompanies> acceptedInsurances = new ArrayList<>();
        acceptedInsurances.add(InsuranceCompanies.AETNA);
        acceptedInsurances.add(InsuranceCompanies.UNITEDHEALTHCARE);
        acceptedInsurances.add(InsuranceCompanies.GUARDIAN);

        System.out.println(princetonPlainsboro);
        System.out.println(doctors);
        System.out.println(rooms);

        System.out.println(acceptedInsurances);

    }
}
