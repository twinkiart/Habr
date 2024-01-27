package Page;
import AllureStuf.AllureLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;


public class HabrPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(HabrPage.class));

    private final WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Все потоки')]")
    private WebElement allflowsButton;
    @FindBy(xpath = "//a[contains(text(), 'Технотекст')]")
    private WebElement texnotextButton;
    @FindBy(xpath = "//*[contains(@href, 'Twitter')]")
    private WebElement twitterButton;
    @FindBy(xpath = "//a[contains(text(), 'Техническая поддержка')]")
    private WebElement supportButton;
    @FindBy(xpath = "//a[contains(text(), '50')]")
    private WebElement lastPage;
    @FindBy(xpath = "//a[contains(text(), 'Как стать автором')]")
    private WebElement autorButton;
    @FindBy(xpath = "//a[contains(@href, 'youtube')]")
    private WebElement YoutubeLink;
    @FindBy(xpath = "//a[contains(text(), 'Войти')]")
    private WebElement LoginLink;
    @FindBy(xpath = "//a[contains(text(), 'Регистрация')]")
    private WebElement SignUp;
    @FindBy(xpath = "//a[contains(text(), 'Конфиденциальность')]")
    private WebElement Privacy;
    @FindBy(xpath = "//a[contains(text(), 'Нативные проекты')]")
    private  WebElement Native;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[3]/div/div/div[4]/div/ul/li[5]/a")
    private WebElement StartUp;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[3]/div/div/div[4]/div/ul/li[2]/a")
    private WebElement Media;
    @FindBy(xpath = "//a[contains(text(), 'Документы')]")
    private WebElement Docum;
    @FindBy(xpath = "//a[contains(text(), 'Хабы')]")
    private WebElement HubButton;
    @FindBy(xpath = "//a[contains(text(), 'Разработка')]")
    private WebElement Develop;
    @FindBy(xpath = "//a[contains(text(), 'Соглашение')]")
    private WebElement Agree;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[4]/div/div/div[1]/a[3]")
    private WebElement vKButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[4]/div/div/div[1]/a[6]")
    private WebElement clickYandex;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[4]/div/div/div[1]/a[4]")
    private WebElement clickTelegram;

    public HabrPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public String getText(){
        return driver.findElement(By.tagName("body")).getText();
    }

    public void clickAllFlows(){
        allflowsButton.click();
        LOG.info("Кликнули по кнопке Все потоки");
    }
    public void clickTexnoText(){
        texnotextButton.click();
        LOG.info("Кликнули по кнопке Технотекст");
    }
    public void clickTwitter(){
        twitterButton.click();
        LOG.info("Кликнули по кнопке Twitter");
    }
    public void clickSupport(){
        supportButton.click();
        LOG.info("Кликнули по кнопке Support");
    }
    public void clickLastPage(){
        lastPage.click();
        LOG.infoWithScreenshot("Кликнули на 50 страницу");
    }
    public void clickAutorButton(){
        autorButton.click();
        LOG.infoWithScreenshot("Кликнули по кнопке Как стать автором");
    }
    public void clickYoutubeButton(){
        YoutubeLink.click();
        LOG.infoWithScreenshot("Кликнули по иконке Youtube");
    }
    public void clickLogin(){
        LoginLink.click();
        LOG.infoWithScreenshot("Кликнули по кнопке войти");
    }
    public Boolean checkLoginButton(){
        LOG.infoWithScreenshot("кликнули по кнопке");
        return LoginLink.isEnabled();
    }
    public void clickRegistrationButton(){
        SignUp.click();
        LOG.infoWithScreenshot("Кликнули на кнопку регистрации");
    }
    public Boolean checkRegistrationbutton(){
        LOG.infoWithScreenshot("кликнули по кнопке");
        return SignUp.isEnabled();
    }
    public void clickPrivacy(){
        Privacy.click();
        LOG.infoWithScreenshot("Кликнули на кнопку приватности");
    }
    public Boolean checkprivacybutton(){
        LOG.infoWithScreenshot("кликнули по кнопке");
        return Privacy.isEnabled();
    }
    public void clickNativeProject(){
        Native.click();
        LOG.infoWithScreenshot("кликнули по кнопке Нативные проекты");

    }
    public Boolean checkNativeButton(){
        LOG.infoWithScreenshot("кликнули по кнопке");
        return Native.isEnabled();
    }
    public void clickStartUp(){
        StartUp.click();
        LOG.infoWithScreenshot("кликнули по кнопке StartUp");
    }
        public Boolean checkIfStartUpButtonIsClickable(){
        StartUp.click();
        LOG.infoWithScreenshot("кликнули по кнопке StartUp");
            return StartUp.isEnabled();
        }

    public void clickMedia(){
        Media.click();
        LOG.infoWithScreenshot("Кликнули по кнопке Медиа Рекламы");
    }
    public Boolean checkIfButtonIsClickable(){
        LOG.infoWithScreenshot("Проверка активности кнопки");
        return Media.isEnabled();
    }

    public void documentClick(){
        Docum.click();
        LOG.infoWithScreenshot("Кликнули по кнопке документов");
    }
    public Boolean checkIfDocumentIsClickabel(){
        LOG.infoWithScreenshot("Проверка активности кнопки");
        return Docum.isEnabled();
    }

    public void clickHub(){
        HubButton.click();
        LOG.infoWithScreenshot("кликнули по кнопке Хабы");
    }
    public Boolean checkIfHubButtonIsClickabel(){
        LOG.infoWithScreenshot("Проверка активности кнопки");
        return HubButton.isEnabled();
    }
    public void clickDevelop(){
        Develop.click();
        LOG.infoWithScreenshot("Кликнули по кнопке разработки");
    }
    public Boolean checkDevButtonIsWork(){
        LOG.infoWithScreenshot("Проверка активности кнопки");
        return Develop.isEnabled();
    }
    public void clickAgreement(){
        Agree.click();
        LOG.infoWithScreenshot("Проверка активности кнопки");
    }
    public Boolean checkAgreeButton(){
        LOG.infoWithScreenshot("Проверка активности кнопки");
        return Agree.isEnabled();
    }
    public void clickVK(){
        vKButton.click();
        LOG.infoWithScreenshot("Проверка активности кнопки");
    }
    public Boolean checkVKbuttonIsWork(){
        LOG.infoWithScreenshot("Проверка активности кнопки");
        return vKButton.isEnabled();
    }
    public void clickYandex(){
        clickYandex.click();
        LOG.infoWithScreenshot("Проверка активности кнопоки Яндекс");
    }
    public Boolean checkYandexButtonIsWork(){
        LOG.infoWithScreenshot("Проверка активности кнопки");
        return clickYandex.isEnabled();
    }
    public void clickTelegram(){
        clickTelegram.click();
        LOG.infoWithScreenshot("Проверка активности кнопоки Telegram");
    }
    public boolean telegramButtonIsWork(){
        LOG.infoWithScreenshot("Проверка активности кнопки");
        return clickTelegram.isEnabled();
    }


    public String getCurrUrl() {
        return driver.getCurrentUrl();
    }
}

