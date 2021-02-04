package ticketOB;

public class CalculateTicketOB {
    private double baseFare;
    private int age;

    public CalculateTicketOB(double baseFare, int age) {
        this.baseFare = baseFare;
        this.age = age;
    }
    public double getPrice(){
        if (this.age<=2){
            return 0;
        }
        if (this.age<=12){
            return this.baseFare*0.5;
        }
        if (this.age>66){
            return this.baseFare*0.8;
        }
        return  this.baseFare;

    }
}
