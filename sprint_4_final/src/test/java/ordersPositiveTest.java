import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ordersPositiveTest extends sanderClass{
    private WebDriver driver;
    @Test
    public void checkOrdersInHeader() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //ожидание открытия страницы
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/button[1]")));
        //клик по кнопке заказать
        GeneralPage objGeneralPage = new GeneralPage(driver);
        objGeneralPage.buttonClick();
        //заполнение первой страницы заказа
        RedactOrderList objRedactOrderList = new RedactOrderList(driver);
        objRedactOrderList.pushRedactNameUser();
        objRedactOrderList.pushRedactLastNameUser();
        objRedactOrderList.pushRedactAdressUser();
        objRedactOrderList.pushRedactPhoneUser();
        objRedactOrderList.pushRedactMetroUser();
        objRedactOrderList.buttonContinue();
        //заполнение второй страницы заказа
        RedactOrderNextList objRedactOrderNextList= new RedactOrderNextList(driver);
        objRedactOrderNextList.pushOrderTime();
        objRedactOrderNextList.pushOrderDay();
        objRedactOrderNextList.pushUserColor();
        objRedactOrderNextList.pushButtonCheckOrder();
        //подтверждение заказа
        CorrectOrder objCorrectOrder= new CorrectOrder(driver);
        objCorrectOrder.yesButtonClick();
        //сравнение вводимой информации и выданной
        StatusUserOrder objStatusUserOrder= new StatusUserOrder(driver);
        objStatusUserOrder.clickButtonStatusOrder();
        objStatusUserOrder.checkUsersNames();
        objStatusUserOrder.checkLastUsersNames();
        objStatusUserOrder.checkAdressUser();
        objStatusUserOrder.checkMetroUser();
        objStatusUserOrder.checkPhoneUser();
        objStatusUserOrder.checkTimeUser();
        objStatusUserOrder.checkDayUser();
        objStatusUserOrder.checkColorUser();

    }

    @Test
    public void checkOrdersInHeaderFireFox() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //ожидание открытия страницы
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/button[1]")));
        //клик по кнопке заказать
        GeneralPage objGeneralPage = new GeneralPage(driver);
        objGeneralPage.buttonClick();
        //заполнение первой страницы заказа
        RedactOrderList objRedactOrderList = new RedactOrderList(driver);
        objRedactOrderList.pushRedactNameUser();
        objRedactOrderList.pushRedactLastNameUser();
        objRedactOrderList.pushRedactAdressUser();
        objRedactOrderList.pushRedactPhoneUser();
        objRedactOrderList.pushRedactMetroUser();
        objRedactOrderList.buttonContinue();
        //заполнение второй страницы заказа
        RedactOrderNextList objRedactOrderNextList= new RedactOrderNextList(driver);
        objRedactOrderNextList.pushOrderTime();
        objRedactOrderNextList.pushOrderDay();
        objRedactOrderNextList.pushUserColor();
        objRedactOrderNextList.pushButtonCheckOrder();
        //подтверждение заказа
        CorrectOrder objCorrectOrder= new CorrectOrder(driver);
        objCorrectOrder.yesButtonClick();
        //сравнение вводимой информации и выданной
        StatusUserOrder objStatusUserOrder= new StatusUserOrder(driver);
        objStatusUserOrder.clickButtonStatusOrder();
        objStatusUserOrder.checkUsersNames();
        objStatusUserOrder.checkLastUsersNames();
        objStatusUserOrder.checkAdressUser();
        objStatusUserOrder.checkMetroUser();
        objStatusUserOrder.checkPhoneUser();
        objStatusUserOrder.checkTimeUser();
        objStatusUserOrder.checkDayUser();
        objStatusUserOrder.checkColorUser();

    }

    @Test
    public void checkOrdersInFooter() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //ожидание открытия страницы
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[4]/div[2]/div[5]/button")));
        //клик по кнопке заказать
        GeneralPage objGeneralPage = new GeneralPage(driver);
        objGeneralPage.buttonCookieClick();
        objGeneralPage.buttonClickFooter();
        //заполнение первой страницы заказа
        RedactOrderList objRedactOrderList = new RedactOrderList(driver);
        objRedactOrderList.pushRedactNameUser();
        objRedactOrderList.pushRedactLastNameUser();
        objRedactOrderList.pushRedactAdressUser();
        objRedactOrderList.pushRedactPhoneUser();
        objRedactOrderList.pushRedactMetroUser();
        objRedactOrderList.buttonContinue();
        //заполнение второй страницы заказа
        RedactOrderNextList objRedactOrderNextList= new RedactOrderNextList(driver);
        objRedactOrderNextList.pushOrderTime();
        objRedactOrderNextList.pushOrderDay();
        objRedactOrderNextList.pushUserColor();
        objRedactOrderNextList.pushButtonCheckOrder();
        //подтверждение заказа
        CorrectOrder objCorrectOrder= new CorrectOrder(driver);
        objCorrectOrder.yesButtonClick();
        //сравнение вводимой информации и выданной
        StatusUserOrder objStatusUserOrder= new StatusUserOrder(driver);
        objStatusUserOrder.clickButtonStatusOrder();
        objStatusUserOrder.checkUsersNames();
        objStatusUserOrder.checkLastUsersNames();
        objStatusUserOrder.checkAdressUser();
        objStatusUserOrder.checkMetroUser();
        objStatusUserOrder.checkPhoneUser();
        objStatusUserOrder.checkTimeUser();
        objStatusUserOrder.checkDayUser();
        objStatusUserOrder.checkColorUser();

    }

    @Test
    public void checkOrdersInFooterFireFox() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        //ожидание открытия страницы
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[4]/div[2]/div[5]/button")));
        //клик по кнопке заказать
        GeneralPage objGeneralPage = new GeneralPage(driver);
        objGeneralPage.buttonCookieClick();
        objGeneralPage.buttonClickFooter();
        //заполнение первой страницы заказа
        RedactOrderList objRedactOrderList = new RedactOrderList(driver);
        objRedactOrderList.pushRedactNameUser();
        objRedactOrderList.pushRedactLastNameUser();
        objRedactOrderList.pushRedactAdressUser();
        objRedactOrderList.pushRedactPhoneUser();
        objRedactOrderList.pushRedactMetroUser();
        objRedactOrderList.buttonContinue();
        //заполнение второй страницы заказа
        RedactOrderNextList objRedactOrderNextList= new RedactOrderNextList(driver);
        objRedactOrderNextList.pushOrderTime();
        objRedactOrderNextList.pushOrderDay();
        objRedactOrderNextList.pushUserColor();
        objRedactOrderNextList.pushButtonCheckOrder();
        //подтверждение заказа
        CorrectOrder objCorrectOrder= new CorrectOrder(driver);
        objCorrectOrder.yesButtonClick();
        //сравнение вводимой информации и выданной
        StatusUserOrder objStatusUserOrder= new StatusUserOrder(driver);
        objStatusUserOrder.clickButtonStatusOrder();
        objStatusUserOrder.checkUsersNames();
        objStatusUserOrder.checkLastUsersNames();
        objStatusUserOrder.checkAdressUser();
        objStatusUserOrder.checkMetroUser();
        objStatusUserOrder.checkPhoneUser();
        objStatusUserOrder.checkTimeUser();
        objStatusUserOrder.checkDayUser();
        objStatusUserOrder.checkColorUser();

    }

    @After
    public void teardown() {
        driver.quit();
    }
}
