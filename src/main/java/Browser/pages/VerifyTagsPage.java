package Browser.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by musti on 06/08/2017.
 */
public class VerifyTagsPage {
    WebDriver driver;
    public VerifyTagsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = ".//*[@id='navigationMenuWrapper']/div/ul/li[1]/a/span")
    private WebElement About;

    @FindBy (xpath = ".//*[@id='container']/div[1]/h1")
    private WebElement PageAbout;

    @FindBy (xpath = ".//*[@id='navigationMenuWrapper']/div/ul/li[3]/a/span")
    private WebElement Services;

    @FindBy (xpath = ".//*[@id='container']/section/header/h1")
    private WebElement PageServices;

    @FindBy (xpath = ".//*[@id='navigationMenuWrapper']/div/ul/li[2]/a/span")
    private WebElement Work;

    @FindBy (xpath = ".//*[@id='container']/header/h1")
    private WebElement PageWork;

    @FindBy (xpath = "//*[@id='CybotCookiebotDialogBodyLevelButtonAccept']")
    private WebElement closeCookies;

    public void OpenAbout(){
        closeCookies.click();
        About.click();
    }
    public void OpenServices() {
        Services.click();
    }
    public void OpenWork() {

        Work.click();
    }
    public boolean AssertServices(){

        return PageServices.isDisplayed();
    }
    public boolean AssertAbout() {
        return PageAbout.isDisplayed();

    }
    public boolean AssertWork() {

        return PageWork.isDisplayed();
    }
}
