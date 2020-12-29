package hospital;

public class App2 {
    public static void main(String[] args) {
        Hospital metodist = new Hospital("Metodist");
        System.out.println(metodist.getHospitalName());

        Address hospitalAddress = new Address("22 5th ave", "New York", "NY", 10009);
        System.out.println();

    }
}
