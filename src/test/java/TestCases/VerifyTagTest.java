package TestCases;

import Browser.base;
import Browser.pages.VerifyTagsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by musti on 06/08/2017.
 */
public class VerifyTagTest extends base {

    @Test(priority = 1)
    public void ConfirmTagAbout(){
        VerifyTagsPage vtp = new  VerifyTagsPage(driver);
        vtp.OpenAbout();
        Assert.assertTrue(vtp.AssertAbout());

        vtp.OpenServices();
        Assert.assertTrue(vtp.AssertServices());

        vtp.OpenWork();
        Assert.assertTrue(vtp.AssertWork());
        driver.close();

    }
}
