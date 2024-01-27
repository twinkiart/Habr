package Test;
import AllureStuf.AllureAttachmentsManager;
import AllureStuf.MyExtension;
import Page.HabrPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.print.attribute.standard.Media;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@ExtendWith(MyExtension.class)
public class HabrTest extends MainTest {
    private HabrPage habrPage;

    @BeforeEach
    @Override
    @Step("Тест ссылок на странице Habr: ")
    public void setUp() {
        super.setUp();
        driver.get("https://habr.com/ru/feed");
        habrPage = new HabrPage(driver);
    }

    @Test
    @DisplayName("Кликнули по кнопке Все потоки: ")
    public void allFlowCheck(){
        habrPage.clickAllFlows();
        assertEquals("https://habr.com/ru/all/", habrPage.getCurrUrl(), "Не перешли на https://habr.com/ru/all/");
        String pageTest = habrPage.getText();
        assertTrue(pageTest.contains(" Все потоки "),"Текст  Все потоки  не найден на странице");
    }
    @Test
    @DisplayName("Кликнули по кнопке Технотекст")
    public void texnoTextCheck(){
        habrPage.clickTexnoText();
        assertEquals("https://technotext.habr.com/?utm_source=ft", habrPage.getCurrUrl(),"Не перешли на сайт");
        String pageTest = habrPage.getText();
        assertTrue(pageTest.contains(" + правила "),"Текст  + правила  не найден на странице");
    }
    @Test
    @DisplayName("Кликнули по кнопке Twitter")
    public void twitterCheck(){
        habrPage.clickTwitter();
        assertEquals("https://twitter.com/habr_com",habrPage.getCurrUrl(),"Не перешли на сайт");
    }
    @Test
    @DisplayName("Кликнули по кнопке Поддержка")
    public void supportCheck(){
        habrPage.clickSupport();
        assertEquals("https://habr.com/ru/feedback/",habrPage.getCurrUrl(),"Не перешли на страницу поддержки");
        String pageTest = habrPage.getText();
        assertTrue(pageTest.contains(" Укажите тему обращения: "),"Текст  Укажите тему обращения:  не найден на странице");
    }
    @Test
    @DisplayName("Кликнули на 50 страницу")
    public void lstPageCheck(){
        habrPage.clickLastPage();
        assertEquals("https://habr.com/ru/feed/page50/",habrPage.getCurrUrl(),"Не перешли на 50-ю страницу");
    }
    @Test
    @DisplayName("Кликнули на Как стать автором")
    public void autorButtonCheck(){
        habrPage.clickAutorButton();
        assertEquals("https://habr.com/ru/sandbox/start/", habrPage.getCurrUrl(),"Не перешли на страницу");
    }
    @Test
    @DisplayName("Youtube")
    public void youtubeLink(){
        habrPage.clickYoutubeButton();
        assertEquals("https://www.youtube.com/channel/UCd_sTwKqVrweTt4oAKY5y4w",habrPage.getCurrUrl(),"Не перешли в Ютуб");
    }
    @Test
    @DisplayName("LogIn")
    public void loginClick(){
        habrPage.clickLogin();
        assertTrue(habrPage.checkLoginButton(),"кнопка не активна");
    }
    @Test
    @DisplayName("Проверка кнопки регистрации")
    public void clickRegistrationButton(){
        habrPage.clickRegistrationButton();
        assertTrue(habrPage.checkRegistrationbutton(),"кнопка не активна");
    }
    @Test
    @DisplayName("Проверка кнопки Конфиденциальность")
    public void clickPrivacy(){
        habrPage.clickPrivacy();
        assertTrue(habrPage.checkprivacybutton(),"кнопка не активна");

    }
    @Test
    @DisplayName("Проверка кнопки Нативные проекты")
    public void clickNativeProject(){
        habrPage.clickNativeProject();
        assertTrue(habrPage.checkNativeButton(),"кнопка не активна");
    }
    @Test
    @DisplayName("Тест ссылки На услуги Стартапам")
    public void clickStartUp(){
        habrPage.clickStartUp();
        assertTrue(habrPage.checkIfStartUpButtonIsClickable(), "Кнопка не активна");
    }
    @Test
    @DisplayName("Тест ссылки на Медейную рекламу")
    public void clickMedia(){
        habrPage.clickMedia();
        assertTrue(habrPage.checkIfButtonIsClickable(), "Кнопка не активна");
    }
    @Test
    @DisplayName("Тест кнопки Документы")
    public void clickDocument(){
        habrPage.documentClick();
        assertTrue(habrPage.checkIfDocumentIsClickabel(),"Кнопка не активна");
    }
    @Test
    @DisplayName("Тест Кнопки Хабы")
    public void clickHub(){
        habrPage.clickHub();
        assertTrue(habrPage.checkIfHubButtonIsClickabel(),"Кнопка не активна");
    }
    @Test
    @DisplayName("Тест кнопки разработки")
    public void clickDevelop(){
        habrPage.clickDevelop();
        assertTrue(habrPage.checkDevButtonIsWork(),"Кнопка не активна");
    }
    @Test
    @DisplayName("Тест кнопки Соглашение")
    public void clickAgreement(){
        habrPage.clickAgreement();
        assertTrue(habrPage.checkAgreeButton(),"Кнопка не активна");
    }
    @Test
    @DisplayName("Тест кнопки VK")
    public void clickVK(){
        habrPage.clickVK();
        assertTrue(habrPage.checkVKbuttonIsWork(),"Кнопка не активна");
    }
    @Test
    @DisplayName("Тест кнопки ЯндексДзен")
    public void clickYandex(){
        habrPage.clickYandex();
        assertTrue(habrPage.checkYandexButtonIsWork(),"Кнопка не активна");
    }
    @Test
    @DisplayName("Тест кнопки telegram")
    public void clickTelegram(){
        habrPage.clickTelegram();
        assertTrue(habrPage.telegramButtonIsWork(),"Кнопка не активна");
    }
}