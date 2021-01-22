package homework16OB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppOB {
   /* public static void main(String[] args) {
       AddressOB address = new AddressOB("1901 River Str.","98000","New York");
       HashMap<Integer,String> rooms = new HashMap<>();
       rooms.put(22,"Gastroenterology");
       rooms.put(31,"Pediatrics");
       rooms.put(44,"Surgery Room");
       rooms.put(12,"Optometry");
       Doctor doctor1 = new Doctor("Luis","Smith",Position.SURGEON);
       InsuranceCompanies myCompany = InsuranceCompanies.AETNA;
       myCompany.

       List<Doctor> doctors = new ArrayList<>();
       doctors.add(doctor1);
        System.out.println(rooms.get(22));

     //  HospitalOB hospital = new HospitalOB("klk",address ,doctor1,myCompany, rooms.get(22));


               //Create class Hospital
               //Fields
               //- private String hospitalName;
               //- privare Address address;
               //    (Class Address
               //    - private String streetAddress;
               //    - private String town;
               //    - private String state;
               //    - private int zip;
               //- private List<Doctor> doctors;
               //    (Class Doctor
               //    - private String name;
               //    - private String lastName;
               //    - private Position position;
               //    (Enum Title is a enum with 5 members - for example Position.PHYSICIAN);
               //- private HashMap<Integer,String> rooms; (list of rooms and their names - for example room 22 - Gastroenterology rooms.put(22,"Gastroenterology") )
               //- private ArrayList<InsuranseCompamies> acceptedInsuranses; list of accepted insurance.
               //    (Enum InsuranseCompamies - enum of Insuranses,  for example InsuranseCompamies.AETNA, InsuranseCompamies.UnitedHealthcare)
               //Methods:
               //- Printout hospital with ALL fields
               //- Printout Doctors and their titles; public void printDoctors();
               //- Printout rooms

    }
}
