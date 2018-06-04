package TestCases;

import Browser.base;
import Browser.pages.AssertOfficesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by musti on 07/08/2017.
 */
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


