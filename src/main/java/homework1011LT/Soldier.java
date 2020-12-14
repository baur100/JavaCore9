package homework1011LT;

public class Soldier extends General {
    private int armyServiceNumber;
    private String rank;
    private String payGrade;

    public Soldier(String name, String lastName, int age, String gender, int armyServiceNumber, String rank, String payGrade) {
        super(name, lastName, age, gender);
        this.armyServiceNumber = armyServiceNumber;
        this.rank = rank;
        this.payGrade = payGrade;
    }


    public int getArmyServiceNumber() {
        return armyServiceNumber;
    }

    public void setArmyServiceNumber(int armyServiceNumber) {
        this.armyServiceNumber = armyServiceNumber;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }
    public Soldier(){}

    public void printInfo(){
        System.out.println("Name = "+name+
                "\nLast Name = "+lastName+
                "\nAge = "+age+
                "\nGender = "+gender+
                "\nRank = "+rank+
                "\nArmy Service Number = "+armyServiceNumber+
                "\nPay Grade = "+payGrade);
    }


}
