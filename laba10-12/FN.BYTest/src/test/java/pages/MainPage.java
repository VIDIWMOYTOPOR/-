package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage {
    private static final String HOMEPAGE_URL = "https://fh.by/";
    // private final WebDriver driver;

    private final By footerLocator = By.xpath("//footer");
    private final By contactsLocator = By.xpath("/html/body/footer/div/div[1]/div[4]/div[2]/ul/li[3]/a");
    private final By searchValue = By.xpath("//input[@class='search-active-desc']");



    private final By ManLocator = By.xpath("/html/body/div[2]/div/main/div/ul/li[3]/a");
    private final By MansClothesLocator = By.xpath("/html/body/div[2]/div/main/div[2]/div/div[4]/div[2]/div[3]/ul/li[1]/div/span/span/a/span[1]/span[1]");
    private final By MansClothesChooseLocator = By.xpath("/html/body/div[2]/div/main/div[2]/div/div[4]/div[2]/div[3]/ul/li[1]/div/span/span/a/header/span[2]/picture/img\n");
    private final By CloseWindow = By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[3]");
    private final By ShoosesizeLocator = By.xpath("/html/body/div[2]/div/main/div[2]/section/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/div\n");
    private final By Shoose50sizeLocator = By.xpath("/html/body/reach-portal/div[2]/div/div/div/ul/li[1]/div");
    private final By ToBasketLocator = By.xpath("/html/body/div[2]/div/main/div[2]/section/div/div[3]/div[2]/div[1]/div[5]/div/button\n");
    private final By ToBasketButtonLocator = By.xpath("/html/body/div[2]/div/header/div/div/div[3]/a[3]");
    private final By ToFavoriteButtonLocator = By.xpath("/html/body/div[2]/div/main/div[2]/section/div/div[3]/div[2]/div[1]/div[5]/button");


    private final By RichLocator = By.xpath("/html/body/div[3]/div/div/div[2]/div[4]/label/span");
    private final By RichClickLocator = By.xpath("/html/body/div[2]/div/main/div[2]/div/div[4]/div[2]/div[1]/div[2]/button");
    private final By RichShowLocator = By.xpath("/html/body/div[3]/div/div/div[3]/button\n");


    private final By filter = By.xpath("/html/body/div[2]/div/main/div[2]/div/div[4]/div[2]/div[1]/div[1]/button/span/span\n");
    private final By Color = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[3]/div/div\n");
    private final By white_color = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[3]/div[2]/div/div/div/div/div[2]/label/span[1]");

    private final By Price = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div/div\n");
    private final By Price_from = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div/div/label[1]/div/input\n");
    private final By Price_to = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div/div/label[2]/div/input\n");

    private final By Search = By.xpath("/html/body/div[2]/div/header/div/div/div[3]/button/span\n");
    private final By Search_text = By.xpath("/html/body/div[2]/div/header/div/div/div[3]/div[2]/form/input\n");
    private final By Click_Search_text = By.xpath("/html/body/div[2]/div/header/div/div/div[3]/div[2]/div/ul/li/a/div[2]/p");

    private final By stock = By.xpath("/html/body/div[2]/div/footer/div/div[1]/ul/li[2]\n");
    private final By Black_Friday = By.xpath("/html/body/div[2]/div/main/section/div/ul[1]/li[1]/a/h3");


    private final By Brend = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div\n");
    private final By Boss_Brend = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[4]/label/span[1]\n");
    private final By Show_filter = By.xpath("/html/body/div[3]/div/div/div[3]/button/span");


    private final By magazine_adress = By.xpath("/html/body/div[2]/div/footer/div/div[3]/ul/li[5]");
    private final By On_map = By.xpath("/html/body/div[2]/div/main/section/div[2]/div/div[2]/div/div/div/div[2]/div/p[9]/a\n");

    private final By news = By.xpath("/html/body/div[2]/div/footer/div/div[1]/ul/li[1]");
    private final By news_snow = By.xpath("/html/body/div[2]/div/main/section/div/ul[1]/li[1]\n");

    private final By bestSellersLocator = By.xpath("//a[@href='/catalog/muzhchinam/sale-leaders/']");
    private final By spamLocator = By.xpath("//*[@id=\"popmechanic-form-45978\"]/div");
    private final By socksLocator = By.xpath("/html/body/div[5]/div/div[1]/div[3]/ul/li[4]/ul/li[4]/a/span");

    private final By socksPageLocator = By.xpath("/html/body/div[5]/div/div[1]/div[3]/ul/li[4]/ul/li[4]/ul/li[1]/a");
    private final By allProductsForMansLocator = By.xpath("/html/body/div[5]/div/div[1]/div[3]/ul/li[4]/ul/li[1]/a");



    // private final By spamLocator = By.xpath("//div[@class='popmechanic-close");

//    @FindBy(xpath = "//footer")
//    private WebElement footer;
    // @FindBy(xpath = "//a[@href='/info/kontakty/']")
    //  private WebElement contacts;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        driver.manage().window();
        return this;
    }

    public MainPage scrollToFooter() throws InterruptedException {
        WebElement footer = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(footerLocator));
        Actions actions = new Actions(driver);
        actions.scrollToElement(footer);
        actions.scrollByAmount(0, -200);
        actions.perform();
        logger.info("scrolled to footer");
        return this;
        // footer.click();
    }

    public ContactPage clickToContacts() throws InterruptedException {
        WebElement contacts = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(contactsLocator));
        contacts.click();
        logger.info("contact page opened");
        return new ContactPage(driver);
    }

    public SearchPage getProductPage(String value) throws InterruptedException {
        WebElement search = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(searchValue));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
        return new SearchPage(driver);
    }
    public MainPage ManOpen(){
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(ManLocator));
        catalog.click();
        return this;
    }
    public MainPage ManClotesClick(){
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(MansClothesLocator));
        catalog.click();
        return this;
    }


    public MainPage ManClotesChooseClick(){

        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(MansClothesChooseLocator));
        catalog.click();
        //CustomDelay(20);
        return this;

    }
    public MainPage CloseBadWindow() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(CloseWindow));
        catalog.click();
        return this;
    }
    public MainPage ChooseSize() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(ShoosesizeLocator));
        catalog.click();
        return this;
    }

    public MainPage Choose50Size() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Shoose50sizeLocator));
        catalog.click();
        return this;
    }

    public MainPage BasketClick() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(ToBasketLocator));
        catalog.click();
        return this;
    }

    public MainPage BasketButtonClick() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(ToBasketButtonLocator));
        catalog.click();
        return this;
    }

    public MainPage RichClickSorted() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(RichClickLocator));
        catalog.click();
        return this;
    }
    public MainPage RichSorted() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(RichLocator));
        catalog.click();

        return this;
    }

    public MainPage Filter() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(filter));
        catalog.click();

        return this;
    }

    public MainPage color() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Color));
        catalog.click();

        return this;
    }

    public MainPage White_color() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(white_color));
        catalog.click();

        return this;
    }


    public MainPage brend() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Brend));
        catalog.click();

        return this;
    }

    public MainPage boss_brend() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Boss_Brend));
        catalog.click();

        return this;
    }

    public MainPage show_filter() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Show_filter));
        catalog.click();

        return this;
    }

    public MainPage Magazine_Adress() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(magazine_adress));
        catalog.click();

        return this;
    }
    public MainPage on_map() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(On_map));
        catalog.click();

        return this;
    }


    public MainPage News() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(news));
        catalog.click();

        return this;
    }

    public MainPage News_snow() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(news_snow));
        catalog.click();

        return this;
    }



    public MainPage search() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Search));
        catalog.click();

        return this;
    }

    public MainPage price() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Price));
        catalog.click();

        return this;
    }

    public MainPage Price_From() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Price_from));
        catalog.click();
        catalog.sendKeys("0");

        return this;
    }
    public MainPage Price_To() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Price_to));
        catalog.click();
        catalog.sendKeys("10000");

        return this;
    }

    public MainPage search_text() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Search_text));
        catalog.click();
        catalog.sendKeys("Кепка из кашемира с шерстяной подкладкой\n");

        return this;
    }

    public MainPage click_search() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Click_Search_text));
        catalog.click();

        return this;
    }

    public MainPage Stock() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(stock));
        Actions actions = new Actions(driver);
        actions.scrollToElement(catalog);
        catalog.click();

        return this;
    }

    public MainPage black_friday() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(Black_Friday));

        catalog.click();

        return this;
    }

    public MainPage RichShowSorted() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(RichShowLocator));
        catalog.click();

        return this;
    }
    //BasketPage

    private final By ClearBasketButtonLocator = By.xpath("    /html/body/div[2]/div/main/section/div[2]/div/div[1]/ul/li/a/div[2]/div[2]/button[2]\n");

    public MainPage ClearBasketButtonClick() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(ClearBasketButtonLocator));
        catalog.click();
        return this;
    }

    //BasketPage

    public MainPage ToFavoriteButtonClick() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(ToFavoriteButtonLocator));
        catalog.click();
        return this;
    }

    //FavoritePage

    private final By ToFavoriteLocator = By.xpath("/html/body/div[2]/div/main/div[2]/div/div[4]/div[2]/div[3]/ul/li[1]/div/span/span/a/header/button");

    public MainPage ClickToFavorite() {
        //CustomDelay(20);
        WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(ToFavoriteLocator));
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, -200);
        actions.scrollToElement(catalog);
        catalog.click();
        return this;
    }

    //FavoritePage

    public MainPage closeSpam(){
        CustomDelay(20);
        WebElement spam = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(spamLocator));
        spam.click();
        return this;
    }

    public ManBestSellersPage bestSellersPageOpen(){
        WebElement bestSellers = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(bestSellersLocator));
        bestSellers.click();
        return new ManBestSellersPage(driver);
    }

    public MainPage socksClick(){
        WebElement socks = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(socksLocator));
        socks.click();
        return this;
    }

    public SocksPage socksPageOpen(){
        WebElement socksPage = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(socksPageLocator));
        socksPage.click();
        return new SocksPage(driver);
    }

    public ManProductsPage allProductsForMansOpen(){
        WebElement allProductsForMans = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(allProductsForMansLocator));
        allProductsForMans.click();
        return new ManProductsPage(driver);
    }

}
