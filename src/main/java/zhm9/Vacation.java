package zhm9;

public class Vacation {
    private String when;
    private int days;
    private String transport;
    private double hours;

    public Vacation(){}

    public Vacation(String when, int days, String transport, double hours){
        this.when=when;
        this.days=days;
        this.transport=transport;
        this.hours=hours;
    }

    public void setWhen(String when){
        this.when=when;
    }
    public String getWhen(){
        return when;
    }

    public void setDays(int days){
        this.days=days;
    }
    public int getDays(){
        return days;
    }
    public void setTransport(String transport){
        this.transport=transport;
    }
    public String getTransport(){
        return transport;
    }

    public void setHours(double hours){
        this.hours=hours;
    }

    public double getHours() {
        return hours;
    }

    private String printInfo(){
        return "I am going to vacation on "+when+" for "+days+" day/days. I will use "+
                transport+" to get there. It will take "+hours+" hours. I'm excited!";
    }

    public void printClass(){
        System.out.println(printInfo());
    }
}
