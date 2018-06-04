package Browser.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by musti on 20/08/2017.
 */
public class ContactOfficePage {

        WebDriver driver;

        //@Given("^I navigate to contact page$")
        public void iNavigateToContactPage() throws Throwable {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pandrill\\Desktop\\Software Testing\\Automation\\Drivers\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.navigate().to("https://www.valtech.com/about/contact-us/");
            Thread.sleep(5000);
        }

       // @When("^I search for \"([^\"]*)\"$")
        public void iSearchFor(String link) throws Throwable {
            driver.findElement(By.xpath(link)).click();
        }
        //@Then("^I see respective \"([^\"]*)\"$")
        public void i_see_respective(String Offices) throws Throwable {
            Thread.sleep(2000);
            Assert.assertTrue(driver.getCurrentUrl().contains(Offices));
        }

       // @And("^I close browser$")
        public void iCloseBrowser() throws Throwable {
            driver.quit();
        }
    }

