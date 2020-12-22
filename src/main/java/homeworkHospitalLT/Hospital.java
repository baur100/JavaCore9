package homeworkHospitalLT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hospital extends Address {
    private String name;
    private ArrayList<Doctors> listOfDoctors;
    private HashMap<Integer, String> room;
    private ArrayList<InsuranceCompanies> acceptedCompanies;

    public Hospital(String streetAddress, String town, String state, int zip, String name, ArrayList<Doctors> listOfDoctors, HashMap<Integer, String> room, ArrayList<InsuranceCompanies> acceptedCompanies) {
        super(streetAddress, town, state, zip);
        this.name = name;
        this.listOfDoctors = listOfDoctors;
        this.room = room;
        this.acceptedCompanies = acceptedCompanies;
    }

    @Override
    public String toString() {
        return "Hospital: " + name +
                "\n"+super.toString()+
                "\nList of Doctors:" +
                "\n"+listOfDoctors +
                "\nRooms: " +
                "\n"+room +
                "\nAcceptedCompanies:" +
                "\n"+acceptedCompanies
                 ;
    }

    public void hospitalInfo(){
        System.out.println("Hospital: "+name+
        "\nAddress: "+super.toString()+
        "\nList of Doctors: ");
        for(Doctors list: listOfDoctors) {
            System.out.println(list);
        }
        System.out.println("Room Directory: ");
        for(Map.Entry<Integer, String> roomDirectory : room.entrySet()
        ){
            System.out.println(roomDirectory);
        }
        System.out.println("Accepted Insurance Companies: ");
        for(InsuranceCompanies accepted: acceptedCompanies ){
            System.out.println(accepted);
        }



    }
}
