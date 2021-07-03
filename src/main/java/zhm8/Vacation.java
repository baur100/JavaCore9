package zhm8;

public class Vacation {
    public String when;
    public int days;
    public String transport;
    public double hours;

    public void vacation_plans(){
        System.out.println("I am going to vacation on "+when+" for "+days+" day/days. I will use "+
        transport+" to get there. It will take "+hours+" hours. I'm excited!");
    }
}
