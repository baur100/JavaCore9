package unitTesting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ticket.CalculateTicket;

public class Parametrized {
    @DataProvider(name = "ticketsInfo")
    public Object[][] createData(){
        return new Object[][] {
                {1000,1,0.0},
                {1000,5,500.0},
                {1000,23,1000.0},
                {1000,70,800.0}
        };
    }
    @Test(dataProvider = "ticketsInfo")
    public void testTicketPrice(int basePrice,int age, double expectedPrice){
        CalculateTicket calculateTicket = new CalculateTicket(basePrice,age);
        double actualPrice = calculateTicket.getPrice();
        Assert.assertEquals(actualPrice,expectedPrice);
    }
}
