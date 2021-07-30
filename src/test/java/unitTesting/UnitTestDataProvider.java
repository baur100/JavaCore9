package unitTesting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import zFLticket.CalculateTicket;

public class UnitTestDataProvider {
    // can use @DataProvider + @Test if we need to validate for different data, but using the same method
    @DataProvider(name ="tickets")
    public Object[][] getData(){
        return new Object[][]{
                {1,0.0, 1000},
                {5, 500.0, 1000},
                {19,1000.0, 1000},
                {68, 800.0, 1000}
        };
    }

    @Test(dataProvider = "tickets")
    public void ticketTests_calculatePrice_allAges(int age, double price, int baseFare) {
        CalculateTicket adult = new CalculateTicket(baseFare, age);
        double result = adult.getPrice();
        Assert.assertEquals(result, price);
    }
}
