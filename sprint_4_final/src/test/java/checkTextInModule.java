import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class checkTextInModule extends sanderClass{

        private WebDriver driver;

    @Before //перед каждым тестом открываем страницу и скроллим её до элементов + ждём пока они прогрузятся
        public void checkTextSamocat() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
            Object elementQuestions = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[1]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementQuestions);
            new WebDriverWait(driver, Duration.ofSeconds(3))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[1]/div")));

        }

        @Test  //проверяем текст первой кнопки
        public void checkText0() {
        driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[1]/div")).click();
            String forText = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]/p")).getText();
            assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", forText);
        }
        @Test //проверяем текст во второй кнопке
        public void checheckText1() {
        driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/div[1]/div")).click();
            String forText1 = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/div[2]/p")).getText();
            assertEquals("Пока что у нас так: один заказ — один самокат. " +
                    "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", forText1);
        }
        @Test  //проверяем текст в третьей кнопке
        public void checheckText2() {
            driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]/div[1]/div")).click();
            String forText2 = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]/div[2]/p")).getText();
            assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                    "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
                    " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", forText2);
        }
        @Test  //проверяем текст в четвертой кнопке
        public void checheckText3() {
            driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]/div[1]/div")).click();
            String forText3 = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]/div[2]/p")).getText();
            assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.", forText3);
        }
        @Test  //проверяем текст в пятой кнопке
        public void checheckText4() {
            driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]/div[1]/div")).click();
            String forText4 = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]/div[2]/p")).getText();
            assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", forText4);
        }
        @Test  //проверяем текст в шестой кнопке
        public void checheckText5() {
            driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]/div[1]/div")).click();
            String forText5 = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]/div[2]/p")).getText();
            assertEquals("Самокат приезжает к вам с полной зарядкой." +
                    " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", forText5);
        }
        @Test  //проверяем текст в седьмой кнопке
        public void checheckText6() {
            driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]/div[1]/div")).click();
            String forText6 = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]/div[2]/p")).getText();
            assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", forText6);
        }
        @Test  //проверяем текст в восьмой кнопке
        public void checheckText7() {
            driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]/div[1]/div")).click();
            String forText7 = driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]/div[2]/p")).getText();
            assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.", forText7);
        }
    @After
        public void checkTextClose () {
        driver.quit();
        }

    }
