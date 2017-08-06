package TestCases;

import Browser.base;
import Browser.pages.AssertLatesNewsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by musti on 06/08/2017.
 */
public class AssertLatestNews extends base {
    @Test
    public void AssertLatestTest() {
        AssertLatesNewsPage asp = new AssertLatesNewsPage(driver);
        Assert.assertTrue(asp.AssertLatestN());
        driver.close();


    }
}