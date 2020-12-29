package hospital;

import javax.swing.text.Position;

public class App3 {
    public static void main(String[] args) {
        Doctor jane = new Doctor("Jane","Wilson", Position.PULMONOLOGIST);
        Doctor will = new Doctor("Will","Smith",Position.RADIOLOGIST);
        Doctor john = new Doctor("John","Queen",Position.Endocrinologist);
        Doctor anna = new Doctor("Anna","Zalman",Position.GASTROENTEROLOGIST);
    }
}
