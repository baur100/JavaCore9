package homework11IP;

public class App {
    public static void main(String[] args) {
        City[] cities = {City.NEW_YORK, City.ALBANY};

        State myState = new State("NY", cities);
        System.out.println("State " + myState.getName() +" has next cities:");

        for (int i = 0; i < myState.getCities().length; i++) {
            System.out.println(myState.getCities()[i]);
        }
    }
}
