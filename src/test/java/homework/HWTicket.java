package homework;

import org.testng.Assert;
import org.testng.annotations.Test;
import ticket.CalculateTicket;

public class HWTicket {
    @Test
    public void infant_ticketPriceIsZero(){
        CalculateTicket infant = new CalculateTicket(1000, 1);
        double price = infant.getPrice();
        Assert.assertEquals(price,0.0);
    }
    @Test
    public void child_ticketIs50percent(){
        CalculateTicket child = new CalculateTicket(1000,10 );
        double price = child.getPrice();
        Assert.assertEquals(price, 500.0);
    }
    @Test
    public void adult_ticketFullPrice(){
        CalculateTicket adult = new CalculateTicket(1000,60);
        double price= adult.getPrice();
        Assert.assertEquals(price, 1000.0);
    }
    @Test
    public void senior_ticketIs80percent(){
        CalculateTicket senior = new CalculateTicket(1000,68);
        double price= senior.getPrice();
        Assert.assertEquals(price,800.0);
    }
    @Test
    public void infant_ticketPriseIsZero(){
        CalculateTicket infant = new CalculateTicket(1000,2);
        double price= infant.getPrice();
        Assert.assertEquals(price,0.0);
    }
}
