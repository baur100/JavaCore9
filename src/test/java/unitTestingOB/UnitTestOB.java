package unitTestingOB;

import org.testng.Assert;
import org.testng.annotations.Test;
import ticket.CalculateTicket;
import ticketOB.CalculateTicketOB;

public class UnitTestOB {
    @Test
    public void infant_ticketPriceIsZero(){
        //Arrange
        CalculateTicketOB infant = new CalculateTicketOB(1000,1);
        //Act

        double price = infant.getPrice();
        //Assert
        Assert.assertEquals(price,0.0);
    }
    @Test
    public void child_ticketIs50percentOff(){
        CalculateTicketOB child = new CalculateTicketOB(1000,12);

        double price = child.getPrice();
        Assert.assertEquals(price,500.0);
    }
    @Test
    public void adult_ticketIsBaseFare(){
        CalculateTicketOB adult = new CalculateTicketOB(1000,38);
        double price = adult.getPrice();
        Assert.assertEquals(price,1000.0);
    }
    @Test
    public void senior_TicketIs80percent(){
        CalculateTicket senior = new CalculateTicket(1000,80);
        double price = senior.getPrice();
        Assert.assertEquals(price,800.0);
    }
}
