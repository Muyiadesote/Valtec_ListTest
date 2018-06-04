package TestCases;

import Browser.base;

import Browser.pages.LatestNewsPage;
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
        LatestNewsPage asp = new LatestNewsPage(driver);
        Assert.assertTrue(asp.AssertLatestN());
        driver.close();


    }
}

