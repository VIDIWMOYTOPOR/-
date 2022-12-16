package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ManProductsPage extends AbstractPage {

    static final By colorListLocator = By.xpath("/html/body/div[8]/div[2]/div[3]/div/form/div/div[1]/ul/li[2]/div/div[1]/span");
    static final By sizeListLocator = By.xpath("/html/body/div[8]/div[2]/div[3]/div/form/div/div[1]/ul/li[3]/div/div[1]/span");
    static final By whiteColorLocator = By.xpath("/html/body/div[8]/div[2]/div[3]/div/form/div/div[1]/ul/li[2]/div/div[2]/ul/li[2]/label/span[1]");
    static final By sizeMLocator = By.xpath("/html/body/div[8]/div[2]/div[3]/div/form/div/div[1]/ul/li[3]/div/div[2]/ul/li[4]/label/span[1]");
    static final By clearFiltersLocator = By.xpath("/html/body/div[8]/div[3]/div[1]/a");


    public ManProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ManProductsPage colorListOpen(){
        WebElement color = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(colorListLocator));
        color.click();
        return this;
    }

    public ManProductsPage choseWhiteColor(){
        WebElement whiteColor = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(whiteColorLocator));
        whiteColor.click();
        return this;
    }

    public ManProductsPage sizeListOpen(){
        CustomDelay(4);
        WebElement sizeList = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sizeListLocator));
        sizeList.click();
        return this;
    }

    public ManProductsPage choseSizeM(){
        WebElement sizeM = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(sizeMLocator));
        sizeM.click();
        return this;
    }

    public  ManProductsPage clearFiltersClick(){
        WebElement clearFilters = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(clearFiltersLocator));
        clearFilters.click();
        return this;
    }
}
