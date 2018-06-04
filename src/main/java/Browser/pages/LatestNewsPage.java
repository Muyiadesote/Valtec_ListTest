package Browser.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by musti on 06/08/2017.
 */
public class LatestNewsPage {

    WebDriver driver;

    public LatestNewsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = ".//*[@id='container']/div[2]/div[3]/div[1]/header/h2")
    private WebElement LatestNews;


    public boolean AssertLatestN()
    {

        return LatestNews.isDisplayed();
    }
}
