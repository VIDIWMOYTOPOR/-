package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class BasketPage extends AbstractPage {

    static final By deleteButtonLocator = By.xpath("//a[@data-entity='basket-item-delete']");
    private final By ClearBasketButtonLocator = By.xpath("    /html/body/div[2]/div/main/section/div[2]/div/div[1]/ul/li/a/div[2]/div[2]/button[2]\n");

    public BasketPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public BasketPage scrollToDeleteButton() {
        WebElement deleteButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(deleteButtonLocator));
        Actions actions = new Actions(driver);
        actions.scrollToElement(deleteButton);
        actions.perform();
        return this;
    }

    public BasketPage DeleteButtonClick() throws InterruptedException {
        WebElement deleteButton = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(deleteButtonLocator));
        deleteButton.click();
        return this;
    }
}
