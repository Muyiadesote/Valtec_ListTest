package TestCases;

import Browser.base;
import Browser.pages.AssertOfficesPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertOfficesTest extends base {

    @Test
    public void AssertOfficeTest() {
        AssertOfficesPage asop = new AssertOfficesPage (driver);
        asop.AboutUs();
        asop.ConfirmOffices();
        asop.CountOffices();
        driver.close();


    }
}


