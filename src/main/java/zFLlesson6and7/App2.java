package zFLlesson6and7;

public class App2 {
    public static void main(String[] args){
        System.out.println("infant 1yr $"+calculateTicketPrice(1, 100));
        System.out.println("child 5yr $"+calculateTicketPrice(5, 100));
        System.out.println("adult 32yr $"+calculateTicketPrice(32, 100));
        System.out.println("senior 75yr $"+calculateTicketPrice(75, 100));
    }

    public static double calculateTicketPrice(int age, double baseFare) {
        if (age<=2){
            return 0; /* functions do not work after return statement(will stop at this point).
            This way is more beneficial compare to use return at the end - it takes less time for a system to run it */
        }
        if (age<=13){
            return baseFare*0.5;
        }
        if (age>=66){
            return baseFare*0.8;
        }
        else return baseFare;
    }
}
