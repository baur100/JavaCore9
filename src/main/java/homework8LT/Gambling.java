package homework8LT;

public class Gambling {
    public String name;
    public String type;
    public int minBet;
    public double oddsOfWinning;

    public void goodChance(){
        if(oddsOfWinning < 0.15){
            System.out.println("Playing "+name+" is a "+type+" with a minimum bet of $"+minBet+" and where the chances of winning is low");
        }else{
            System.out.println("Playing "+name+" is a "+type+" with a minimum bet of $"+minBet+" and where the chances of winning is better");
        }
    }
}
