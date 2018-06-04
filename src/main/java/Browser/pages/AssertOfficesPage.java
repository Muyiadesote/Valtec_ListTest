package Browser.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

//import static com.sun.deploy.perf.DefaultPerfHelper.labelList;

/**
 * Created by musti on 07/08/2017.
 */
public class AssertOfficesPage {

    WebDriver driver;

    public AssertOfficesPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath ="//main[@id='container']/section/div")
    private List<WebElement> totalRegionsPlaceHolder;

    @FindBy (xpath = ".//*[@id='navigationMenuWrapper']/div/ul/li[1]/a/span")
    private WebElement About;

    @FindBy (xpath = ".//*[@id='container']/div[9]/div[2]/a")
    private WebElement Offices;

    @FindBy (id = "CybotCookiebotDialogBodyButtonAccept")
    private WebElement closeCookies;


//    public boolean ValidateOffices(){
//        return  Offices.isDisplayed();
//    }

//    public List <String>ValOffices(WebElement[] webElement) {
//        List<String> Lst = new ArrayList<String>();
//        for (WebElement webElement : webElement){
//            labelList.add(webElement.getText());
//            return labelsList;
//        }
//
//        }

    public void AboutUs(){

        closeCookies.click();
        About.click();
        Offices.click();
    }

        public void ConfirmOffices() {

            List<WebElement> listofelement = driver.findElements(By.xpath(".//*[@id='container']/section/child::div/child::ul/child::li/child::article/child::div/child::header/child::h2/child::a"));

            for (int i = 0; i < listofelement.size(); i++) {
                WebElement allelement = listofelement.get(i);
                String actualelement = allelement.getText();
                System.out.println(actualelement);
//                String []expectedelement = {"London", "Manchester", "Bristol", "Paris", "Düsseldorf", "Frankfurt", "Munich", "Cologne", "Copenhagen", "Aarhus", "Stockholm", "Göteborg", "Malmö", "Uppsala", "Västerås", "New York", "Dallas", "Chicago", "Bengaluru", "Gurugram", "Montreal", "Toronto", "Ottawa", "Singapore", "Sydney", "Geneva", "Buenos Aires City", "Buenos Aires", "Amersfoort", "Amsterdam", "Eindhoven", "Utrecht", "Shanghai", "Florianópolis", "São Paulo", "Kiev"};
//                System.out.println(expectedelement);


                boolean status= allelement.isDisplayed();
                Assert.assertTrue(status);

            }
        }

        public void CountOffices(){

            int result = driver.findElements(By.xpath(".//*[@id='container']/section/child::div/child::ul/child::li/child::article/child::div/child::header/child::h2/child::a")).size();
            System.out.println("Total office displayed on page is " +result);

        }

}
