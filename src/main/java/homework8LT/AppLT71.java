package homework8LT;

import lesson8.App;
import lesson8.Person;
import lesson8.Vehicle;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.lang.reflect.AnnotatedArrayType;

public class AppLT71 {
    public static void main(String[] args) {
        Athlete Lebron = new Athlete();
        Lebron.name = "Lebron";
        Lebron.lastName = "James";
        Lebron.sport = "Basketball";
        Lebron.age = 35;
        Lebron.olympic = true;
        Lebron.champion = true;
        Lebron.yesOlympic();
        Lebron.yesChampion();

        Athlete Aaron = new Athlete();
        Aaron.name = "Aaron";
        Aaron.lastName = "Rodgers";
        Aaron.sport = "NFL Football";
        Aaron.age = 36;
        Aaron.olympic = false;
        Aaron.champion = true;
        Aaron.yesOlympic();
        Aaron.yesChampion();

        Athlete Isiah = new Athlete();
        Isiah.name = "Isiah";
        Isiah.lastName = "Thomas";
        Isiah.age = 59;
        Isiah.sport = "Basketball";
        Isiah.olympic = false;
        Isiah.champion = true;
        Isiah.yesOlympic();
        Isiah.yesChampion();

        Apparel Gap = new Apparel();
        Gap.name = "Gap";
        Gap.producedIn = "China";
        Gap.price = 40;
        Gap.market = "kids";
        Gap.yesExpensive();


        Apparel Zegna = new Apparel();
        Zegna.name = "Zegna";
        Zegna.producedIn = "Italy";
        Zegna.price = 500;
        Zegna.market = "Men";
        Zegna.yesExpensive();


        Apparel Valentino = new Apparel();
        Valentino.name = "Valentino";
        Valentino.producedIn = "France";
        Valentino.price = 1000;
        Valentino.market = "Women";
        Valentino.yesExpensive();


        Gambling Blackjack = new Gambling();
        Blackjack.name = "Blackjack";
        Blackjack.type = "Card game";
        Blackjack.minBet = 5;
        Blackjack.oddsOfWinning= 0.175;
        Blackjack.goodChance();

        Gambling xx = new Gambling();
        xx.name = "Slot Machine";
        xx.type = "Mechanical game of chance";
        xx.minBet = 1;
        xx.oddsOfWinning = 0.05;
        xx.goodChance();

        Gambling yy = new Gambling();
        yy.name = "Craps";
        yy.type = "Dice game";
        yy.minBet = 10;
        yy.oddsOfWinning = 0.2;
        yy.goodChance();

        MovieTicket aa = new MovieTicket();
        aa.name = "Amanda";
        aa.age = 11;
        aa.gender = "female";
        aa.moviePrice();

        MovieTicket bb = new MovieTicket();
        bb.name = "Billy";
        bb.age = 4;
        bb.gender = "male";
        bb.moviePrice();

        MovieTicket cc = new MovieTicket();
        cc.name = "Janice";
        cc.age = 35;
        cc.gender = "female";
        cc.moviePrice();



    }







}
