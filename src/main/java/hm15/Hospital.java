package hm15;

public class Hospital {
    private String hospitalName;
    private Address address;
    private Doctor doctors;
    private String rooms;
    private InsuranceCompanies acceptedInsuranses;

    public Hospital(String hospitalName, Address address, Doctor doctors, String rooms, InsuranceCompanies acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Doctor getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor doctors) {
        this.doctors = doctors;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public InsuranceCompanies getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void setAcceptedInsuranses(InsuranceCompanies acceptedInsuranses) {
        this.acceptedInsuranses = acceptedInsuranses;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + hospitalName + '\'' +
                ", " + address +
                ", " + doctors +
                ", rooms='" + rooms + '\'' +
                ", acceptedInsuranses=" + acceptedInsuranses +
                '}';
    }
}
