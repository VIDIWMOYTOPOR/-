package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

import static java.lang.Thread.sleep;

public class SearchAccessoriesTest {
    private WebDriver driver;
    MainPage mainPage;

    @BeforeMethod
    public void driverSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void isNewPateCreated() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.openPage();
        //sleep(100);
        //mainPage.findTown();
        mainPage.scrollToFooter();
        mainPage.scrollToVakancy();
        mainPage.ToVakancySecond();
        sleep(2000);
        mainPage.scrollToJob();
        sleep(2000);
        mainPage.clickToJob();
    }

//    @AfterMethod(alwaysRun = true)
//    public void browserTearDown() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.quit();
//        driver = null;
//    }
}