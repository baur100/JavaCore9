package hwHospitalOB;

import java.util.List;

public class AppOB {
    public static void main(String[] args) {
        AdressOB nyuAddress = new AdressOB("1701 River Ave","NYC","NY",30012);
        Doctor surgeon = new Doctor("Noah","Andersson",Position.SURGEON);
        HospitalOB hospital = new HospitalOB("NYU Hospital",nyuAddress,surgeon);
        System.out.println(hospital);

        //Troubles with arraylist (Insurance Company) and List (Doctor);


    }
}
