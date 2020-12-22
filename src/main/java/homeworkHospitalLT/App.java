package homeworkHospitalLT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Doctors ally = new Doctors("Ally", "Santos", Position.CARDIOLOGIST);
        Doctors john = new Doctors("John", "Smith", Position.CARDIOLOGIST);
        Doctors mary = new Doctors("Mary", "Jones", Position.ANESTHESIOLOGIST);
        Doctors sally = new Doctors("Sally", "Ride", Position.NEUROLOGIST);
        Doctors robert = new Doctors("Robert", "Hiemlich", Position.PATHOLOGIST);
        Doctors anthony = new Doctors("Anthony", "Deguzman", Position.INTERNIST);

        ArrayList<Doctors> listOfDoctors = new ArrayList<>();
        listOfDoctors.add(john);
        listOfDoctors.add(mary);
        listOfDoctors.add(sally);
        listOfDoctors.add(robert);
        listOfDoctors.add(anthony);


        System.out.println(listOfDoctors);
        Address forFrancis = new Address("2626 Woodward St", "Costa Mesa", "CA", 91010);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(forFrancis);

        HashMap<Integer, String> francisRooms = new HashMap<>();
        francisRooms.put(101, "Administration");
        francisRooms.put(102, "Laboratory");
        francisRooms.put(103, "Cardio Office");
        francisRooms.put(201, "Surgery Rm 201");
        francisRooms.put(202, "Surgery Rm 202");
        francisRooms.put(104, "Neurology Office");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(francisRooms);

        ArrayList<InsuranceCompanies>francisInsurance = new ArrayList<>();
        francisInsurance.add(InsuranceCompanies.AETNA);
        francisInsurance.add(InsuranceCompanies.WELLCARE);
        francisInsurance.add(InsuranceCompanies.KAISER_PERMANENTE);
        francisInsurance.add(InsuranceCompanies.MOLINA_HEALTHCARE);
        francisInsurance.add(InsuranceCompanies.CIGNA);
        francisInsurance.add(InsuranceCompanies.HEALTH_NET);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        System.out.println(francisInsurance);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        Hospital stFrancis = new Hospital("2626 Woodward St", "Costa Mesa", "CA", 91010, "St. Francis Medical Center", listOfDoctors, francisRooms, francisInsurance);

        System.out.println(stFrancis);



        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        stFrancis.hospitalInfo();







    }
}
