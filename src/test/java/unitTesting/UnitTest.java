package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import ticket.CalculateTicket;

public class UnitTest {
    @Test
    public void ticketTests_infant_ticketPriceIsZero(){
        // Arrange (given)
        CalculateTicket infant = new CalculateTicket(1000,1);

        // Act (when)
        double price = infant.getPrice();

        // Assert (then)
        Assert.assertEquals(price,0.0);
    }

    @Test
    public void ticketTests_child_ticketIs50percent(){
        // Arrange
        CalculateTicket child = new CalculateTicket(1000,5);

        // Act
        double price = child.getPrice();

        // Assert
        Assert.assertEquals(price,500.0);
    }

    @Test
    public void ticketTests_adult_FullPrice(){
        CalculateTicket adult = new CalculateTicket(1000,25);

        double price = adult.getPrice();

        Assert.assertEquals(price,1000.0);
    }

    @Test
    public void ticketTests_senior_priceIs80percent(){
        CalculateTicket senior = new CalculateTicket(500,70);

        double price = senior.getPrice();

        Assert.assertEquals(price,400.0);
    }
}
