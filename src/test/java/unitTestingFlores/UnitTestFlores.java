package unitTestingFlores;

import org.testng.Assert;
import org.testng.annotations.Test;
import ticketFlores.CalculateTicket;

public class UnitTestFlores {
    @Test
    public void infant_ticketPriceIsZero(){
        //Arrange (given)
        CalculateTicket infant = new CalculateTicket(1000,1);
        //Act (when)
        double price = infant.getPrice();
        //Assert (then)
        Assert.assertEquals(price,0.0);
    }
    @Test
    public void child_ticketPriceIs50percent(){
        CalculateTicket child = new CalculateTicket(1000,5);
        double price = child.getPrice();
        Assert.assertEquals(price,500.0);
    }
    @Test
    public void adult_ticketFullPrice(){
        CalculateTicket adult = new CalculateTicket(1000,25);
        double price = adult.getPrice();
        Assert.assertEquals(price,1000.0);
    }
    @Test
    public void senior_ticketPriceIs80percent(){
        CalculateTicket senior = new CalculateTicket(1000,70);
        double price = senior.getPrice();
        Assert.assertEquals(price,800.0);
    }
}
