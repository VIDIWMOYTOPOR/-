package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class MainPage {
   //private static final String HOMEPAGE_URL = "https://markformelle.by/";
   //private static final String HOMEPAGE_URL = "https://www.sportmaster.by/";

   private static final String HOMEPAGE_URL = "https://www.sportmaster.ru/";

    private final WebDriver driver;
//    @FindBy(xpath = "//footer")
//    private WebElement footer;

    @FindBy(xpath = "//footer")
    private WebElement footer;

//    @FindBy(xpath = "//a[@href='/info/kontakty/']")
//    private WebElement linkToContacts;

//    @FindBy(xpath = "//a[@href='/careers/']")
//        private WebElement linkToContacts;
    @FindBy(xpath = "//a[@href='https://job.sportmaster.ru/']")
    private WebElement linkToVakancy;

    @FindBy(xpath = "//a[@href='/vacancies/']")
    private WebElement linkToVakancySecond;

    @FindBy(xpath = "//a[@href='/vacancies/303447/']")
    private WebElement SelectJob;

//    @FindBy(xpath = "//a[@id='detected_town']")
//    private WebElement town;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void scrollToFooter(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(footer);
        actions.perform();
    }
    public void scrollToVakancy(){
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, -200);
        actions.moveToElement(linkToVakancy).click();
        actions.perform();
    }

    public void ToVakancySecond(){
        Actions actions = new Actions(driver);
        //actions.scrollByAmount(0, -200);
        actions.moveToElement(linkToVakancySecond).click();
        actions.perform();
    }

    public void scrollToJob() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.scrollToElement(SelectJob);
        //actions.scrollByAmount(0, -200);

        //actions.moveToElement(SelectJob).click();
//        actions.scrollByAmount(0, -200);
//        sleep(100);
//        actions.click(SelectJob);
        actions.perform();
    }

    public void clickToJob() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.click(SelectJob);
        actions.perform();
    }


}
