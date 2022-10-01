import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class sanderClass {
    // Класс главной страницы
    static class GeneralPage {
        private final WebDriver driver;

        // локатор для кнопки заказать
        private final By orderClickButton = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/button[1]");
        // локатор для кнопки заказать (не в хэдере)
        private final By orderClickButtonFooter = By.xpath("/html/body/div/div/div/div[4]/div[2]/div[5]/button");

        // закрыть куки
        private final By cookClickButton = By.xpath("cookie /html/body/div/div/div[2]/div/div[2]/button");
        public GeneralPage(WebDriver driver){
            this.driver = driver;
        }
        public void buttonClick() {
            driver.findElement(orderClickButton).click();
        }

        public void buttonClickFooter() {
            driver.findElement(orderClickButtonFooter).click();
        }

        public void buttonCookieClick() {
            driver.findElement(cookClickButton).click();
        }
    }

    // Класс 1 cтраницы заказа
    static class RedactOrderList {
        private final WebDriver driver;
        // создай локатор для имени
        private final By nameUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input");
        // создай локатор для фамилии
        private final By lastNameUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input");
        // создай локатор для адреса
        private final By terUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");
        // создай локатор для телефона
        private final By mobileUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input");
        // создай локатор для метро
        private final By metroUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");

        public RedactOrderList (WebDriver driver){
            this.driver = driver;
        }

        // метод для проверки открытости поля «имя», удаления текста из неё и ввода нового значения из параметра
        public void pushRedactNameUser(){
            driver.findElement(nameUser).click();
            driver.findElement(nameUser).clear();
            driver.findElement(nameUser).sendKeys("Иван");
        }

        // метод для проверки открытости поля «фамилия», удаления текста из неё и ввода нового значения из параметра
        public void pushRedactLastNameUser(){
            driver.findElement(lastNameUser).click();
            driver.findElement(lastNameUser).clear();
            driver.findElement(lastNameUser).sendKeys("Иванов");
        }

        // метод для проверки открытости поля «адрес», удаления текста из неё и ввода нового значения из параметра
        public void pushRedactAdressUser(){
            driver.findElement(terUser).click();
            driver.findElement(terUser).clear();
            driver.findElement(terUser).sendKeys("москва");
        }

        // метод для проверки открытости поля «телефон», удаления текста из неё и ввода нового значения из параметра
        public void pushRedactPhoneUser(){
            driver.findElement(mobileUser).click();
            driver.findElement(mobileUser).clear();
            driver.findElement(mobileUser).sendKeys("89123655744");
        }

        // метод для проверки открытости поля «метро», удаления текста из неё и ввода нового значения из параметра
        public void pushRedactMetroUser(){
            driver.findElement(metroUser).click();
            By allMetroStation = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div[2]/ul/li");
            List<WebElement> elements = driver.findElements(allMetroStation);
            elements.get(1).click();
        }

        // метод для нажатия на кнопку далее
        public void buttonContinue(){
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/button")).click();
        }
    }

    // Класс 2 cтраницы заказа
    static class RedactOrderNextList {
        private final WebDriver driver;
        // создай локатор для времени привоза
        private final By userOrderTime = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/input");
        // создай локатор для конкретной даты
        private final By userOrderCalendar = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[5]");
        // создай локатор для срока аренды
        private final By userOrderDay = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div/div[1]");
        // создай локатор для срока аренды(конкретно)
        private final By userOrderDayCheck = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[4]");
        // создай локатор для цвета
        private final By colorUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[1]/input");
        // создай локатор для кнопки заказать
        private final By buttonCheckOrder = By.xpath("/html/body/div/div/div[2]/div[3]/button[2]");

        public RedactOrderNextList (WebDriver driver){
            this.driver = driver;
        }

        // метод для выбора времени аренды
        public void pushOrderTime(){
            driver.findElement(userOrderTime).click();
            driver.findElement(userOrderCalendar).click();
        }

        // метод для выбора срока аренды
        public void pushOrderDay(){
            driver.findElement(userOrderDay ).click();
            driver.findElement(userOrderDayCheck).click();
        }

        // метод для выбора цвета
        public void pushUserColor(){
            driver.findElement(colorUser).click();
        }

        // метод для кнопки заказать
        public void pushButtonCheckOrder(){
            driver.findElement(buttonCheckOrder).click();
        }

    }

    // Класс cтраницы подтверждения
    static class CorrectOrder {
        private final WebDriver driver;
        // создай локатор для кнопки да
        private final By userYesButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]");


        public CorrectOrder (WebDriver driver){
            this.driver = driver;
        }

        // метод для выбора времени аренды
        public void yesButtonClick(){
            driver.findElement(userYesButton).click();
        }

    }

    // Класс страницы с информацией о заказе
    static class StatusUserOrder {
        private final WebDriver driver;
        // кнопка посмотреть статус
        private final By buttonStatusOrder = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button");
        // создай локатор для имени
        private final By statusUserName = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[1]/div[2]");
        private final By nameUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input");

        // создай локатор для фамилии
        private final By statusLastUserName = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[2]/div[2]");
        private final By lastNameUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input");

        // создай локатор для адреса
        private final By statusAdressUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[3]/div[2]");
        private final By terUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");

        // создай локатор для метро
        private final By statusMetroUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[4]/div[2]");
        private final By metroUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");

        // создай локатор для телефона
        private final By statusPhoneUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[5]/div[2]");
        private final By mobileUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input");

        // создай локатор для даты доставки
        private final By statusTimeUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[7]/div[2]");
        private final By userOrderCalendar = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[5]");

        // создай локатор для срока аренды
        private final By statusDayUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[8]/div[2]");
        private final By userOrderDayCheck = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[4]");

        // создай локатор для цвета
        private final By statusColorUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div[10]/div[2]");
        private final By colorUser = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/label[1]/input");

        public StatusUserOrder (WebDriver driver){
            this.driver = driver;
        }

        // метод для сравнения имен
        public void clickButtonStatusOrder(){
            driver.findElement(buttonStatusOrder).click();

        }

        // метод для сравнения имен
        public void checkUsersNames(){
            String b = driver.findElement(statusUserName).getText();
            String a = driver.findElement(nameUser).getText();
            Assert.assertEquals(a, b);
        }

        // метод для сравнения фамилии
        public void checkLastUsersNames(){
            String b = driver.findElement(statusLastUserName).getText();
            String a = driver.findElement(lastNameUser).getText();
            Assert.assertEquals(a, b);
        }

        // метод для сравнения адреса
        public void checkAdressUser(){
            String b = driver.findElement(statusAdressUser).getText();
            String a = driver.findElement(terUser).getText();
            Assert.assertEquals(a, b);
        }

        // метод для сравнения метро
        public void checkMetroUser(){
            String b = driver.findElement(statusMetroUser).getText();
            String a = driver.findElement(metroUser).getText();
            Assert.assertEquals(a, b);
        }

        // метод для сравнения телефонов
        public void checkPhoneUser(){
            String b = driver.findElement(statusPhoneUser).getText();
            String a = driver.findElement(mobileUser).getText();
            Assert.assertEquals(a, b);
        }

        // метод для сравнения времени заказа
        public void checkTimeUser(){
            String b = driver.findElement(statusTimeUser).getText();
            String a = driver.findElement(userOrderCalendar).getText();
            Assert.assertEquals(a, b);
        }

        // метод для сравнения срок аренды
        public void checkDayUser(){
            String b = driver.findElement(statusDayUser).getText();
            String a = driver.findElement(userOrderDayCheck ).getText();
            Assert.assertEquals(a, b);
        }

        // метод для сравнения цвета
        public void checkColorUser(){
            String b = driver.findElement(statusColorUser).getText();
            String a = driver.findElement(colorUser).getText();
            Assert.assertEquals(a, b);
        }

    }


}
