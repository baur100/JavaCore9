package HomeWork9;

public class AppBedroom {
    public static void main(String[] args){
        Bedroom master = new Bedroom();
        master.setName("Master");
        String xx = master.getName();
        System.out.println(xx);

        master.setNumberOfBathrooms(1);
        master.setSize(1000);
        int b = master.getNumberOfBathrooms();
        int sb = master.getSize();
        System.out.println(b);
        System.out.println(sb);


    }
}
